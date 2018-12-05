package second;
import first.Console;
public class СustomChar {

    /**
     *Создаем свой метод isDigit #48 Прверяем является ли символ числом
     */
    public static boolean isDigit(char d) {

        int symbol = (int) d;

        if (symbol >= 48 && symbol <= 57) {
            return true;
        }
        return false;
    }

    /**
     *Создаем свой метод isDigitBigSymbol #49 Прверяем является ли символ заглавной буквой
     */
    public static boolean isDigitBigSymbol(char d) {

        int b = (int) d;

        if (b >= 65 && b <= 90 ) {
            return true;

        }
        return false;
    }


    /**
     *Метод преобразует символ к верхнему реистру #50
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
     *Метод преобразует символ к нижнему реистру #51
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
            d = (char)b;
            return d;
        }
        return d;
    }

    /**
     * Метод вырезает вырезает строку и выводит оставшуюся часть #54
     */
    public static char[] showString(int firstIndex, int lastIndex) {

        System.out.println("Введите строку");
        String line = Console.readFromConsoleStringValue();

        int length = line.length();

        char[] symbolMass = new char[length];

        for (int i = 0; i < length; i++) {
            symbolMass[i] = line.charAt(i);
        }
        char[] symbolMassLength = new char[symbolMass.length - (lastIndex - firstIndex)];

        for (int i = 0; i < firstIndex - 1; i++) {   //заполнили до вырезанной части
            symbolMassLength[i] = symbolMass[i];
        }

        int x = lastIndex;
        for (int i = firstIndex; i < symbolMassLength.length; i++) {
            symbolMassLength[i] = symbolMass[x];
            x++;
        }
        return symbolMassLength;
    }


    /**
     *Метод вырезает из строки подстроку и выводит ее #53
     */
    public static char[] showSubString(int firstIndex, int lastIndex) {

        System.out.println("Введите строку");
        String line = Console.readFromConsoleStringValue();

        int length = line.length();

        char[] symbolMass = new char[length];

        for (int i = 0; i < length; i++) {
            symbolMass[i] = line.charAt(i);
        }
        char[] symbolMassLength = new char[lastIndex - firstIndex + 1];

        int i = firstIndex - 1;

        for (int x = 0; x < symbolMassLength.length; x++) {
            symbolMassLength[x] = symbolMass[i];
            i++;
        }
        return symbolMassLength;
    }
}
