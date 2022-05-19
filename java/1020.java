/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int dias = input.nextInt();

		int anos = dias / 365 ;
		dias =dias % 365;
		
		int mes = dias / 30 ;
		dias = dias % 30;
	
		System.out.println(anos + " ano(s)\n" + mes + " mes(es)\n" + dias + " dia(s)" );

		input.close();
		
	}

}	