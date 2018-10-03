import java.util.Scanner;

public class Main {

	    // Задача 1
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		// Задача 2
		int dick = 1, boobs = 1;
		System.out.println();
		while (true) {
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Введите правильно 1 число");
			System.out.println("Введите правильно 2 число");
			if (sc.hasNextInt() && sc1.hasNextInt()) {
				dick = sc.nextInt();
				boobs = sc1.nextInt();

				System.out.println("сложение = " + (dick + boobs));
				System.out.println("умножение = " + (dick * boobs));
				System.out.println("деление = " + (dick / boobs));
				System.out.println("вычитание = " + (dick - boobs));
				break;
			}
		}
	}
}