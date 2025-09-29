package entidades;

import interfaces.Calculo;

public final class Pj extends Contribuinte implements Calculo {

	private String cnpj;

	public Pj(String nome, String cnpj, double salario) {
		super(nome, salario);
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return (this.getSalario() * 0.10);
	}
	
	public void mostra() {
		System.out.println(super.nome);
		System.out.println(super.salario);
		System.out.println(this.cnpj);
		System.out.println(this.calcularImposto());
	}
}
