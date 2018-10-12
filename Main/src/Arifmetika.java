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
			
			boolean stopVoidArifmetika = false;
			switch (Console.readFromConsoleIntValue()) {
			case 0:
				stopVoidArifmetika = true;
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
				while(true) {
					value1 = Console.readFromConsoleIntValue();
					if(value1 != 0) {
						break;
					}else {
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
				Arifmetika.Divider(value2);
				break;
			case 6:
				System.out.println("Введите число модуль которого Вы желаете найти");
				double value4 = Console.readFromConsoleDoubleValue(); 
				double a = Arifmetika.Module(value4); 
				System.out.println(a);
				break;
			case 7:
				Arifmetika.newMass(); 
				break;
			default:
				System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее");
			}
			if (stopVoidArifmetika) {
				break;
			}
		}
	}

	/**Метод нахождения суммы переменных
	 * @param value, value1 значения переменных
	 */
	public static void add(int a, int b) {
		System.out.println("сложение = " + (a + b));
	}

	/**Метод умножения переменных
	 * @param value, value1 значения переменных
	 */
	public static void multiply(int a, int b) {
		System.out.println("умножение = " + (a * b));
	}

	/**Метод деления переменных
	 * @param value, value1 значения переменных
	 */
	public static void divis(int a, int b) {
		System.out.println("деление = " + (a / b));
	}

	/**Метод вычитания переменных
	 * @param value, value1 значения переменных
	 */
	public static void subtract(int a, int b) {
		System.out.println("вычитание = " + (a - b));
	}
	
	/** Метод нахождения делителей числа
	 * @param value2 значение переменной
	 */
	public static void Divider(int a) {
		for (int i = 1; i <= a; i++) {
			if ((a % i) == 0) {
				System.out.println(i);
			}
		}
	}

	/** Метод нахождения модуля числа
	 * @param value4 значение переменной
	 */
	public static double Module(double a) {
		if (a >= 0) {
			a = a;
		}
		if (a < 0) {
			a= (a *(-1));
		}
		return a;
	}
	/** Метод нахождения массива
    */
	public static void newMass() {
		System.out.println("Введите длинну массива");
		int m = Console.readFromConsoleIntValue();
		int [] massiv = Matrix.createMass(m);
		Matrix.showMass(massiv);
	}
}