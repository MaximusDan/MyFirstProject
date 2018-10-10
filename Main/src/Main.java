
/**
 * Учебный проект
 * 
 * @author Максим Данилович
 */

/**Главный класс*/
public class Main {
	
	/** Главное меню прложения */
	public static void main(String[] args) {

		boolean stopProject = false;
		while (true) {
			System.out.println("Нажмите 1 для выполнения арифметических действий");
			System.out.println("Нажмите 0 если нечего не хотите делать");

			switch (Console.readFromConsoleIntValue()) {
			case 0:
				stopProject = true;
				System.out.println("Программа завершена");
				break;
			case 1:
				Arifmetika.arifmetikaMenu();
				break;
			default:
				System.out.println("Введенное число неправильное");
			}
			if (stopProject) {
				break;
			}
		}
	}
}
