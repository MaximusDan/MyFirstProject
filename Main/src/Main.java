
/** 
 * Учебный проект
 * @author Максим Данилович
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/** Задание 11 */
		double methodDouble = Arifmetika.methodDouble(3, 4, 5);
		System.out.println(methodDouble);

		// int number1 = 0;
		boolean number2 = false;
		while (true) {
			System.out.println("Нажмите 1 для выполнения задания 2");
			System.out.println("Нажмите 2 для выполнения задания 6");
			System.out.println("Нажмите 0 если нечего не хотите делать");
			/** Переброс в метод */
			int number1 = Console.methodConsole();
			switch (number1) {
			case 0:
				number2 = true;
				System.out.println("Программа завершена");
				break;
			case 1:
				Main.lesson2();
				break;
			case 2:
				Main.lesson6();
				break;
			default:
				System.out.println("Введенное число неправильное");
			}
			if (number2) {
				break;
			}
		}
	}

	public static void lesson2() {
		boolean var = false;
		System.out.println();
		int value = 0, value1 = 0;
		while (true) {
			System.out.println("Введите правильно 1 число");
			System.out.println("Введите правильно 2 число");
			value = Console.methodConsole();
			value1 = Console.methodConsole();
			if (value1 != 0) {
				break;
			} else {
				System.out.println("2 число не должно ровняться 0");
			}
		}
		System.out.println("Введите действия которые Вы хотите совершить");
		while (true) {
			System.out.println("0 - Завершить задачу");
			System.out.println("1 - Сумма");
			System.out.println("2 - Умножение");
			System.out.println("3 - Деление");
			System.out.println("4 - Вычитание");
			int value3 = Console.methodConsole();

			switch (value3) {
			case 0:
				var = true;
				System.out.println("Задача завершена");
				break;
			case 1:
				Arifmetika.addition(value, value1);
				break;
			case 2:
				Arifmetika.multiplication(value, value1);
				break;
			case 3:
				Arifmetika.division(value, value1);
				break;
			case 4:
				Arifmetika.subtraction(value, value1);
				break;
			default:
				System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее");
			}
			if (var) {
				break;
			}
		}
	}

	public static void lesson6() {
		int value2 = 0;
		System.out.println();
		// Scanner sc2 = new Scanner(System.in);
		System.out.println("Задание 6: введите число");
		while (true) {
			// if (sc2.hasNextInt()) {
			// value2 = sc2.nextInt();
			value2 = Console.methodConsole();
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
