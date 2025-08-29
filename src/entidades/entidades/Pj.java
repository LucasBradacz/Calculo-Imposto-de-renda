package entidades;

public final class Pj extends Contribuinte {

	private final String cnpj;

	public Pj(String nome, String cnpj, double salario) {
		super(nome, salario);
		this.cnpj = cnpj;
	}

	@Override
	public double calcular() {
		return (this.getSalario() * 0.10);
	}
	
    @Override
	public void mostra() {
		System.out.println(super.nome);
		System.out.println(super.salario);
		System.out.println(this.cnpj);
		System.out.println(this.calcular());
	}
}
