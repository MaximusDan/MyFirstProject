/** 
 * Учебный проект
 * @author Максим Данилович
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main.lesson2();
		Main.lesson6();
	}

	static void lesson2() {
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
				if (value1 != 0) {
					System.out.println("сложение = " + (value + value1));
					System.out.println("умножение = " + (value * value1));
					System.out.println("деление = " + (value / value1));
					System.out.println("вычитание = " + (value - value1));
					break;
				} else {
					System.out.println("2 число не должно ровняться 0");
				}
			} else {
				System.out.println("Одно из введенных чисел неверно");
			}
		}
	}

	static void lesson6() {
		int value2 = 0;
		System.out.println();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Введите число");
		while (true) {
			if (sc2.hasNextInt()) {
				value2 = sc2.nextInt();

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
		/** 
		 * ЗАДАЧА 2
		 * Метод While
		 * Создание 2-х объектов класса Scanner
		 *  
		int value = 0, value1 = 0;
		System.out.println();
		while (true) {
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Введите правильно 1 число");
			System.out.println("Введите правильно 2 число");
			
			 Проверка, что обьекты имеют тип int
			 * Внесение объекта в переменную
			if (sc.hasNextInt() && sc1.hasNextInt()) {
				value = sc.nextInt();
				value1 = sc1.nextInt();
				
				 Проверка, что делитель не является нулем
				 * Арифметические действия
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
		*/
		/**Делители числа #6
		 * Ввести с консоли новое числа и вывести все делители этого числа( делители числа - это те числа, на которые оно делится без остатка)*/
		//int value2 = 0;
		//System.out.println();
		//Scanner sc2 = new Scanner(System.in);
		//System.out.println("Введите число");
		//while (true) {
			/** Проверка, что обьект имеет тип int */
			//if (sc2.hasNextInt()) {
				//value2 = sc2.nextInt();

				/** Проверяем что бы переменная не была нолем и выводим делители */
				//if (value2 != 0) {
					//for (int i = 1; i <= value2; i++) {
						//if ((value2 % i) == 0) {
							//System.out.println(i);
						//}
					//}
				//} else {
					//System.out.println("Введите другое число");
				//}
			//}
		//}