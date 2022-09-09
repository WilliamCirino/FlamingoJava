package exemplo;

public class OperadoresRelacionais {

	public static void igual() {
		int x = 20;
		int y = 20;

		if (x == y) {
			System.out.println("S�o iguais.");
		} else {
			System.out.println("N�o s�o iguais.");
		}

	}

	public static void diferente() {
		int x = 10;
		int y = 20;

		if (x != y) {
			System.out.println("S�o diferentes.");
		} else {
			System.out.println("S�o iguais.");
		}
	}

	public static void maiorQue() {
		int x = 10;
		int y = 20;

		if (x > y) {
			System.out.println("X � maior que Y");
		} else {
			System.out.println("Y � maior que X");
		}
	}

	public static void menorQue() {
		int x = 10;
		int y = 20;

		if (x < y) {
			System.out.println("X � menor que Y.");
		} else {
			System.out.println("Y � menor que X");
		}

	}

	public static void maiorIgual() {
		int x = 10;
		int y = 20;

		if (x >= y) {
			System.out.println("X � maior ou igual a Y.");
		} else {
			System.out.println("Y � maior que X.");
		}
	}

	public static void menorIgual() {
		int x = 10;
		int y = 20;

		if (x <= y) {
			System.out.println("X � menor ou igual a Y. " + "X: " + x + " Y: " + y);
		} else {
			System.out.println("Y � Maior que X. "+ "X:"+ x + " Y: " + y);
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
