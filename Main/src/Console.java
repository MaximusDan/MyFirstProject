import java.util.Scanner;
/**Класс консольного ввода*/
public class Console {
	
	/** Метод консольного ввода*/
	public static int methodConsole() {
		int number = 0;
		while (true) {
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				number = sc.nextInt();
				if(number != 0) {
					return number;
				}else {
					System.out.println("2 число не должно ровняться 0");
				}
			} else {
				System.out.println("Введенные символы не являются числом");
			}
		}
	}
	/** Метод консольного ввода типа double*/
	public static double methodConsoleDouble() {
		double number = 0;
		while (true) {
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				number = sc.nextDouble();
				return number;
			} else {
				System.out.println("Введенные символы не являются числом");
			}
		}
	}
}

