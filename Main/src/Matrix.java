import first.Arithmetic;
import first.Console;

public class Matrix {
	/** Главное меню класса Matrix */
	public static void menuMatrix() {
		int[] massiv = null;
		int average = 0;
		while (true) {
			System.out.println("Нажмите 0 если нечего не хотите делать");
			System.out.println("Нажмите 1 для вывода массива");
			System.out.println("Нажмите 2 для создания и заполнения массива");
			System.out.println("Нажмите 3 для подсчета среднего арифметического элементов массива");
			System.out.println("Нажмите 4 для нахождения числа введенного с консоли в массиве");
			System.out.println("Нажмите 5 что бы узнать сколько раз встречается число в массиве введенное с консоли");
			System.out.println("Нажмите 6 что бы перевести значения массива по модулю");
			boolean stopMethodMatrix = false;
			switch (Console.readFromConsoleIntValue()) {
				case 0:
					stopMethodMatrix = true;
					System.out.println("Программа завершена");
					break;
				case 1:
					Matrix.showMass(massiv);
					break;
				case 2:
					massiv = Matrix.createMass();
					System.out.println("Массив создан");
					break;
				case 3:
					average = Matrix.averageArithmetic(massiv);
					System.out.println(average);
					break;
				case 4:
					System.out.println("Введите число с которым Вы хотите сравнить");
					int value = Console.readFromConsoleIntValue();
					boolean bol = Matrix.comparisonWithValue1(massiv, value);
					System.out.println(bol);
					break;
				case 5:
					System.out.println("Введите число с которым Вы хотите сравнить");
					int point = Console.readFromConsoleIntValue();
					int point2 = Matrix.comparisonWithValue2(massiv, point);
					System.out.println(point2);
					break;
				case 6:
					int [] valueModule = Matrix.number26(massiv);
					Matrix.showMass(valueModule);
					break;
				default:
					System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее"); //проверка на ввод только номеров case
			}
			if (stopMethodMatrix) {
				break;
			}
		}
	}
	/**
	 * Метод создания и заполнения массива
	 */
	public static int[] createMass() {
		System.out.println("Введите длину массива");
		int massLength = Console.readFromConsoleIntValue();
		int[] mass = new int[massLength];
		System.out.println("Введите минимальное значение массива");
		int randomMin = Console.readFromConsoleIntValue();
		System.out.println("Введите максимальное значение массива");
		int randomMax = Console.readFromConsoleIntValue();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = Arithmetic.createRandom(randomMin, randomMax);
		}
		return mass;
	}

	/** Метод нахождения среднего арифметического элементов массива
	 * */

	public static int averageArithmetic(int[] average) {
		int value = 0;
		for (int i = 0; i < average.length; i++) {
			value = value + average[i];
		}
		return value / average.length;
	}
	/** Метод выяснения есть ли в массиве число которое введи с консоли.
	 * */
	public static boolean comparisonWithValue1(int[] mass, int value1) {
		boolean bol1 = false;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == value1) {
				bol1 = true;
				break;
			}
		}
		return bol1;
	}

	/** Метод, что бы узнать сколько раз встречается число в массиве введенное с консоли
	 */
	public static int comparisonWithValue2(int[] mass, int point1) {
		int a=0; //счетчик
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == point1) {
				a++;
			}
		}
		return a;
	}

	/** Метод вывода массива */
	public static void showMass(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	/** Метод нахождения значений (по модулю) одномерного массива
	 */
	public static int[] number26(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			int value = Arithmetic.createModuleInt(mass[i]);
			mass[i] = value;
		}
		return mass;
	}
}
