import java.util.Scanner;

public class Main {
	private final static Scanner CLAVIER = new Scanner(System.in);

	public static void main(String[] args) {
		
		double num, denum;

		System.out.print("Quelle est le num�rateur ? ");
		num = CLAVIER.nextDouble();
        System.out.print("Quelle est le d�num�rateur  ? ");
		denum = CLAVIER.nextDouble();
		Fraction fract = new Fraction(num,denum);
		
		System.out.println("la fraction = " + fract.result());
		System.out.println("les composant de la fraction :" + fract.toString() );
	
	}

}
