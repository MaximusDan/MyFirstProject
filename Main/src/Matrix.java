/**
 * @author Максим Данилович
 * 
 * Отвечает за работу с матрицами
 */
public class Matrix {
	
	/** 
	* Главное меню класса Matrix 
	*/
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
			}
				if (stopMethodMatrix) {
					break;
			}
		}
	}
	
	/**
	 * Создаёт и заполняет массив
	 *
	 * @return возвращает массив
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
	
	/** 
	 * Находит среднее арифметическое элементов массива
	 *
	 * @param average массив в котором будет вычисляться среднее арифметическое
	 * @return возвращает среднее арифметическое 
	 */
	public static int averageArithmetic(int[] average) {
		int value = 0;
		for (int i = 0; i < average.length; i++) {
			value = value + average[i];
		}
		return value / average.length;
	}
	
	/**
	 * Проверяет есть ли в массив значение, которое мы передали в метод
	 * 
	 * @param mass массив, в котором будет выполняться поиск числа
	 * @param value1 число, которое будет искаться в массиве
	 * @return - возвращает true или false
	 */
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
	
	/** 
	 * Подсчитывает сколько раз число встречается в массиве
	 *
	 * @param mass массив, в котором будет выполняться поиск числа
	 * @param point1 число, которое будет искаться в массиве
	 * @return - результат подсчёта(количество)
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

	/** 
	* Выводит массив на консоль
	*
	* @param a массив, который будет выведен на консоль
	*/
	public static void showMass(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
