package exemplo;

public class ExemploArraysFor02 {

	public static void main(String[] args) {

		String[] brasileirao = { "Atlético-MG", "Flamengo", "Palmeiras", "Fortaleza", "Corinthians", "Bragantino",
				"Fluminense", "América-MG", "Atlético-GO", "Santos", "Ceará", "Internacional", "São Paulo", "Athletico",
				"Paranaense", "Cuiabá", "Juventude", "Fluminense", "Botafogo", "Coritiba" };
		System.out.println("Os 20 times participantes do Brasileirão");
		for (int i = 0; i < brasileirao.length; i++) {

			System.out.println(i + 1 + "° " + brasileirao[i]);

			// System.out.println(brasileirao.length);
		}

	}

}
