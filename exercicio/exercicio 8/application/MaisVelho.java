package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %d° pessoa%n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new Pessoa(nome, idade);
		}

		int maisVelho = 0;
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() > vect[maisVelho].getIdade()) {
				maisVelho = vect[i].getIdade();
			}
		}
		
		System.out.printf("Pessoa mais velha: %s\n", vect[maisVelho].getNome());

			sc.close();
	}

}
