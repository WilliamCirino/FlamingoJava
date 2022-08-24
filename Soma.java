package exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");

		int numero1 = sc.nextInt();

		System.out.println("Digite o segundo valor: ");

		int numero2 = sc.nextInt();

		int soma = numero1 + numero2;

		System.out.println("A soma dos dois valores digitados é: " + soma);
		sc.close();

	}

}
