package first;

public class Arithmetic {

	/** Главное меню класса арифметика */
	public static void arithmeticMenu() {
		System.out.println("Введите действия которые Вы хотите совершить");
		int value = 0, value1 = 0, value2 = 0;
		while (true) {
			System.out.println("0 - Завершить задачу");
			System.out.println("1 - Сложение");
			System.out.println("2 - Умножение");
			System.out.println("3 - Деление");
			System.out.println("4 - Вычитание");
			System.out.println("5 - Найти делители числа");
			System.out.println("6 - Найти модуль числа");
			System.out.println("7 - Возвести число в степень");

			boolean stopMethodArithmetic = false;
			switch (Console.readFromConsoleIntValue()) {
				case 0:
					stopMethodArithmetic = true;
					System.out.println("Задача завершена");
					break;
				case 1:
					System.out.println("Введите первое число");
					value = Console.readFromConsoleIntValue();
					System.out.println("Введите второе число");
					value1 = Console.readFromConsoleIntValue();
					int summ = Arithmetic.summ(value, value1);
					System.out.println("сумма = " + summ);
					break;
				case 2:
					System.out.println("Введите первое число");
					value = Console.readFromConsoleIntValue();
					System.out.println("Введите второе число");
					value1 = Console.readFromConsoleIntValue();
					int multiply = Arithmetic.multiply(value, value1);
					System.out.println("умножение = " + multiply);
					break;
				case 3:
					System.out.println("Введите первое число");
					value = Console.readFromConsoleIntValue();
					System.out.println("Введите второе число");
					while (true) {
						value1 = Console.readFromConsoleIntValue();
						if (value1 != 0) {
							break;
						} else {
							System.out.println("2 число не должно ровняться 0");
						}
					}
					int divis = Arithmetic.divis(value, value1);
					System.out.println("деление = " + divis);
					break;
				case 4:
					System.out.println("Введите первое число");
					value = Console.readFromConsoleIntValue();
					System.out.println("Введите второе число");
					value1 = Console.readFromConsoleIntValue();
					int subtract = Arithmetic.subtract(value, value1);
					System.out.println("вычитание = " + subtract);
					break;
				case 5:
					System.out.println("Введите число делители которого Вы желаете найти");
					value2 = Console.readFromConsoleIntValue();
					Arithmetic.createDivider(value2);
					break;
				case 6:
					System.out.println("Введите число модуль которого Вы желаете найти");
					double value4 = Console.readFromConsoleDoubleValue();
					double showModule = Arithmetic.createModuleDouble(value4);
					System.out.println(showModule);
					break;
				case 7:
					System.out.println("Введите число, которое Вы желаете возвести в степень");
					double number = Console.readFromConsoleDoubleValue();
					number = Arithmetic.number25(number);
					System.out.println(number);
					break;
				default:
					System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее"); //проверка на ввод только номеров case
			}
			if (stopMethodArithmetic) {
				break;
			}
		}
	}

	/**
	 * Метод нахождения суммы переменных
	 */
	public static int summ(int variableA, int variableB) {
		int summ = variableA + variableB;
		return summ;
	}

	/**
	 * Метод умножения переменных
	 */
	public static int multiply(int variableA, int variableB) {
		int multiply = variableA * variableB;
		return multiply;
	}

	/**
	 * Метод деления переменных
	 */
	public static int divis(int variableA, int variableB) {
		int divis = variableA / variableB;
		return divis;
	}

	/**
	 * Метод вычитания переменных
	 */
	public static int subtract(int variableA, int variableB) {
		int subtract = variableA - variableB;
		return subtract;
	}

	/**
	 * Метод нахождения делителей числа
	 */
	public static void createDivider(int variable) {
		for (int divider = 1; divider <= variable; divider++) {
			if ((variable % divider) == 0) {
				System.out.println(divider);
			}
		}
	}

	/**
	 * Метод нахождения модуля числа типа double
	 */
	public static double createModuleDouble(double module) {
		if (module >= 0) {
			module = module;
		}
		if (module < 0) {
			module = (module * (-1));
		}
		return module;
	}
	/**
	 * Метод нахождения модуля числа типа Int
	 */
	public static int createModuleInt(int module) {
		if (module >= 0) {
			module = module;
		}
		if (module < 0) {
			module = (module * (-1));
		}
		return module;
	}


	/**
	 * Метод нахождения рандомного значения из диапазона
	 */

	public static int createRandom(int randomMin, int randomMax) {
		int a = (int) (Math.random() * (randomMax - randomMin + 1)) + randomMin;
		return a;
	}

	/**
	 * Метод возведения числа в степень
	 */
	public static double number25(double value) {
		System.out.println("Введите в какую степень Вы хотите возвести число");
		double value1= value;
		int value2 = Console.readFromConsoleIntValue();
		for(int i=1;i<value2;i++){
			value = value*value1;
		}
		return value;
	}
	/**
	 * Метод возведения Int числа в степень
	 */
	public static int degree(int value) {
		System.out.println("Введите в какую степень Вы хотите возвести число");
		int value1= value;
		int value2 = Console.readFromConsoleIntValue();
		for(int i=1;i<value2;i++){
			value = value*value1;
		}
		return value;
	}
}