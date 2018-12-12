package second;

import first.Console;

public class TaskBook {

    public static void createMass(){

        System.out.println("Введите количество строк в массиве");
        String [] mass = new String [Console.readFromConsoleIntValue()];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите строку");
            mass[i] = Console.readFromConsoleStringValue();
        }
        //TaskBook.bookTask(mass);  //1) Сортировка строк массива по количеству слов в строке
        //TaskBook.bookTaskShowLength(mass);   //2) Выводим значения длинн всех строк массива
        //TaskBook.bookTaskShowLine(mass);   //3) Выводим строки с i по j из массива
        //TaskBook.bookTaskShowMaxLine(mass);   //4) Выводим номер строки с максимальной цифрой
        //TaskBook.bookTaskDeleteLetters(mass);  //5) Удаляем из i-ой строки все заглавные буквы
        //TaskBook.bookTaskDeleteSymbol(mass);  //6) Удаляем из i-ой строки все символы кроме букв и цифр
        //TaskBook.bookTaskShowLineWithNumeral(mass);  //7) Выводим из i-ой строки все слова содержащие цифры
        //TaskBook.bookTaskShowSumNumeral(mass);  //8) Находим сумму всех цифр i-ой строки
        //TaskBook.bookTaskShowSmallLine(mass);  //9) Выводим из массива все слова содержащие только прописные буквы
        //TaskBook.bookTaskShowAllNumeral(mass);  //10) Выводим все числа из строк
    }

    /**
     * 1) Метод сортирует массив по количеству слов в строке
     * @param mass
     */
    public static void bookTask(String[] mass) {

        for (int i = 0; i < mass.length - 1; i++) {
            String[] splitMass1 = mass[i].split(" ");
            for(int j=i+1; j<mass.length;j++){
                String[] splitMass2 = mass[j].split(" ");
                if(splitMass2.length > splitMass1.length ){
                    String line = mass[i];
                    mass[i] = mass[j];
                    mass[j] = line;
                }
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }

    /**
     * 2) Метод выводит значения длинн все строк массива
     * @param mass
     */
    public static void bookTaskShowLength(String[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Длинна " + i + " строки равна = " + mass[i].length());
        }
    }

    /**
     * 3) Метод выводит строки с i по j из массива
     * @param mass
     */
    public static void bookTaskShowLine(String[] mass) {
        System.out.println("Введите с какого элемента вывести строку");
        int elementMin = Console.readFromConsoleIntValue();
        System.out.println("Введите по какой элемент вывести строку");
        int elementMax = Console.readFromConsoleIntValue();

        System.out.println("Итого");
        for (int i = elementMin; i <= elementMax; i++) {
            System.out.println(mass[i]);
        }
    }

    /**
     * 4) Метод выводит номер строки с максимальной цифрой
     * @param mass
     */
    public static void bookTaskShowMaxLine(String[] mass) {
        int index = 48, indexLine = 0;

        for (int i = 0; i < mass.length; i++) {
            char[] createSymbol = new char[mass[i].length()];
            for (int j = 0; j < mass[i].length(); j++) {
                createSymbol[j] = mass[i].charAt(j);
                int symbol = (int) createSymbol[j];
                if (symbol > index && symbol < 58) {
                    indexLine = i;
                    index = symbol;
                }
            }
        }
        System.out.println("В строке № " + (indexLine + 1) + " находится максимальная цифра");
    }

    /**
     * 5) Метод удаляет из i-ой строки все заглавне буквы
     * @param mass
     */
    public static void bookTaskDeleteLetters(String[] mass) {
        System.out.println("Введите № строки с которой хотите произвести изменения");
        int numberLine = Console.readFromConsoleIntValue();

        String newline = mass[numberLine].replaceAll("[^a-z]", "");
        System.out.println(newline);
    }

    /**
     * 6) Метод удаляет из i-ой строки все символы кроме букв и цифр
     * @param mass
     */
    public static void bookTaskDeleteSymbol(String[] mass) {
        System.out.println("Введите № строки с которой хотите произвести изменения");
        int numberLine = Console.readFromConsoleIntValue();

        String newline = mass[numberLine].replaceAll("[^a-z A-Z 0-9]", "");
        System.out.println(newline);
    }

    /**
     * 7) Метод Выводит из i-ой строки все слова содержащие цифры
     * @param mass
     */
    //Сначала разбиарю строку на массив слов, потом каждое слово на массив цифр
    public static void bookTaskShowLineWithNumeral(String[] mass) {
        System.out.println("Введите № строки с которой хотите произвести изменения");
        int numberLine = Console.readFromConsoleIntValue();

        String[] splitMass = mass[numberLine].split(" ");

        for (int i = 0; i < splitMass.length; i++) {
            char[] toCharArrayMass = CustomString.toCharArray(splitMass[i]);
            for (int j = 0; j < toCharArrayMass.length; j++) {
                int indexMass = (int) toCharArrayMass[j];
                if (indexMass >= 48 && indexMass <= 57) {
                    System.out.println("В слове " + splitMass[i] + " находится символ");
                    break;
                }
            }
        }
    }

    /**
     * 8) Метод находит сумму всех цифр i-ой строки
     * @param mass
     */
    public static void bookTaskShowSumNumeral(String[] mass) {
        System.out.println("Введите № строки с которой хотите произвести изменения");
        int numberLine = Console.readFromConsoleIntValue();
        int sum = 0;
        char[] toCharArrayMass = CustomString.toCharArray(mass[numberLine]);

        for (int i = 0; i < toCharArrayMass.length; i++) {

            if (Character.isDigit(toCharArrayMass[i]) == true) {
                int symbol = Character.getNumericValue(toCharArrayMass[i]);   //преобразуем ASCI-код символа в число
                sum = sum + symbol;
            }
        }
        System.out.println("Сумма цифр выбраной строки = " + sum);
    }

    /**
     * 9) Метод выводит из массива слова содержащиетолько прописные буквы
     * @param mass
     */

    public static void bookTaskShowSmallLine(String[] mass) {

        int index = 0; //счетчик. Если длина слова совпадет с количеством прописных символов то вывод на консоль

        for (int i = 0; i < mass.length; i++) {
            String[] splitMass = mass[i].split(" ");    //разбиваем строку на массив слов
            for (int j = 0; j < splitMass.length; j++) {
                char[] toCharArrayMass = CustomString.toCharArray(splitMass[j]);   //разбиваем слово на массив символов
                for (int k = 0; k < toCharArrayMass.length; k++) {
                    int symbol = (int) toCharArrayMass[k];
                    if (symbol >= 97 && symbol <=122) {
                        index++;
                    }
                }
                if (index == splitMass[j].length()) {
                    System.out.println("В слове  " + splitMass[j] + " все символы являются прописными буквами");
                }
                index = 0;
            }
        }
    }

    /**
     * 10) Метод выводит все числа из строк
     * @param mass
     */

    public static void bookTaskShowAllNumeral(String[] mass) {
        for (int i = 0; i < mass.length; i++) {
            char[] toCharArrayMass = CustomString.toCharArray(mass[i]);
            for (int j = 0; j < toCharArrayMass.length; j++) {
                int symbol = (int) toCharArrayMass[j];
                if (symbol >= 48 && symbol <= 57) {
                    System.out.println(toCharArrayMass[j]);
                }
            }
        }
    }
}
