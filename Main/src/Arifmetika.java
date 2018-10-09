/** Класс арифметики */
public class Arifmetika {
	
	
	/** главное меню класса */
	public static void arifmetikaMenu() {
		System.out.println("Введите действия которые Вы хотите совершить");
		int value = 0, value1 = 0, value2 = 0;
		double value4 = 0.0;
		boolean var = false;
		while (true) {
			System.out.println("0 - Завершить задачу");
			System.out.println("1 - Сложение");
			System.out.println("2 - Умножение");
			System.out.println("3 - Деление");
			System.out.println("4 - Вычитание");
			System.out.println("5 - Найти делители числа");
			System.out.println("6 - Найти модуль числа");

			int value3 = Console.methodConsole();

			switch (value3) {
			case 0:
				var = true;
				System.out.println("Задача завершена");
				break;
			case 1:
				System.out.println("Введите два числа");
				value = Console.methodConsole();
				System.out.println("Теперь введите второе число");
				value1 = Console.methodConsole();
				Arifmetika.addition(value, value1);
				break;
			case 2:
				System.out.println("Введите два числа");
				value = Console.methodConsole();
				System.out.println("Теперь введите второе число");
				value1 = Console.methodConsole();
				Arifmetika.multiplication(value, value1);
				break;
			case 3:
				System.out.println("Введите два числа");
				value = Console.methodConsole();
				System.out.println("Теперь введите второе число");
				value1 = Console.methodConsole();
				Arifmetika.division(value, value1);
				break;
			case 4:
				System.out.println("Введите два числа");
				value = Console.methodConsole();
				System.out.println("Теперь введите второе число");
				value1 = Console.methodConsole();
				Arifmetika.subtraction(value, value1);
				break;
			case 5:
				System.out.println("Введите число делители которого Вы желаете найти");
				value2 = Console.methodConsole();
				Arifmetika.lesson6(value2);
				break;
			case 6:
				System.out.println("Введите число модуль которого Вы желаете найти");
					value4 = Console.methodConsoleDouble();
				    Arifmetika.methodModule(value4);
				break;
			default:
				System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее");
			}
			if (var) {
				break;
			}
		}
	}

	/** Метод суммы двух чисел */
	public static void addition(int a, int b) {
		System.out.println("сложение = " + (a + b));
	}

	/** Метод умножения двух чисел */
	public static void multiplication(int a, int b) {
		System.out.println("умножение = " + (a * b));
	}

	/** Метод деления двух чисел */
	public static void division(int a, int b) {
		System.out.println("деление = " + (a / b));
	}

	/** Метод вычитани двух чисел */
	public static void subtraction(int a, int b) {
		System.out.println("вычитание = " + (a - b));
	}
	/** Метод нахождения делителей */
	public static void lesson6(int a) {
		for (int i = 1; i <= a; i++) {
			if ((a % i) == 0) {
				System.out.println(i);
			}
		}
	}

	/** Метод нахождения модуля чила */
	public static void methodModule(double a) {
		if (a >= 0) {
			System.out.println(a);
		}
		if (a < 0) {
			System.out.println(0 + (-0) + (-a));
		}
	}
}