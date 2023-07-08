package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int[] vect2 = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vect2.length; i++) {
			vect2[i] = sc.nextInt();
		}
		
		int soma = 0;
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < vect2.length; i++) {
			soma = vect[i] + vect2[i];
			System.out.println(soma);
		}
		
		
		
		
		sc.close();
	}

}
