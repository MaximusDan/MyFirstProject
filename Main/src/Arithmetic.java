/**
 * @author Максим Данилович
 * 
 * Класс арифметики. Содержит методы с арифметическими операциями 
 */
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
				Arithmetic.add(value, value1);
				break;
			case 2:
				System.out.println("Введите первое число");
				value = Console.readFromConsoleIntValue();
				System.out.println("Введите второе число");
				value1 = Console.readFromConsoleIntValue();
				Arithmetic.multiply(value, value1);
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
				Arithmetic.divis(value, value1);
				break;
			case 4:
				System.out.println("Введите первое число");
				value = Console.readFromConsoleIntValue();
				System.out.println("Введите второе число");
				value1 = Console.readFromConsoleIntValue();
				Arithmetic.subtract(value, value1);
				break;
			case 5:
				System.out.println("Введите число делители которого Вы желаете найти");
				value2 = Console.readFromConsoleIntValue();
				Arithmetic.createDivider(value2);
				break;
			case 6:
				System.out.println("Введите число модуль которого Вы желаете найти");
				double value4 = Console.readFromConsoleDoubleValue();
				double showModule = Arithmetic.createModule(value4);
				System.out.println(showModule);
				break;
			default:
				System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее");
			}
			if (stopMethodArithmetic) {
				break;
			}
		}
	}

	/**
	 * Метод нахождения суммы переменных 
	 * @value variableA,variableB
	 */
	public static void add(int variableA, int variableB) {
		System.out.println("сложение = " + (variableA + variableB));
	}

	/**
	 * Метод умножения переменных
	 * @value variableA,variableB 
	 */
	public static void multiply(int variableA, int variableB) {
		System.out.println("умножение = " + (variableA * variableB));
	}

	/**
	 * Метод деления переменных 
	 * @value variableA,variableB
	 */
	public static void divis(int variableA, int variableB) {
		System.out.println("деление = " + (variableA / variableB));
	}

	/**
	 * Метод вычитания переменных
	 * @value variableA,variableB 
	 */
	public static void subtract(int variableA, int variableB) {
		System.out.println("вычитание = " + (variableA - variableB));
	}

	/**
	 * Метод нахождения делителей числа
	 * @value variableA
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
	 * @return возврат результата
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
	 * Метод нахождения рандомного значения из диапазона 
	 * @value randomMin,randomMax
	 * @return возврат результата
	 */
	
	public static int createRandom(int randomMin, int randomMax) {
		int a = (int) (Math.random() * (randomMax - randomMin + 1)) + randomMin;
		return a;
	}
}