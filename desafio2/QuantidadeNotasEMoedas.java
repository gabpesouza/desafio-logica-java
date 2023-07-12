package desafio2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class QuantidadeNotasEMoedas {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double notas[] = { 100.0, 50.0, 20.0, 10.0, 5.0, 2.0 };
		double moedas[] = { 1.0, 0.50, 0.25, 0.10, 0.05, 0.01 };
		Map<String, Map<Double, Integer>> dinheiroAdicionado = new HashMap<>();

		System.out.println("Digite um valor monetário:");
		double valorMonetario = scan.nextDouble();
		double valorAtual = 0;
		int countQuantidade = 0;// quantidade de notas/moedas adicionadas

		Map<Double, Integer> valorPercorridoNotas = new LinkedHashMap<>() {
			{
				put(100.0, 0);
				put(50.0, 0);
				put(20.0, 0);
				put(10.0, 0);
				put(5.0, 0);
				put(2.0, 0);
			}
		};
		Map<Double, Integer> valorPercorridoMoedas = new LinkedHashMap<>() {
			{
				put(1.0, 0);
				put(0.50, 0);
				put(0.25, 0);
				put(0.10, 0);
				put(0.05, 0);
				put(0.01, 0);
			}
		};

		for (int k = 0; k < moedas.length;) {
			for (int i = 0; i < notas.length;) {
				if (k > 0) {
					break; /*
							 * Se k > 0 significa que já começou a contagem das moedas e esse loop deve ser
							 * pulado
							 */
				}
				if (notas[i] <= valorMonetario - valorAtual && valorAtual <= valorMonetario) {
					countQuantidade += 1;
					valorPercorridoNotas.put(notas[i], countQuantidade);
					valorAtual += notas[i];
				} else {
					countQuantidade = 0;
					dinheiroAdicionado.put("NOTAS", valorPercorridoNotas);
					i++;
				}
			}

			if (valorAtual + moedas[k] <= valorMonetario) {
				countQuantidade += 1;
				valorPercorridoMoedas.put(moedas[k], countQuantidade);
				valorAtual += moedas[k];
			} else {
				countQuantidade = 0;
				dinheiroAdicionado.put("MOEDAS", valorPercorridoMoedas);
				k++;
			}
		}

		for (Map.Entry<String, Map<Double, Integer>> qtdValores : dinheiroAdicionado.entrySet()) {
			System.out.println(qtdValores.getKey() + ":");

			for (Map.Entry<Double, Integer> innerMap : qtdValores.getValue().entrySet()) {
				System.out.println(innerMap.getValue() + " " + qtdValores.getKey() + " de "
						+ "     R$: " + innerMap.getKey());
			}
		}

		scan.close();
	}
}
