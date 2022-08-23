package exemplo;
//comentário Inline - Em linha

/*Comentario Multilinha*/

/*	public static void main(String[] args) é um procedimento/metodo principal que não exibe retorno
 * 'void' não retorna resultados
 */

public class exemplo06 {
	
	/**
	 * JavaDoc
	 * 
	 * @author aluno
	 */
/*	public static void main(String[] args) é um procedimento/metodo principal que não exibe retorno
 * 'void' não retorna resultados
 */
	
	
	public static void main (String[] args) {
		gps();
		musica();
		radio();
		
		
		
	}

	public static void gps() {
		System.out.println("Ligando o GPS...");
	}
	public static void musica() {
		System.out.println("Ligando a Música...");
	}
	public static void radio() {
		System.out.println("Ligando a Rádio...");
	}
}
