package exemplo;

import java.util.Scanner;

public class RestoDivisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor.");

		float valor1 = sc.nextFloat();

		System.out.println("Digite um valor.");

		float valor2 = sc.nextFloat();
		
		float resultado = valor1%valor2;
		
		System.out.println("O resto da Divis�o � de: "+resultado);
		
		sc.close();

	}

}
