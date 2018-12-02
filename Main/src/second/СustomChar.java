package second;

public class СustomChar {

    /**
     *Создаем свой метод isDigit #48 Прверяем является ли символ числом
     */
    public static void isDigit(char d) {

        int symbol = (int) d;

        System.out.println(symbol);

        if (symbol >= 48 && symbol <= 57 ) {
            System.out.println("Данный символ является числом");

        } else {
            System.out.println("Данный символ НЕ является числом");
        }
    }

    /**
     *Создаем свой метод isDigit2 #49 Прверяем является ли символ заглавной буквой
     */
    public static void isDigit2(char d) {

        int b = (int) d;

        System.out.println(b);

        if (b >= 65 && b <= 90 ) {
            System.out.println("Данный символ является заглавной буквой");

        } else {
            System.out.println("Данный символ НЕ является заглавной буквой");
        }
    }


    public static void isDigit3(char d) {

        int b = (int) d;

        System.out.println(b);

        if (b >= 65 && b <= 90 ) {
            System.out.println(d);

        } else {
            System.out.println("Данный символ НЕ является заглавной буквой");
        }
    }
}
