package entidades;

public final class Pf extends Contribuinte {

	private final String cpf;

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
			return (this.salario * 0.075);
		} else if (super.getSalario() <= 4688.85) {
			return (this.salario * 0.15);
		} else if (this.getSalario() <= 8530.85) {
			return (this.salario * 0.225);
		} else {
			return (this.salario * 0.275);
		}
	}
	
    @Override
	public void mostra() {
		System.out.println(super.getNome());
		System.out.println(super.getSalario());
		System.out.println(this.cpf);
		System.out.println(this.calcular());
	}
}
