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
				return number;
			} else {
				System.out.println("Введенные символы не являются числом");
			}
		}
	}
}

