package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Aluno[] vect = new Aluno[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %d° aluno:%n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Primeira Nota: ");
			double nota1 = sc.nextDouble();
			System.out.print("Segunda Nota: ");
			double nota2 = sc.nextDouble();
			vect[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println();
		double media = 0.0;
		System.out.println("Alunos Aprovados:");
		for (int i = 0; i < vect.length; i++) {
			media = (vect[i].getNota1() + vect[i].getNota2()) / 2.0;
			
			if (media >= 6.0) {
				System.out.println(vect[i].getNome());
			}
		}
		
		System.out.println();
		System.out.println("Alunos Reprovados:");
		for (int i = 0; i < vect.length; i++) {
			media = (vect[i].getNota1() + vect[i].getNota2()) / 2.0;
			
			if (media < 6.0) {
				System.out.println(vect[i].getNome());
			}
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
