/**
 * @author Максим Данилович
 *
 * Класс матриц. Содержит методы с матрицами и массивами.
 */
public class Matrix {
	/** Главное меню класса Matrix */
	public static void menuMatrix() {
		int[] massiv = null;
		int[][] massivDuo = null;
		int average = 0;
		while (true) {
			System.out.println("Нажмите 0 если нечего не хотите делать");
			System.out.println("Нажмите 1 для вывода массива");
			System.out.println("Нажмите 2 для создания и заполнения массива");
			System.out.println("Нажмите 3 для подсчета среднего арифметического элементов массива");
			System.out.println("Нажмите 4 для нахождения числа введенного с консоли в массиве");
			System.out.println("Нажмите 5 что бы узнать сколько раз встречается число в массиве введенное с консоли");
			System.out.println("____________________________________________________________________________________");
			System.out.println("Нажмите 6 для создания и заполнения двумерного массива");
			System.out.println("Нажмите 7 для вывода двумерного массива");
			System.out.println("Нажмите 8 для подсчета среднего арифметического элементов двумерного массива");
			System.out.println("Нажмите 9 для нахождения числа введенного с консоли в двумерном массиве");
			System.out.println("Нажмите 10 что бы узнать сколько раз встречается число в двумерном массиве введенное с консоли");
			System.out.println("________________________________________________________________________________________________");
			System.out.println("Нажмите 11 что бы перевести значения массива по модулю");
			System.out.println("Нажмите 12 что бы перевести значения двумерного массива по модулю");
			System.out.println("Нажмите 13 что бы вывести номер строки в котором сумма элементов двумерного массива больше чем в других строках.");
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
					massivDuo = Matrix.createDuoMass();
					System.out.println("Массив создан");
					break;
				case 7:
					Matrix.showMassDuo(massivDuo);
					break;
				case 8:
					average = Matrix.averageArithmeticDuo(massivDuo);
					System.out.println(average);
					break;
				case 9:
					System.out.println("Введите число с которым Вы хотите сравнить");
					int valueDuo = Console.readFromConsoleIntValue();
					boolean bolDuo = Matrix.comparisonWithValue1Duo(massivDuo, valueDuo);
					System.out.println(bolDuo);
					break;
				case 10:
					System.out.println("Введите число с которым Вы хотите сравнить");
					int pointDuo = Console.readFromConsoleIntValue();
					int point2Duo = Matrix.comparisonWithValue2Duo(massivDuo, pointDuo);
					System.out.println(point2Duo);
					break;
				case 11:
					int [] valueModule = Matrix.number26(massiv);
					Matrix.showMass(valueModule);
					break;
				case 12:
					int [][] valueModuleDuo = Matrix.number26Duo(massivDuo);
					Matrix.showMassDuo(valueModuleDuo);
					break;
				case 13:
					Matrix.number27Element(massivDuo);
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
	/**
	 * Метод создания и заполнения двумерного массива
	 */
	public static int[][] createDuoMass() {
		System.out.println("Введите колличество строк");
		int massLength1 = Console.readFromConsoleIntValue();
		System.out.println("Введите колличество столбцов");
		int massLength2 = Console.readFromConsoleIntValue();
		int[][] massDuo = new int[massLength1][massLength2];
		System.out.println("Введите минимальное значение массива");
		int randomMin = Console.readFromConsoleIntValue();
		System.out.println("Введите максимальное значение массива");
		int randomMax = Console.readFromConsoleIntValue();
		for (int i = 0; i < massDuo.length; i++) {
			for (int j = 0; j < massDuo[i].length; j++) {
				massDuo[i][j] = Arithmetic.createRandom(randomMin, randomMax);
			}

		}
		return massDuo;
	}
	/** Метод вывода массива */
	public static void showMassDuo(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	/** Метод нахождения среднего арифметического элементов двумерного массива
	 * */
	public static int averageArithmeticDuo(int[][] average) {
		int value = 0;
		int value1 = 0;
		for (int i = 0; i < average.length; i++) {
			for (int j = 0; j < average[i].length; j++) {
				value = value + average[i][j];
				value1++;
			}
		}
		return value / value1;
	}
	/** Метод выяснения есть ли в массиве число которое введи с консоли.
	 * */
	public static boolean comparisonWithValue1Duo(int[][] mass, int value1) {
		boolean bol1 = false;
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] == value1) {
					bol1 = true;
					break;
				}
			}
		}
		return bol1;
	}

	/** Метод, что бы узнать сколько раз встречается число в массиве введенное с консоли
	 * */
	public static int comparisonWithValue2Duo(int[][] mass, int point1) {
		int a = 0; // счетчик
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] == point1) {
					a++;
				}
			}
		}
		return a;
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
	/** Метод нахождения значений (по модулю) двумерного массива
	 */
	public static int[][] number26Duo(int[][] mass) {
		for(int i=0; i < mass.length; i++) {
			for(int j=0; j < mass[i].length; j++) {
				int value = Arithmetic.createModuleInt(mass[i][j]);
				mass[i][j] = value;
			}
		}
		return mass;
	}
	/** Метод нахождения строки сумма элементов которой больше чем у других
	 */
	public static void number27Element(int[][] mass) {
		int value = 0; // счетчик элементов строки массива
		int value1 = 0, k = 0;
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				value = value + mass[i][j];
			}
			if (value > value1) { // проверяем на больше
				value1 = value;
				k = i;
			}
			value = 0;
		}
		System.out.println("В строке" + " " + (k) + " " + "сумма элементов массива больше чем в дргих");
	}
}
