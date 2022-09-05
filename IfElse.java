package exemplo;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor.");

		int valor = sc.nextInt();

		if (valor > 20) {
			System.out.println("O valor Digitado é maior que 20.");
		}

		else {
			System.out.println("O valor digitado é menor que 20.");
		}

		sc.close();
	}

}
