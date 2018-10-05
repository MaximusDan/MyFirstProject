
public class Arifmetika {

	public static void addition(int a, int b) {
		System.out.println("сложение = " + (a + b));
	}

	public static void multiplication(int a, int b) {
		System.out.println("умножение = " + (a * b));
	}

	public static void division(int a, int b) {
		System.out.println("деление = " + (a / b));
	}

	public static void subtraction(int a, int b) {
		System.out.println("вычитание = " + (a - b));
	}
	public static double methodDouble(double a,double b, double c){
		double i = ((a + b) * c ) / (a - b);
		return i;
		
	}
}
