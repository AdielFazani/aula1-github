package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Quantos funcion�rios ser�o registrados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println(i + "� empregado: ");
			System.out.print("Re: ");
			int re = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Sal�rio: ");
			double salario = sc.nextDouble();
			
			list.add(new Empregado(re, nome, salario));
		}
		
		System.out.println();
		System.out.println("Insira o Re do empregado que receber� o aumento: ");
		int re = sc.nextInt();
		Empregado emp = list.stream().filter(x -> x.getRe() == re).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Esse Re n�o existe!");
		}
		else {
			System.out.print("Qual a porcentagem do aumento? ");
			double porcento = sc.nextDouble();
			emp.addSalary(porcento);
		}
		
		System.out.println("Lista de empregados: ");
		
		for (Empregado obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
