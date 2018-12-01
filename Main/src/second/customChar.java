package second;

public class customChar {

    public static void isDigit(char d) {
        int a = 0;
        int b = (int) d;

        System.out.println(b);

        if (b >= 48 && b <= 57 ) {
            System.out.println("Данный символ является числом");

        } else {
            System.out.println("Данный символ НЕ является числом");
        }

    }
}
