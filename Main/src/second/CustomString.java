package second;

import first.Console;

public class CustomString {

    String line;

    /**
     * Создаем свой метод toCharArray #46 Разбиваем строку на массив символов.
     */
    public static char[] toCharArray(String d) {

        int length = d.length();
        char[] createSymbolMass = new char[length];
        for (int i = 0; i < length; i++) {
            createSymbolMass[i] = d.charAt(i);
        }
        return createSymbolMass;
    }

    /**
     * Создаем свой метод equals #47 Сравниваем строки на равенство.
     */
    public boolean equals(CustomString line2) {

        System.out.println("Введите первую строчку");
        this.line = Console.readFromConsoleStringValue();
        System.out.println("Введите вторую строчку");
        line2.line = Console.readFromConsoleStringValue();

        char[] massLine1 = CustomString.toCharArray(this.line);
        char[] massLine2 = CustomString.toCharArray(line2.line);

        boolean a = true;

        if (massLine1.length != massLine2.length) {
            return false;
        } else {
            for (int i = 0; i < massLine1.length; i++) {
                if (massLine1[i] != massLine2[i]) {
                    a = false;
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Метод вырезающий из строки кусочек  и выводит оставшуюся часть #52
     */
    public static String showString(int firstIndex, int lastIndex) {

        System.out.println("Введите строку");
        String line = Console.readFromConsoleStringValue();

        int length = line.length();     //находим длину строки

        char[] symbolMass = new char[length];    //содаем массив символов

        for (int i = 0; i < length; i++) {    //заполняем его
            symbolMass[i] = line.charAt(i);
        }
        char[] symbolMassLength = new char[symbolMass.length - (lastIndex - firstIndex)];  //создаем массив символов, который мы выведем (оставшаяся часть)

        for (int i = 0; i < firstIndex; i++) {   //заполнили до вырезанной части
            symbolMassLength[i] = symbolMass[i];
        }

        int x = lastIndex;
        for (int i = firstIndex; i < symbolMassLength.length; i++) {   //заполнили после вырезанной части
            symbolMassLength[i] = symbolMass[x];
            x++;
        }

        String lineMass = new String(symbolMassLength);     //преводим массив символов в строку

        return lineMass;
    }

    /**
     * Метод вырезает из строки подстроку и выводит ее #53
     */
    public static String showSubString(int firstIndex, int lastIndex) {

        System.out.println("Введите строку");
        String line = Console.readFromConsoleStringValue();

        int length = line.length();

        char[] symbolMass = new char[length];

        for (int i = 0; i < length; i++) {
            symbolMass[i] = line.charAt(i);
        }
        char[] symbolMassLength = new char[lastIndex - firstIndex + 1];

        int i = firstIndex;

        for (int x = 0; x < symbolMassLength.length; x++) {
            symbolMassLength[x] = symbolMass[i];
            i++;
        }

        String lineMass = new String(symbolMassLength);

        return lineMass;

    }
}

