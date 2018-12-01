package second;

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
}
