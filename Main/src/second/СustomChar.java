package second;
import first.Console;
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

    /**
     *Метод вырезает из строки кусок и выводит его #52
     */
    public static void showString(int a, int b) {

        System.out.println("Введите строку");
        String line = Console.readFromConsoleStringValue();

        int length = line.length();

        char[] symbolMass = new char[length];

        for (int i = 0; i < length; i++) {
            symbolMass[i] = line.charAt(i);
        }

        for (int i = 0; i < a; i++) {
            System.out.print(symbolMass[i]);
        }
        for (int i = b - 1; i < length; i++) {
            System.out.print(symbolMass[i]);
        }
    }
}
