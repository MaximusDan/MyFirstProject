/**Учебный проект
 * 
 * @author Максим Данилович
 * 
 * Главный класс. Сожержит главное меню программы 
 * */
public class Main {

	/** Главное меню программы */
	public static void main(String[] args) {

		boolean stopProject = false;
		while (true) {
			System.out.println("Нажмите 0 если нечего не хотите делать");
			System.out.println("Нажмите 1 для выполнения арифметических действий");
			System.out.println("Нажмите 2 для выполнения действий с массивами или матрицей");
			switch (Console.readFromConsoleIntValue()) {
			case 0:
				stopProject = true;
				System.out.println("Программа завершена");
				break;
			case 1:
				Arithmetic.arithmeticMenu();
				break;
			case 2:
				Matrix.menuMatrix();
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
