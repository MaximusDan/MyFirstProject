public class Calculator {
    static int a = 0, b = 0, c = 0;
    public static void menuCalculator(){
        String n;
        System.out.println("Вас приветствует калькулятор Максим");
        Calculator.rrrrrr();
        boolean stopMenuCalculator = false;
        while (true) {

            switch (Console.readFromConsoleStringValue()) {
                case "0":
                    stopMenuCalculator = true;
                    System.out.println("Программа завершена");
                    break;

                case "+":
                    b = Console.readFromConsoleIntValue();
                    System.out.println("=");
                    c = Arithmetic.summ(a,b);
                    System.out.println(c);
                    System.out.println("Желаете продолжить?");
                    System.out.println("1=Да");
                    System.out.println("2=Нет");
                    switch (Console.readFromConsoleIntValue()) {
                        case 1:
                            a = c;
                            System.out.println(a);
                            break;
                        case 2:
                            a = 0;
                            Calculator.rrrrrr();
                            break;
                    }
                    break;
                case "-":
                    b = Console.readFromConsoleIntValue();
                    System.out.println("=");
                    c = Arithmetic.subtract(a,b);
                    System.out.println(c);
                    System.out.println("Желаете продолжить?");
                    System.out.println("1=Да");
                    System.out.println("2=Нет");
                    switch (Console.readFromConsoleIntValue()) {
                        case 1:
                            a = c;
                            System.out.println(a);
                            break;
                        case 2:
                            a = 0;
                            Calculator.rrrrrr();
                            break;
                    }
                    break;
                case "*":
                    b = Console.readFromConsoleIntValue();
                    System.out.println("=");
                    c = Arithmetic.multiply(a,b);
                    System.out.println(c);
                    System.out.println("Желаете продолжить?");
                    System.out.println("1=Да");
                    System.out.println("2=Нет");
                    switch (Console.readFromConsoleIntValue()) {
                        case 1:
                            a = c;
                            System.out.println(a);
                            break;
                        case 2:
                            a = 0;
                            Calculator.rrrrrr();
                            break;
                    }
                    break;
                case "/":
                    b = Console.readFromConsoleIntValue();
                    System.out.println("=");
                    c = Arithmetic.divis(a,b);
                    System.out.println(c);
                    System.out.println("Желаете продолжить?");
                    System.out.println("1=Да");
                    System.out.println("2=Нет");
                    switch (Console.readFromConsoleIntValue()) {
                        case 1:
                            a = c;
                            System.out.println(a);
                            break;
                        case 2:
                            a = 0;
                            Calculator.rrrrrr();
                            break;
                    }
                    break;
            }
            if (stopMenuCalculator) {
                break;
            }
        }
    }
public static void rrrrrr(){
    System.out.println("Введите целое число");
    a = Console.readFromConsoleIntValue();
}

}
