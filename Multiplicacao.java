package exercicios;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		float numero1 = sc.nextFloat();

		System.out.println("Digite o segundo valor:");

		float numero2 = sc.nextFloat();

		float multiplicacao = numero1 * numero2;

		System.out.println("O valor da Divisão entre os 2 valores é: " + multiplicacao);
		sc.close();

	}

}
