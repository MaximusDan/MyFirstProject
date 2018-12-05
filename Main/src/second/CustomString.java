package second;
import first.Console;
public class CustomString {
String line;
    /**
     *Создаем свой метод toCharArray #46 Разбиваем строку на массив символов.
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
     *Создаем свой метод equals #47 Сравниваем строки на равенство.
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
}
