package exemplo;

import java.util.Scanner;

public class IfElseEncadeado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor.");

		int valor = sc.nextInt();

		if (valor > 20) {
			System.out.println("O valor digitado � maior que 20.");
		} else if (valor == 20) {
			System.out.println("O Valor digitado � igual a 20.");
		} else {
			System.out.println("O valor digitado � menor que 20");
		}
		sc.close();
	}

}
