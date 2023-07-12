package desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosParesEImpares {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Integer> numerosPares = new ArrayList<Integer>();
		List<Integer> numerosImpares = new ArrayList<Integer>();
		
		System.out.println("Digite a quantidade de números que irá digitar.");
		int quantidadeLinhas = scan.nextInt();
		
		int count = 1;
		while(count <= quantidadeLinhas) {
			System.out.println("Digite o " + count + " número:");
			int numeroDigitado = scan.nextInt();
			boolean verifica = numeroDigitado % 2 == 0 ?
					numerosPares.add(numeroDigitado):
					numerosImpares.add(numeroDigitado);
			count++;
		}
		
		numerosPares.sort((a,b) -> a.compareTo(b));
		numerosImpares.sort((a,b) -> b.compareTo(a));
		numerosImpares.addAll(numerosPares);
		numerosImpares.forEach(numero -> System.out.println(numero));
		
		scan.close();
	}

}
