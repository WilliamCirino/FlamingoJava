package exemplo;

public class ExemploWhileComBreak {

	public static void main(String[] args) {

		int contador = 0;

		while (contador < 10) {
			System.out.println(contador);
			contador++;
			if (contador == 4) {
				
				break;

			}
		}
	}
}
