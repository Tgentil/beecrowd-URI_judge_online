/* Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem. */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		double delta = Math.pow(B, 2) - ( 4 * A * C);
		
		double X = ( -B + Math.sqrt(delta) ) / (2 * A);
		double X1 = ( -B - Math.sqrt(delta) ) / (2 * A);
		
		if (( 2 * A ) == 0  || delta < 0) {
		
			System.out.println("Impossivel calcular");
			
		}
			else {
			
				System.out.printf("R1 = %.5f%n" , X);
				System.out.printf("R2 = %.5f%n" , X1);
				
		}
		
		
	
			input.close();
	
	}
	
}