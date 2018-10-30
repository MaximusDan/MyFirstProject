package first;

public class CaseCalculator {
    /**
     * Метод суммы переменных
     */
    public static void calculatorSumm() {
        Calculator.number2 = Console.readFromConsoleIntValue();
        System.out.println("=");
        Calculator.number3 = Arithmetic.summ(Calculator.number1, Calculator.number2);
        CaseCalculator.show(Calculator.number3);
        CaseCalculator.continued();
    }
    /**
     * Метод вычитания переменных
     */
    public static void calculatorSubtract(){
        Calculator.number2 = Console.readFromConsoleIntValue();
        System.out.println("=");
        Calculator.number3 = Arithmetic.subtract(Calculator.number1, Calculator.number2);
        CaseCalculator.show(Calculator.number3);
        CaseCalculator.continued();
    }
    /**
     * Метод умножения переменных
     */
    public static void calculatorMultiply() {
        Calculator.number2 = Console.readFromConsoleIntValue();
        System.out.println("=");
        Calculator.number3 = Arithmetic.multiply(Calculator.number1, Calculator.number2);
        CaseCalculator.show(Calculator.number3);
        CaseCalculator.continued();
    }
    /**
     * Метод деления переменных
     */
    public static void calculatorModule() {
        Calculator.number2 = Console.readFromConsoleIntValue();
        System.out.println("=");
        Calculator.number3 = Arithmetic.divis(Calculator.number1, Calculator.number2);
        CaseCalculator.show(Calculator.number3);
        CaseCalculator.continued();
    }
    /**
     * Метод нахождения модуля числа типа Int
     */
    public static void calculatorDivis(){
    System.out.println("=");
        Calculator.number3 = Arithmetic.createModuleInt(Calculator.number1);
        CaseCalculator.show(Calculator.number3);
        CaseCalculator.continued();
    }
    /**
     * Метод возведения Int числа в степень
     */
    public static void calculatorDegree(){
        Calculator.number3 = Arithmetic.degree(Calculator.number1);
        System.out.println("=");
        CaseCalculator.show(Calculator.number3);
        CaseCalculator.continued();
    }
    /**
     * Метод запрашивающий продолжение действий
     */
    public static void continued() {
        System.out.println("1 - Желаете продолжить");
        System.out.println("2 - Желаете продолжить с обнулением результата");
        System.out.println("3 - Выход из калькулятора");
        switch (Console.readFromConsoleIntValue()) {
            case 1:
                Calculator.number1 = Calculator.number3;
                CaseCalculator.show(Calculator.number1);
                break;
            case 2:
                Calculator.number1 = 0;
                CaseCalculator.pushTheNumber();
                break;
            case 3:
                Calculator.stopMenuCalculator = true;
                System.out.println("Программа завершена");
                break;
        }
    }

    public static void pushTheNumber() {
        System.out.println("Введите целое число");
        Calculator.number1 = Console.readFromConsoleIntValue();
    }
    /**
     * Метод вывода на консоль
     */
    public static void show(int number) {
        System.out.println(number);
    }
}
