package exemplo;

public class Variaveis {

	static void mostrar() {
		int valor = 45;
		System.out.println("O valor da variavel � :" + valor);
	}

	public static void main(String[] args) {

		int data = 50; // Vari�vel de Inst�ncia
		System.out.println("O valor da vari�vel data � :" + data);

		exibir();

	}

	static void exibir() {
		int valor = 40;
		System.out.println("O valor da variavel � :" + valor);
	}

}
