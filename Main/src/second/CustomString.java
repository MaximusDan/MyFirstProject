package second;
import first.Console;
public class CustomString {


    public static char[] toCharArray(String d) {

        int a = d.length();
        char[] createSymbolMass = new char[a];
        for (int i = 0; i < a; i++) {
            createSymbolMass[i] = d.charAt(i);
            System.out.println(createSymbolMass[i]);
        }
        return createSymbolMass;
    }

    public static void equals() {
        System.out.println("Введите первую строчку");
        String line1 = Console.readFromConsoleStringValue();
        System.out.println("Введите вторую строчку");
        String line2 = Console.readFromConsoleStringValue();

        char[] massLine1 = CustomString.toCharArray(line1);
        char[] massLine2 = CustomString.toCharArray(line2);

        int a = 0;

        if (massLine1.length != massLine2.length) {
            System.out.println("Строки различны");
        } else {
            for (int i = 0; i < massLine1.length; i++) {
                if (massLine1[i] != massLine2[i]) {
                    System.out.println("Строки различны");
                    break;
                }else{
                    a++;
                }
            }
        }
        if (a == massLine1.length){
            System.out.println("Строки равны");
        }
    }
}
