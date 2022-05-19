/* Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” . */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int H1 = input.nextInt();
		int M1 = input.nextInt();
		int H2 = input.nextInt();
		int M2 = input.nextInt();
		
		int inicio = H1 * 60 + M1;
		int fim = H2 * 60 + M2;
		
		int tempo = fim - inicio;
		
		int horas = tempo / 60;
		int min = tempo % 60;

		if (horas <= 0 && min < 0) {
			
			horas = 24 + horas - 1;
			min = 60 + min;
			System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + min + " MINUTO(S)");
			
		} else	if (horas <= 0 && min == 0) {
				
				horas = 24 + horas;
				System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + min + " MINUTO(S)");
				
			
		} else {
		
		System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + min + " MINUTO(S)");

		}
		
			input.close();
	}
}
    