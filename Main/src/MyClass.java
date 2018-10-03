import java.util.Scanner;

public class MyClass {

	// Задача 1
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++)
			System.out.print(i + " ");

		// Задача 2
		int x = 1, x1 = 1;
		System.out.println();
		while (true) {
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Введите правильно 1 число");
			System.out.println("Введите правильно 2 число");
			if (sc.hasNextInt() && sc1.hasNextInt()) {
				x = sc.nextInt();
				x1 = sc1.nextInt();

				System.out.println("сложение = " + (x + x1));
				System.out.println("умножение = " + (x * x1));
				System.out.println("деление = " + (x / x1));
				System.out.println("вычитание = " + (x - x1));
				break;
			}
		}
	}
}