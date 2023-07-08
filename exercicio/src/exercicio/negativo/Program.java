package exercicio.negativo;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoas[] vect = new Pessoas[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %d° pessoa%n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoas(nome, idade, altura);
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
		}
		double media = soma / vect.length;
		System.out.printf("A media é: %.2f%n", media);

		int countMenores = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                countMenores++;
            }
        }
        double percentualMenores = (double) countMenores / vect.length * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}

		sc.close();
	}

}
