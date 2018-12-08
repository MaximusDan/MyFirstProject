package second;

import first.Console;
import java.util.Arrays;

public class ClassFromBook {
    public static  String[] mass;

    public static void createMass() {
        System.out.println("Введите длину массива");
        ClassFromBook.mass = new String[Console.readFromConsoleIntValue()];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Console.readFromConsoleStringValue();
            if (mass[i].equals("end") == true) {
                for (int j = i; j < mass.length;j++ ) {
                    mass[j] = String.valueOf(j);
                    i++;
                }
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        ClassFromBook.arraySort(mass);  //Сортировка массива по длине
        ClassFromBook.showDoubleLine(mass);  //Ищем повторяшки
        ClassFromBook.showThreeElement(mass);  //Выводим 3 последних элемента самой длинной строки
        ClassFromBook.secondLineBig(mass);  //Метод преобразует 2 строку к верхнему регистру
        ClassFromBook.shotLine(mass);  //Метод определяет явзяется ли 2 символ самой короткой строки цифрой.
    }

    /**
     * Сортировка массива по длине
     */
    public static void arraySort(String[] mass2){
    Arrays.sort(mass2);
        for (int i = 0; i < mass2.length; i++) {
            System.out.println(mass2[i]);
        }
    }

    /**
     * Ищем повторяшки
     */
    public static void showDoubleLine(String[] mass2) {
        int b = 0;
        for (int i = 0; i < mass2.length - 1; i++) {
            for (int j = i + 1; j < mass2.length; j++) {
                if (mass2[i].equals(mass2[j]) == true) {
                    b++;
                }
            }
            if (b > 0) {
                System.out.println("Слово " + mass2[i] + " встречается больше одного раза");
                b = 0;
            }
        }
    }

    /**
     * Выводим 3 последних элемента самой длинной строки
     */
    public static void showThreeElement(String[] mass2) {
        int a = 0, b = 0;
        for (int i = 0; i < mass2.length; i++) {
            int longString = mass2[i].length();
            if (longString > a) {
                a = longString;
                b = i;
            }
        }
        char [] massLongString = mass2[b].toCharArray();
        System.out.println("Последние три символа самой длинной строки");
        for (int i = massLongString.length -3; i < massLongString.length; i++) {
            System.out.println(massLongString[i]);
        }
        //ClassFromBook.splitLine(mass2[b]);  //Метод разделяет самую длинную строку на слова
    }

    /**
     * Метод преобразует 2 строку к верхнему регистру
     */
    public static void secondLineBig(String[] mass2) {
        System.out.println("Преобразуем 2 строку в верхнему регистру");
        System.out.println(mass2[1].toUpperCase());
    }

    /**
     * Метод разделяет самую длинную строку на слова. Вызываем его в методе showThreeElement
     */
    public static void splitLine(String mass2) {
        String[] massSplit = mass2.split(" ");
        System.out.println("Разделение по пробелу");
        for (int i = 0; i < massSplit.length; i++) {
            System.out.println(massSplit[i]);
        }
    }

    /**
     * Метод определяет явзяется ли 2 символ самой короткой строки цифрой.
     */
    public static void shotLine(String[] mass2) {
        int a = mass2[0].length(), b = 0;
        for (int i = 1; i < mass2.length; i++) {
            int longString = mass2[i].length();
            if (longString <= a) {       //в первой части метода нашли самый короткий элемент массива
                a = longString;
                b = i;
            }
        }
        char [] massLongString = mass2[b].toCharArray(); //разобьем самую короткую строку на массив элементов

        if(Character.isDigit(massLongString[1])==true){
            System.out.println("Второй символ самой короткой строки является числом");
        }else {
            System.out.println("Второй символ самой короткой строки не является числом");
        }
    }
}
