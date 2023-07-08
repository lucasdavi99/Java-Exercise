package application;

import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double media = 0.0;
		for (int i = 0; i < vect.length; i++) {
			media += vect[i] / vect.length; 
		}
		System.out.printf("MEDIA DO VETOR = %.3f", media);
		
		System.out.println();
		System.out.println("Abaixo da media:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
	}

}
