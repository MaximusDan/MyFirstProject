
/** Класс матриц. Содержит методы с матрицами и массивами. */
public class Matrix {
	/** Главное меню класса Matrix */
	public static void menuMatrix() {
		int[] massiv = null;
		int average = 0;
		while (true) {
			System.out.println("Нажмите 0 если нечего не хотите делать");
			System.out.println("Нажмите 1 для создания и заполнения массива");
			System.out.println("Нажмите 2 для подсчета среднего арифметического элементов массива");
			System.out.println("Нажмите 3 для вывода массива");
			
			boolean stopMethodMatrix = false;
			switch (Console.readFromConsoleIntValue()) {
			case 0:
				stopMethodMatrix = true;
				System.out.println("Программа завершена");
				break;
			case 1:
				massiv = Matrix.createMass();
				break;
			case 2:
				average = Matrix.averageArithmetic(massiv);
				System.out.println(average);
				break;
			case 3:
				Matrix.showMass(massiv);
				break;
			}
				if (stopMethodMatrix) {
					break;
			}
		}
	}
	/**
	 * Метод создания и заполнения массива
	 * @param length количество элементов в массиве(длина массива)
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
			mass[i] = Arithmetic.createRandom(randomMin,randomMax);
		}
		return mass;
	}
	
	/** Метод нахождения среднего арифметического элементов массива 
	 * @return - возвращает среднее арифметическое
	 * */
	
	public static int averageArithmetic(int[] average) {
		int value = 0, value1 = 0;
		for (int i = 0; i < average.length; i++) {
			value = value + average[i];
			value1++;
		}
		return value / value1;
	}

	/** Метод вывода массива */
	public static void showMass(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
