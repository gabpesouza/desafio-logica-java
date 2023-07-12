package desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringInvertida {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String> linhasConvertidas = new ArrayList<>();

		System.out.println("Digite a quantidade de testes:");
		int qtdTestes = scan.nextInt();
		scan.nextLine();

		int count = 0;
		while (count < qtdTestes) {
			System.out.println("Digite a " + (count + 1) + " linha");
			String linhaDigitada = scan.nextLine();
			// linhasConvertidas.add(linhaDigitada);
			System.out.println(decifraLinha(linhaDigitada));

			count++;

		}
	}

	public static String decifraLinha(String linha) {

		int tamanhoLinhaInteira = linha.length();
		int tamanhoCadaLinha = tamanhoLinhaInteira / 2;
		char[] linhaEsquerda = linha.substring(0, tamanhoCadaLinha).toCharArray();
		char[] linhaDireita = linha.substring(tamanhoCadaLinha).toCharArray();

		int count = 0;
		for (int i = tamanhoCadaLinha - 1; i != count; i--) {
			char aux = linhaEsquerda[count];
			linhaEsquerda[count] = linhaEsquerda[i];
			linhaEsquerda[i] = aux;

			aux = linhaDireita[count];
			linhaDireita[count] = linhaDireita[i];
			linhaDireita[i] = aux;

			count++;
		}

		String linhaDecifrada = new String(linhaEsquerda) + new String(linhaDireita);

		return linhaDecifrada;

	}

}
