package exercicios;

import java.util.Scanner;

public class divisao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		
		float numero1 = sc.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		
		float numero2 = sc.nextFloat();
		
		float divisao = numero1/numero2;
		
		System.out.println("A divisão dos dois valores é de: " + divisao);
		sc.close();

	}

}
