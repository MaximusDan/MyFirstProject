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
		//for (int i = 1; i <= 100; i++) {
			//System.out.print(i + " ");
		//}
		
		/** 
		 * ЗАДАЧА 2
		 * Метод While
		 * Создание 2-х объектов класса Scanner
		 *  */
		int value = 0, value1 = 0;
		System.out.println();
		while (true) {
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Введите правильно 1 число");
			System.out.println("Введите правильно 2 число");
			
			 /**Проверка, что обьекты имеют тип int
			 * Внесение объекта в переменную*/
			if (sc.hasNextInt() && sc1.hasNextInt()) {
				value = sc.nextInt();
				value1 = sc1.nextInt();
				
				 /**Проверка, что делитель не является нулем
				 * Арифметические действия*/
				if (value1 != 0) {
					System.out.println("сложение = " + (value + value1));
					System.out.println("умножение = " + (value * value1));
					System.out.println("деление = " + (value / value1));
					System.out.println("вычитание = " + (value - value1));
					break;
				} else {
					System.out.println("2 число не должно ровняться 0");
				}
			}else {
				System.out.println("Одно из введенных чисел неверно");
			}
		} 
		
		/**Делители числа #6
		 * Ввести с консоли новое числа и вывести все делители этого числа( делители числа - это те числа, на которые оно делится без остатка)*/
		int value2 = 0;
		System.out.println();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Введите число");
		while (true) {
			/** Проверка, что обьект имеет тип int */
			if (sc2.hasNextInt()) {
				value2 = sc2.nextInt();

				/** Проверяем что бы переменная не была нолем и выводим делители */
				if (value2 != 0) {
					for (int i = 1; i <= value2; i++) {
						if ((value2 % i) == 0) {
							System.out.println(i);
						}
					}
				} else {
					System.out.println("Введите другое число");
				}
			}
		}
	}

}