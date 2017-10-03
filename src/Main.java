import java.util.Scanner;

public class Main {
	private final static Scanner CLAVIER = new Scanner(System.in);

	public static void main(String[] args) {
		
		double num, denum;

		System.out.print("Quelle est le numérateur ? ");
		num = CLAVIER.nextDouble();
        System.out.print("Quelle est le dénumérateur  ? ");
		denum = CLAVIER.nextDouble();
		Fraction fract = new Fraction(num,denum);
		
		System.out.println("la fraction = " + fract.result());
		System.out.println("les composant de la fraction :" + fract.toString() );
	
	}

}
