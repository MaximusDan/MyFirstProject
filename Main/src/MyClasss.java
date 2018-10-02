import java.util.Scanner; //импортируем из библиотеки данный класс

public class MyClasss {           //создаем главный класс

	public static void main(String[] args) {                //создаем главный метод         
		int i = 1, x = 1;                                   //создаем 2 переменные
		
			while(true) {
				Scanner sc = new Scanner(System.in);    //создаем 1 обьект класса
				Scanner sc1 = new Scanner(System.in);   //создаем 2 обьект класса
				System.out.println("Введите правильно 1 число");
				System.out.println("Введите правильно 2 число");
				if (sc.hasNextInt() && sc1.hasNextInt()) {            //проверяем являются ли наши обьекты числами
					i = sc.nextInt();                          //вносим в переменную i число
					x = sc1.nextInt();                         //вносим в переменную x число
					
					System.out.println("сложение = " + (i + x));
					System.out.println("умножение = " + (i * x));
					System.out.println("деление = " + (i / x));
					System.out.println("вычитание = " + (i - x));
					break;
	}
	}
	}
}
