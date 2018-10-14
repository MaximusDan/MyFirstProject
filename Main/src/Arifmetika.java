/** Класс арифметики. Содержит методы с арифметическими операциями */
public class Arifmetika {

	/** Главное меню класса арифметика */
	public static void arifmetikaMenu() {
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
			System.out.println("7 - Заполнить массив");

			boolean stopMethodArifmetika = false;
			switch (Console.readFromConsoleIntValue()) {
			case 0:
				stopMethodArifmetika = true;
				System.out.println("Задача завершена");
				break;
			case 1:
				System.out.println("Введите первое число");
				value = Console.readFromConsoleIntValue();
				System.out.println("Введите второе число");
				value1 = Console.readFromConsoleIntValue();
				Arifmetika.add(value, value1);
				break;
			case 2:
				System.out.println("Введите первое число");
				value = Console.readFromConsoleIntValue();
				System.out.println("Введите второе число");
				value1 = Console.readFromConsoleIntValue();
				Arifmetika.multiply(value, value1);
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
				Arifmetika.divis(value, value1);
				break;
			case 4:
				System.out.println("Введите первое число");
				value = Console.readFromConsoleIntValue();
				System.out.println("Введите второе число");
				value1 = Console.readFromConsoleIntValue();
				Arifmetika.subtract(value, value1);
				break;
			case 5:
				System.out.println("Введите число делители которого Вы желаете найти");
				value2 = Console.readFromConsoleIntValue();
				Arifmetika.createDivider(value2);
				break;
			case 6:
				System.out.println("Введите число модуль которого Вы желаете найти");
				double value4 = Console.readFromConsoleDoubleValue();
				double showModule = Arifmetika.createModule(value4);
				System.out.println(showModule);
				break;
			case 7:
				Arifmetika.newMass();
				break;
			default:
				System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее");
			}
			if (stopMethodArifmetika) {
				break;
			}
		}
	}

	/**
	 * Метод нахождения суммы переменных
	 * 
	 * @param variableA,variableB значения переменных
	 */
	public static void add(int variableA, int variableB) {
		System.out.println("сложение = " + (variableA + variableB));
	}

	/**
	 * Метод умножения переменных
	 * 
	 * @param variableA,variableB значения переменных
	 */
	public static void multiply(int variableA, int variableB) {
		System.out.println("умножение = " + (variableA * variableB));
	}

	/**
	 * Метод деления переменных
	 * 
	 * @param variableA,variableB значения переменных
	 */
	public static void divis(int variableA, int variableB) {
		System.out.println("деление = " + (variableA / variableB));
	}

	/**
	 * Метод вычитания переменных
	 * 
	 * @param variableA,variableB значения переменных
	 */
	public static void subtract(int variableA, int variableB) {
		System.out.println("вычитание = " + (variableA - variableB));
	}

	/**
	 * Метод нахождения делителей числа
	 * 
	 * @param variableA, значение переменной
	 */
	public static void createDivider(int variable) {
		for (int divider = 1; divider <= variable; divider++) {
			if ((variable % divider) == 0) {
				System.out.println(divider);
			}
		}
	}

	/**
	 * Метод нахождения модуля числа
	 * 
	 * @param module значение переменной
	 */
	public static double createModule(double module) {
		if (module >= 0) {
			module = module;
		}
		if (module < 0) {
			module = (module * (-1));
		}
		return module;
	}

	/**
	 * Метод нахождения массива
	 */
	public static void newMass() {
		System.out.println("Введите длинну массива");
		int console = Console.readFromConsoleIntValue();
		int[] massiv = Matrix.createMass(console);
		Matrix.showMass(massiv);
	}
}