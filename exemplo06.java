package exemplo;
//coment�rio Inline - Em linha

/*Comentario Multilinha*/

/*	public static void main(String[] args) � um procedimento/metodo principal que n�o exibe retorno
 * 'void' n�o retorna resultados
 */

public class exemplo06 {
	
	/**
	 * JavaDoc
	 * 
	 * @author aluno
	 */
/*	public static void main(String[] args) � um procedimento/metodo principal que n�o exibe retorno
 * 'void' n�o retorna resultados
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
		System.out.println("Ligando a M�sica...");
	}
	public static void radio() {
		System.out.println("Ligando a R�dio...");
	}
}
