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
     *Создаем свой метод isDigitBigSymbol #49 Прверяем является ли символ заглавной буквой
     */
    public static void isDigitBigSymbol(char d) {

        int b = (int) d;

        System.out.println(b);

        if (b >= 65 && b <= 90 ) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }


    public static void isDigit3(char d) {

        int b = (int) d;

        System.out.println(b);

        if (b >= 65 && b <= 90 ) {
            System.out.println(d);

        } else {
            System.out.println("False");
        }
    }

    /**
     *Метод преобразует символ к верхнему реистру #50
     */

    public static void createBigSymbol(char d) {

        int b = (int) d;

        if (b >= 65 && b <= 90) {    //проверка если уже заглавная буква
            System.out.println(d);

        }
        if (b >= 48 && b <= 57) {    //проверка если число
            System.out.println(d);
        }

        if (b >= 97 && b <= 122) {
            b = b - 32;
            d = (char) b;
            System.out.println(d);
        }
    }

    /**
     *Метод преобразует символ к нижнему реистру #51
     */
    public static void createSmallSymbol(char d) {

        int b = (int) d;

        if (b >= 97 && b <= 122) {    //проверка если уже НЕ заглавная буква
            System.out.println(d);

        }
        if (b >= 48 && b <= 57) {    //проверка если число
            System.out.println(d);
        }

        if (b >= 65 && b <= 90) {
            b = b + 32;
            d = (char)b;
            System.out.println(d);
        }
    }

}
