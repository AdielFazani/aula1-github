package entities;

public class Empregado {
	
	private int re;
	private String nome;
	private double salario;
	
	public Empregado(int re, String nome, double salario) {
		this.re = re;
		this.nome = nome;
		this.salario = salario;
	}

	public int getRe() {
		return re;
	}

	public void setRe(int re) {
		this.re = re;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void addSalary(double porcento) {
		this.salario += salario * porcento / 100;
	}
	
	public String toString() {
		return re + ", " + nome + ", " + String.format("%.2f", salario);
	}

}
