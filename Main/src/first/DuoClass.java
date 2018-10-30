package first;

public class DuoClass {
    public static void menuDuoClass(){
        System.out.println("Введите действия которые Вы хотите совершить");
        int[][] massivDuo = null;
        int average = 0;
        while (true) {
            System.out.println("Нажмите 0 если нечего не хотите делать");
            System.out.println("Нажмите 1 для создания и заполнения двумерного массива");
            System.out.println("Нажмите 2 для вывода двумерного массива");
            System.out.println("Нажмите 3 для подсчета среднего арифметического элементов двумерного массива");
            System.out.println("Нажмите 4 для нахождения числа введенного с консоли в двумерном массиве");
            System.out.println("Нажмите 5 что бы узнать сколько раз встречается число в двумерном массиве введенное с консоли");
            System.out.println("Нажмите 6 что бы перевести значения двумерного массива по модулю");
            System.out.println("Нажмите 7 что бы вывести номер строки в котором сумма элементов двумерного массива больше чем в других строках.");
            boolean stopMenuDuoClass = false;
            switch (Console.readFromConsoleIntValue()) {
                case 0:
                    stopMenuDuoClass = true;
                    System.out.println("Программа завершена");
                    break;
                case 1:
                    massivDuo = DuoClass.createMassDuo();
                    System.out.println("Массив создан");
                    break;
                case 2:
                    DuoClass.showMassDuo(massivDuo);
                    break;
                case 3:
                    average = DuoClass.mediumArithmeticDuo(massivDuo);
                    System.out.println(average);
                    break;
                case 4:
                    System.out.println("Введите число, которое Вы хотите найти");
                    int valueConsole = Console.readFromConsoleIntValue();
                    boolean bol = DuoClass.searchNumberConcole(massivDuo, valueConsole);
                    System.out.println(bol);
                    break;
                case 5:
                    System.out.println("Введите число с которым Вы хотите сравнить");
                    int point = Console.readFromConsoleIntValue();
                    int number = DuoClass.searchNumberConcole2(massivDuo, point);
                    System.out.println(number);
                    break;
                case 6:
                    int [][] moduleMassDuo = DuoClass.moduleMassDuo(massivDuo);
                    DuoClass.showMassDuo(moduleMassDuo);
                    break;
                case 7:
                    DuoClass.elementMassDuo(massivDuo);
                    break;
                default:
                    System.out.println("Введенное число не попадает в диапазон чисел предложенных вам ранее"); //проверка на ввод только номеров case
            }
            if (stopMenuDuoClass) {
                break;
            }
        }
    }
    /**
     * Метод создания и заполнения двумерного массива
     */
    public static int[][] createMassDuo() {
        System.out.println("Введите колличество строк");
        int massLength1 = Console.readFromConsoleIntValue();
        System.out.println("Введите колличество столбцов");
        int massLength2 = Console.readFromConsoleIntValue();
        int[][] massDuo = new int[massLength1][massLength2];
        System.out.println("Введите минимальное значение массива");
        int randomMin = Console.readFromConsoleIntValue();
        System.out.println("Введите максимальное значение массива");
        int randomMax = Console.readFromConsoleIntValue();
        for (int i = 0; i < massDuo.length; i++) {
            for (int j = 0; j < massDuo[i].length; j++) {
                massDuo[i][j] = Arithmetic.createRandom(randomMin, randomMax);
            }

        }
        return massDuo;
    }
    /** Метод вывода массива */
    public static void showMassDuo(int[][] massDuo) {
        for (int i = 0; i < massDuo.length; i++) {
            for (int j = 0; j < massDuo[i].length; j++) {
                System.out.print(massDuo[i][j]+ "\t");
            }
            System.out.println();
        }
    }
    /** Метод нахождения среднего арифметического элементов двумерного массива
     * */
    public static int mediumArithmeticDuo(int[][] massDuo) {
        int sumNumber = 0, allNumbersAverage = 0;
        for (int i = 0; i < massDuo.length; i++) {
            for (int j = 0; j < massDuo[i].length; j++) {
                sumNumber = sumNumber + massDuo[i][j];
                allNumbersAverage++;
            }
        }
        return sumNumber / allNumbersAverage;
    }
    /** Метод выяснения есть ли в массиве число которое ввели с консоли.
     * */
    public static boolean searchNumberConcole(int[][] massDuo, int numberConsole) {
        boolean bol = false;
        for (int i = 0; i < massDuo.length; i++) {
            for (int j = 0; j < massDuo[i].length; j++) {
                if (massDuo[i][j] == numberConsole) {
                    bol = true;
                    break;
                }
            }
        }
        return bol;
    }
    /** Метод, что бы узнать сколько раз встречается число в массиве введенное с консоли
     * */
    public static int searchNumberConcole2(int[][] massDuo, int numberConsole) {
        int number = 0; // счетчик
        for (int i = 0; i < massDuo.length; i++) {
            for (int j = 0; j < massDuo[i].length; j++) {
                if (massDuo[i][j] == numberConsole) {
                    number++;
                }
            }
        }
        return number;
    }
    /** Метод нахождения значений (по модулю) двумерного массива
     */
    public static int[][] moduleMassDuo(int[][]massDuo) {
        for(int i=0; i < massDuo.length; i++) {
            for(int j=0; j < massDuo[i].length; j++) {
                int value = Arithmetic.createModuleInt(massDuo[i][j]);
                massDuo[i][j] = value;
            }
        }
        return massDuo;
    }
    public static void elementMassDuo(int[][] mass) {
        int value1 = 0, k = 0;
        for (int i = 0; i < mass.length; i++) {
            int value = 0; // счетчик суммы элементов строки массива
            for (int j = 0; j < mass[i].length; j++) {
                value = value + mass[i][j];
            }
            if (value > value1) { // проверяем на больше
                value1 = value;
                k = i;
            }
        }
        System.out.println("В строке" + " " + (k) + " " + "сумма элементов массива больше чем в дргих");
    }
}
