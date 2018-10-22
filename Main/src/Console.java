import java.util.Scanner;
/**
 * @author Максим Данилович
 *
 *Класс консольного ввода. Содержит методы считываия с консоли. 
 */
public class Console {

	/**
	 * Метод консольного ввода
	 */
	public static int readFromConsoleIntValue() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				return sc.nextInt();
			} else {
				System.out.println("Введенные символы не являются числом");
			}
		}
	}

	/**
	 * Метод консольного ввода
	 */
	public static double readFromConsoleDoubleValue() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				return sc.nextDouble();
			} else {
				System.out.println("Введенные символы не являются числом");
			}
		}
	}
}

