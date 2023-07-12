package desafio3;

import java.util.Scanner;

public class NumeroParesArrayValorAlvo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tamanho que o array deve ter:");
		int tamanhoArray = scan.nextInt();
		int[] arrayInteiros = new int[tamanhoArray];
		int numeroPares = 0;

		for (int i = 0; i < arrayInteiros.length; i++) {
			System.out.println("Digite o " + (i + 1) + " número do array");
			int numeroDigitado = scan.nextInt();
			arrayInteiros[i] = numeroDigitado;
		}

		System.out.println("Digite o valor alvo:");
		int valorAlvo = scan.nextInt();
		
		for(int k = 0; k < arrayInteiros.length; k++) {
			for(int j = 0; j < arrayInteiros.length; j++) {
				if(arrayInteiros[k] - arrayInteiros[j] == valorAlvo) {
					numeroPares++;
				}
			}
		}
		
		System.out.println(numeroPares);

	}
	
	

}
