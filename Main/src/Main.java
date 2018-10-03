/** 
 * Учебный проект
 * @author Максим Данилович
 */

/** Импортируем класс из пакета java.util*/
import java.util.Scanner;

/** Главный класс */
public class Main {

	/** 
	 * ЗАДАЧА 1
	 * Главный метод
	 * Цикл for перебирающий значения от 1-100 */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		/** 
		 * ЗАДАЧА 2
		 * Метод While
		 * Создание 2-х объектов класса Scanner
		 * Внесение объектов в переменные
		 * арифметические действия с переменными
		 *  */
		// Задача 2
		int value = 0, value1 = 0;
		System.out.println();
		while (true) {
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Введите правильно 1 число");
			System.out.println("Введите правильно 2 число");
			
			if (sc.hasNextInt() && sc1.hasNextInt()) {
				value = sc.nextInt();
				value1 = sc1.nextInt();

				System.out.println("сложение = " + (value + value1));
				System.out.println("умножение = " + (value * value1));
				System.out.println("деление = " + (value / value1));
				System.out.println("вычитание = " + (value - value1));
				break;
			}else {
				System.out.println("Одно из введенных чисел неверно" );
			}
			
		}
	}
}