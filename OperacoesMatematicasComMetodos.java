package exemplo;

public class OperacoesMatematicasComMetodos {

	public static void main(String[] args) {
		soma();
		subtracao();
		multiplicacao();
		divisao();
	}
	
	static void soma() {
		int valor1=10;
		int valor2=15;
		int resultado=valor1+valor2;
		System.out.println("O valor da soma �:"+resultado);
	}
	
	static void subtracao() {
		int valor1=10;
		int valor2=15;
		int resultado=valor1-valor2;
		System.out.println("O valor da subtra��o �:"+resultado);
	}
	static void multiplicacao() {
		int valor1=10;
		int valor2=15;
		int resultado=valor1*valor2;
		System.out.println("O valor da multiplica��o �:"+resultado);
	}
	static void divisao() {
		float valor1=10;
		float valor2=15;
		float resultado=valor1/valor2;
		System.out.println("O valor da divis�o �:"+resultado);
	}
}

