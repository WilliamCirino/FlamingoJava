package exercicios;

import java.util.Scanner;

public class Antecessor {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		
		int numero = sc.nextInt();
		int antecessor = numero - 1;
		
		System.out.println("O Antecessor do n�mero digitado �: "+ antecessor);
		sc.close();
		
	}
	
}
