package exemplo;

public class ExemploWhileComContinue {

	public static void main(String[] args) {

		int contador = 0;

		while (contador < 40) {
			if (contador == 20) {
				contador++;
				continue;
			}
			System.out.println(contador);
			contador++;
		}
	}
}
