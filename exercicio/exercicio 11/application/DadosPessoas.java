package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Gente;

public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Gente[] vect = new Gente[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Altura da %d° pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Gênero da %d° pessoa: ", i + 1);
			char genero = Character.toUpperCase(sc.next().charAt(0));
			vect[i] = new Gente(altura, genero);
		}

		double menorAltura = vect[0].getAltura();
		double maiorAltura = vect[0].getAltura();
		for (int i = 0; i < vect.length; i++) {

			if (vect[i].getAltura() < menorAltura) {

				menorAltura = vect[i].getAltura();
			}

			if (vect[i].getAltura() > maiorAltura) {

				maiorAltura = vect[i].getAltura();
			}
		}
		System.out.println();
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);

		double somaAlturasMulheres = 0.0;
		int numMulheres = 0;
		int numHomens = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getGenero() == 'F') {
				somaAlturasMulheres += vect[i].getAltura();
				numMulheres++;
			} 
			if (vect[i].getGenero() == 'M') {
                numHomens++;
			} 
		}

		double mediaAlturasMulheres = 0.0;
		if (numMulheres > 0) {
			mediaAlturasMulheres = somaAlturasMulheres / numMulheres;
		}
		System.out.printf("Média da altura das mulheres: %.2f%n", mediaAlturasMulheres);
		System.out.println("Quantidade de homens: " + numHomens);

		sc.close();
	}

}
