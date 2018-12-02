package second;
import first.Console;
public class CustomString {

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
    public static void equals() {
        System.out.println("Введите первую строчку");
        String line1 = Console.readFromConsoleStringValue();
        System.out.println("Введите вторую строчку");
        String line2 = Console.readFromConsoleStringValue();

        char[] massLine1 = CustomString.toCharArray(line1);
        char[] massLine2 = CustomString.toCharArray(line2);

        boolean a = false;

        if (massLine1.length != massLine2.length) {
            System.out.println("Строки различны");
        } else {
            for (int i = 0; i < massLine1.length; i++) {
                if (massLine1[i] != massLine2[i]) {
                    System.out.println("Строки различны");
                    break;
                }else{
                    a = true;
                }
            }
        }
        if (a){
            System.out.println("Строки равны");
        }
    }
}
