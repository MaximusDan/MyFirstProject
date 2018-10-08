
/**
 * Учебный проект
 * 
 * @author Максим Данилович
 */

public class Main {

	public static void main(String[] args) {

		/** Задание 11 */
		double methodDouble = Arifmetika.methodDouble(3, 4, 5);
		System.out.println(methodDouble);

		/** Главное меню прложения */
		boolean number2 = false;
		while (true) {
			System.out.println("Нажмите 1 для выполнения арифметических действий");
			System.out.println("Нажмите 0 если нечего не хотите делать");

			int number1 = Console.methodConsole();
			switch (number1) {
			case 0:
				number2 = true;
				System.out.println("Программа завершена");
				break;
			case 1:
				Arifmetika.arifmetika();
				break;
			default:
				System.out.println("Введенное число неправильное");
			}
			if (number2) {
				break;
			}
		}
	}
}
