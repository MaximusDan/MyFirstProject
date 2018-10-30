package first;

import java.util.Scanner;

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
	/**
	 * Метод консольного ввода String
	 */
	public static String readFromConsoleStringValue() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			if (sc.hasNext()) {
				return sc.nextLine();
			} else {
				System.out.println("Введенные символы не являются числом");
			}
		}
	}
}

