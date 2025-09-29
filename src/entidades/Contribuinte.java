package entidades;

public abstract class Contribuinte {

	protected String nome;
	protected double salario;
	
	public Contribuinte(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public abstract void mostra();
}
