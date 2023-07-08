package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		int somaPares = 0;
		int countPares = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				somaPares += vect[i];
				countPares++;
			}
		}

		if (countPares > 0) {
			double mediaPares = (double) somaPares / countPares;
			System.out.printf("Média dos números pares: %.1f%n", mediaPares);
		} else {
			System.out.println("Não foram informados números pares");
		}

		sc.close();
	}

}
