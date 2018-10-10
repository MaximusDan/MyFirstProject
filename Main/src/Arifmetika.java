/** Класс арифметики */
public class Arifmetika {
	
	
	/** главное меню класса */
	public static void arifmetikaMenu() {
		System.out.println("Введите действия которые Вы хотите совершить");
		int value = 0, value1 = 0, value2 = 0;
		boolean stopProject = false;
		while (true) {
			System.out.println("0 - Завершить задачу");
			System.out.println("1 - Сложение");
			System.out.println("2 - Умножение");
			System.out.println("3 - Деление");
			System.out.println("4 - Вычитание");
			System.out.println("5 - Найти делители числа");
			System.out.println("6 - Найти модуль числа");
			System.out.println("7 - Заполнить массив");
			int value3 = Console.methodConsole();

			switch (value3) {
			case 0:
				stopProject = true;
				System.out.println("Задача завершена");
				break;
			case 1:
				System.out.println("Введите первое число");
				value = Console.methodConsole();
				System.out.println("Введите второе число");
				value1 = Console.methodConsole();
				Arifmetika.addition(value, value1);
				break;
			case 2:
				System.out.println("Введите первое число");
				value = Console.methodConsole();
				System.out.println("Введите второе число");
				value1 = Console.methodConsole();
				Arifmetika.multiplication(value, value1);
				break;
			case 3:
				System.out.println("Введите первое число");
				value = Console.methodConsole();
				System.out.println("Введите второе число");
				value1 = Console.methodConsole();
				Arifmetika.division(value, value1);
				break;
			case 4:
				System.out.println("Введите первое число");
				value = Console.methodConsole();
				System.out.println("Введите второе число");
				value1 = Console.methodConsole();
				Arifmetika.subtraction(value, value1);
				break;
			case 5:
				System.out.println("Введите число делители которого Вы желаете найти");
				value2 = Console.methodConsole();
				Arifmetika.methodDivider(value2);
				break;
			case 6:
				System.out.println("Введите число модуль которого Вы желаете найти");
				double value4 = Console.methodConsoleDouble(); 
				Arifmetika.methodModule(value4); 
				break;
			//case 7:
				//Arifmetika.newMass(); 
				//break;
			default:
				System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее");
			}
			if (stopProject) {
				break;
			}
		}
	}

	/**@param value, value1 значения переменных,  метод нахождения их суммы */
	public static void addition(int a, int b) {
		System.out.println("сложение = " + (a + b));
	}

	/**@param value, value1 значения переменных,  метод их умножения */
	public static void multiplication(int a, int b) {
		System.out.println("умножение = " + (a * b));
	}

	/**@param value, value1 значения переменных,  метод нахождения их деления */
	public static void division(int a, int b) {
		System.out.println("деление = " + (a / b));
	}

	/**@param value, value1 значения переменных,  метод нахождения их вычитания */
	public static void subtraction(int a, int b) {
		System.out.println("вычитание = " + (a - b));
	}
	/** @param value2 значение переменной, метод нахождения его делителей */
	public static void methodDivider(int a) {
		for (int i = 1; i <= a; i++) {
			if ((a % i) == 0) {
				System.out.println(i);
			}
		}
	}

	/** @param value4 значение переменной, метод нахождения его модуля */
	public static void methodModule(double a) {
		if (a >= 0) {
			System.out.println(a);
		}
		if (a < 0) {
			System.out.println(a *(-1));
		}
	}
}