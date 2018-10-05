import java.util.Scanner;

public class Console {

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

