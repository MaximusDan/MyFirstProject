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
    public void equals(CustomString line1,CustomString line2) {

        System.out.println("Введите первую строчку");
        line1.line = Console.readFromConsoleStringValue();
        System.out.println("Введите вторую строчку");
        line2.line = Console.readFromConsoleStringValue();

        char[] massLine1 = CustomString.toCharArray(line1.line);
        char[] massLine2 = CustomString.toCharArray(line2.line);

        boolean a = true;

        if (massLine1.length != massLine2.length) {
            System.out.println("Строки различны");
        } else {
            for (int i = 0; i < massLine1.length; i++) {
                if (massLine1[i] != massLine2[i]) {
                    System.out.println("Строки различны");
                    a = false;
                    break;
                }
            }
        }
        if (a){
            System.out.println("Строки равны");
        }
    }
}
