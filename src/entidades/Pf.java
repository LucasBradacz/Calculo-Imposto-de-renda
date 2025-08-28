package entidades;

public final class Pf extends Contribuinte {

	private String cpf;

	public Pf(String nome, String cpf, double salario) {
		super(nome, salario);
		this.cpf = cpf;
	}

	@Override
	public double calcular() {
		if (this.salario <= 3036) {
			System.out.println("Isento");
			return 0;
		} else if (this.getSalario() <= 3553.31) {
			return this.salario * 0.75;
		} else if (super.getSalario() <= 4688.85) {
			return (super.salario * (15/100));
		} else if (super.salario <= 8530.85) {
			return super.salario * (22.5/100);
		} else {
			return super.salario * (27.5/100);
		}
	}
	
	public void mostra() {
		System.out.println(super.getNome());
		System.out.println(super.getSalario());
		System.out.println(this.cpf);
		System.out.println(this.calcular());
	}
}
