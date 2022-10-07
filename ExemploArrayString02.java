package exemplo;

public class ExemploArrayString02 {

	public static void main(String[] args) {
	
		String [] carros= {"Volvo","Chevrolet","Ford","Renault"};
		System.out.println(carros[0]);
		System.out.println(carros[1]);
		System.out.println(carros[2]);
		System.out.println(carros[3]);
		
		carros[0]="BMW";
		carros[3]="Subaru";
	
		System.out.println();
		
		System.out.println(carros[0]);
		System.out.println(carros[1]);
		System.out.println(carros[2]);
		System.out.println(carros[3]);
		System.out.println();
		System.out.println(carros.length);

	}

}
