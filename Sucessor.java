package exercicios;

import java.util.Scanner;

public class Sucessor {
	/*
	 * 1)Solicite um valor do teclado e exiba seu sucessor.
	 */

	/**
	 * JavaDoc
	 * 
	 * @author aluno
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor:" );
		
		int numero = sc.nextInt();

		int sucessor = numero + 1;

		

		System.out.println("O Sucessor do numero digitado é: " + sucessor);
		sc.close();

	}

}
