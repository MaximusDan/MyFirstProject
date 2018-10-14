
/** Класс матриц. Содержит методы с матрицами и массивами. */
public class Matrix {
	public static int[] massiv;
	public static void menuMatrix() {
		while (true) {
			System.out.println("Нажмите 0 если нечего не хотите делать");
			System.out.println("Нажмите 1 для создания и заполнения массива");
			System.out.println("Нажмите 2 для вывода массива");
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
	 * 
	 * @param length количество элементов в массиве(длина массива)
	 */
	public static int[] createMass() {
		System.out.println("Введите длину массива");
		int massLength = Console.readFromConsoleIntValue();
		int[] mass = new int[massLength];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 100) + 1;

		}
		return mass;
	}

	/** Метод вывода массива */
	public static void showMass(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
