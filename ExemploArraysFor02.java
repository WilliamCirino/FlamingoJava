package exemplo;

public class ExemploArraysFor02 {

	public static void main(String[] args) {

		String[] brasileirao = { "Atl�tico-MG", "Flamengo", "Palmeiras", "Fortaleza", "Corinthians", "Bragantino",
				"Fluminense", "Am�rica-MG", "Atl�tico-GO", "Santos", "Cear�", "Internacional", "S�o Paulo", "Athletico",
				"Paranaense", "Cuiab�", "Juventude", "Fluminense", "Botafogo", "Coritiba" };
		System.out.println("Os 20 times participantes do Brasileir�o");
		for (int i = 0; i < brasileirao.length; i++) {

			System.out.println(i + 1 + "� " + brasileirao[i]);

			// System.out.println(brasileirao.length);
		}

	}

}
