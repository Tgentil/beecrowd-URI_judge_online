/* Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”. */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int dinheiro = input.nextInt();
		
		System.out.println(dinheiro);
		
		System.out.println(dinheiro / 100 + " nota(s) de R$ 100,00");
		dinheiro = dinheiro % 100;
		System.out.println(dinheiro / 50 + " nota(s) de R$ 50,00");
		dinheiro = dinheiro % 50;
		System.out.println(dinheiro / 20 + " nota(s) de R$ 20,00");
		dinheiro = dinheiro % 20;
		System.out.println(dinheiro / 10 + " nota(s) de R$ 10,00");
		dinheiro = dinheiro % 10;
		System.out.println(dinheiro / 5 + " nota(s) de R$ 5,00");
		dinheiro = dinheiro % 5;
		System.out.println(dinheiro / 2 + " nota(s) de R$ 2,00");
		dinheiro = dinheiro % 2;
		System.out.println(dinheiro / 1 + " nota(s) de R$ 1,00");
		
		input.close();
	
	}
	
}