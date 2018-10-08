/**Класс арифметики*/
public class Arifmetika {
	
	/**главное меню класса*/
	public static void arifmetika() {

		boolean var = false;
		System.out.println();
		int value = 0, value1 = 0;
		while (true) {
			System.out.println("Введите правильно 1 число");
			System.out.println("Введите правильно 2 число");
			value = Console.methodConsole();
			value1 = Console.methodConsole();
			if (value1 != 0) {
				break;
			} else {
				System.out.println("2 число не должно ровняться 0");
			}
		}
		System.out.println("Введите действия которые Вы хотите совершить");
		while (true) {
			System.out.println("0 - Завершить задачу");
			System.out.println("1 - Сумма");
			System.out.println("2 - Умножение");
			System.out.println("3 - Деление");
			System.out.println("4 - Вычитание");
			System.out.println("5 - Найти делители числа");
			int value3 = Console.methodConsole();

			switch (value3) {
			case 0:
				var = true;
				System.out.println("Задача завершена");
				break;
			case 1:
				Arifmetika.addition(value, value1);
				break;
			case 2:
				Arifmetika.multiplication(value, value1);
				break;
			case 3:
				Arifmetika.division(value, value1);
				break;
			case 4:
				Arifmetika.subtraction(value, value1);
				break;
			case 5:
				Arifmetika.lesson6();
				break;
			default:
				System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее");
			}
			if (var) {
				break;
			}
		}
	}
	/**Метод поиска делителей числа*/
	public static void lesson6() {
		int value2 = 0;
		System.out.println();
		System.out.println("Введите число делители которого Вы желаете найти");
		while (true) {
			value2 = Console.methodConsole();
			if (value2 != 0) {
				for (int i = 1; i <= value2; i++) {
					if ((value2 % i) == 0) {
						System.out.println(i);
					}
				}
			} else {
				System.out.println("Введите другое число");
			}
		}
	}
	/**Метод суммы двух чисел*/
	public static void addition(int a, int b) {
		System.out.println("сложение = " + (a + b));
	}
	/**Метод умножения двух чисел*/
	public static void multiplication(int a, int b) {
		System.out.println("умножение = " + (a * b));
	}
	/**Метод деления двух чисел*/
	public static void division(int a, int b) {
		System.out.println("деление = " + (a / b));
	}
	/**Метод вычитани двух чисел*/
	public static void subtraction(int a, int b) {
		System.out.println("вычитание = " + (a - b));
	}

	/**Метод задания 11*/
	public static double methodDouble(double a, double b, double c) {
		double i = ((a + b) * c) / (a - b);
		return i;

	}
}
