package exemplo;

public class OperadoresRelacionais {

	public static void igual() {
		int x = 20;
		int y = 20;

		if (x == y) {
			System.out.println("São iguais.");
		} else {
			System.out.println("Não são iguais.");
		}

	}

	public static void diferente() {
		int x = 10;
		int y = 20;

		if (x != y) {
			System.out.println("São diferentes.");
		} else {
			System.out.println("São iguais.");
		}
	}

	public static void maiorQue() {
		int x = 10;
		int y = 20;

		if (x > y) {
			System.out.println("X é maior que Y");
		} else {
			System.out.println("Y é maior que X");
		}
	}

	public static void menorQue() {
		int x = 10;
		int y = 20;

		if (x < y) {
			System.out.println("X é menor que Y.");
		} else {
			System.out.println("Y é menor que X");
		}

	}

	public static void maiorIgual() {
		int x = 10;
		int y = 20;

		if (x >= y) {
			System.out.println("X é maior ou igual a Y.");
		} else {
			System.out.println("Y é maior que X.");
		}
	}

	public static void menorIgual() {
		int x = 10;
		int y = 20;

		if (x <= y) {
			System.out.println("X é menor ou igual a Y. " + "X: " + x + " Y: " + y);
		} else {
			System.out.println("Y é Maior que X. "+ "X:"+ x + " Y: " + y);
		}
	}

	public static void main(String[] args) {

		igual();
		diferente();
		maiorQue();
		menorQue();
		maiorIgual();
		menorIgual();
	}

}
