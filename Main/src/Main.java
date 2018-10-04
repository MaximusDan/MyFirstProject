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

	public static void lesson2() {
		int value = 0, value1 = 0, value3 = 0; // value3 - переменная в которую вносится обьект класса sc3.
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
					break;
				} else {
					System.out.println("2 число не должно ровняться 0");
				}
			} else {
				System.out.println("Одно из введенных чисел неверно");
			}
		}
		System.out.println("Теперь введите действия которые Вы хотите совершить");
		while (true) {
			System.out.println("0 - Сумма данных чисел");
			System.out.println("1 - Умножение данных чисел");
			System.out.println("2 - Деление данных чисел");
			System.out.println("3 - Вычитание данных чисел");
			System.out.println("4 - Закончить действия");
			while (true) {
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Сделайте свой выбор");
				if (sc3.hasNextInt()) {
					value3 = sc3.nextInt();
					if (value3 >= 0 && value3 <= 4) {
						break;
					} else {
						System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее");
					}
				}
			}
			switch (value3) {
			case 0:
				System.out.println("сложение = " + (value + value1));
				break;
			case 1:
				System.out.println("умножение = " + (value * value1));
				break;
			case 2:
				System.out.println("деление = " + (value / value1));
				break;
			case 3:
				System.out.println("вычитание = " + (value - value1));
				break;
			}
			if (value3 == 4) {
				break;
			}
		}
	}

	public static void lesson6() {
		int value2 = 0;
		System.out.println();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Задание 6: введите число");
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
		