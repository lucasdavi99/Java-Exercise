package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		int pares = 0;
		System.out.println("Números pares: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				pares++;
			}
		}
		System.out.println();
		System.out.println("Quantidade de pares: " + pares);

		sc.close();
	}

}
