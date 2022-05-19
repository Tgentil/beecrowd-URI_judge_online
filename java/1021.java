/* Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal. */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double valor = input.nextDouble();
		int dinheiro = 0;
		
		System.out.println("NOTAS:");
		
		dinheiro = (int) valor / 100;
		System.out.printf("%d nota(s) de R$ 100.00%n", dinheiro);
		valor = valor % 100;
		
		dinheiro = (int) valor / 50;
		System.out.printf("%d nota(s) de R$ 50.00%n", dinheiro);
		valor = valor % 50;
		
		dinheiro = (int) valor / 20;
		System.out.printf("%d nota(s) de R$ 20.00%n", dinheiro);
		valor = valor % 20;
		
		dinheiro = (int) valor / 10;
		System.out.printf("%d nota(s) de R$ 10.00%n", dinheiro);
		valor = valor % 10;
		
        dinheiro = (int) valor / 5;
		System.out.printf("%d nota(s) de R$ 5.00%n", dinheiro);
		valor = valor % 5;
		
		dinheiro = (int) valor / 2;
		System.out.printf("%d nota(s) de R$ 2.00%n", dinheiro);
		valor = valor % 2;
	
		valor = valor * 100;
		
		System.out.println("MOEDAS:");
		
		dinheiro = (int) valor / 100;
		System.out.printf("%d moeda(s) de R$ 1.00%n", dinheiro);
		valor = valor % 100;
		
		dinheiro = (int) valor / 50;
		System.out.printf("%d moeda(s) de R$ 0.50%n", dinheiro);
		valor = valor % 50;
		
		dinheiro = (int) valor / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", dinheiro);
		valor = valor % 25;
		
		dinheiro = (int) valor / 10;
		System.out.printf("%d moeda(s) de R$ 0.10%n", dinheiro);
		valor = valor % 10;
		
		dinheiro = (int) valor / 5;
		System.out.printf("%d moeda(s) de R$ 0.05%n", dinheiro);
		valor = valor % 5;
		
		dinheiro = (int) valor / 1;
		System.out.printf("%d moeda(s) de R$ 0.01%n", dinheiro);
		valor = valor % 1;
		
			input.close();
	
	}
	
}
