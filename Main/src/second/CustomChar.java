package second;

import first.Console;

public class CustomChar {

    /**
     * Создаем свой метод isDigit #48 Прверяем является ли символ числом
     */
    public static boolean isDigit(char d) {

        int symbol = (int) d;

        if (symbol >= 48 && symbol <= 57) {
            return true;
        }
        return false;
    }

    /**
     * Создаем свой метод isDigitBigSymbol #49 Прверяем является ли символ заглавной буквой
     */
    public static boolean isDigitBigSymbol(char d) {

        int b = (int) d;

        if (b >= 65 && b <= 90) {
            return true;

        }
        return false;
    }


    /**
     * Метод преобразует символ к верхнему реистру #50
     */

    public static char createBigSymbol(char d) {

        int b = (int) d;

        if (b >= 65 && b <= 90) {    //проверка если уже заглавная буква
            return d;

        }
        if (b >= 48 && b <= 57) {    //проверка если число
            return d;
        }

        if (b >= 97 && b <= 122) {
            b = b - 32;
            d = (char) b;
            return d;
        }
        return d;
    }

    /**
     * Метод преобразует символ к нижнему реистру #51
     */
    public static char createSmallSymbol(char d) {

        int b = (int) d;

        if (b >= 97 && b <= 122) {    //проверка если уже НЕ заглавная буква
            return d;

        }
        if (b >= 48 && b <= 57) {    //проверка если число
            return d;
        }

        if (b >= 65 && b <= 90) {
            b = b + 32;
            d = (char) b;
            return d;
        }
        return d;
    }
}
