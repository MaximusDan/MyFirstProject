package second;

public class customChar {

    /**
     *Создаем свой метод isDigit #48 Прверяем является ли символ числом
     */
    public static void isDigit(char d) {

        int b = (int) d;

        System.out.println(b);

        if (b >= 48 && b <= 57 ) {
            System.out.println("Данный символ является числом");

        } else {
            System.out.println("Данный символ НЕ является числом");
        }

    }
}
