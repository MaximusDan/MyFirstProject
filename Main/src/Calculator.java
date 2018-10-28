public class Calculator {
    static int number1 = 0, number2 = 0, number3 = 0;

    public static void menuCalculator() {
        String n;
        System.out.println("Вас приветствует калькулятор Максим");
        Calculator.pushTheNumber();
        boolean stopMenuCalculator = false;
        while (true) {

            switch (Console.readFromConsoleStringValue()) {
                case "0":
                    stopMenuCalculator = true;
                    System.out.println("Программа завершена");
                    break;

                case "+":
                    number2 = Console.readFromConsoleIntValue();
                    System.out.println("=");
                    number3 = Arithmetic.summ(number1, number2);
                    Calculator.show(number3);
                    Calculator.request();
                    switch (Console.readFromConsoleIntValue()) {
                        case 1:
                            number1 = number3;
                            Calculator.show(number1);
                            break;
                        case 2:
                            number1 = 0;
                            Calculator.pushTheNumber();
                            break;
                        case 3:
                            stopMenuCalculator = true;
                            System.out.println("Программа завершена");
                            break;
                    }
                    break;
                case "-":
                    number2 = Console.readFromConsoleIntValue();
                    System.out.println("=");
                    number3 = Arithmetic.subtract(number1, number2);
                    Calculator.show(number3);
                    Calculator.request();
                    switch (Console.readFromConsoleIntValue()) {
                        case 1:
                            number1 = number3;
                            Calculator.show(number1);
                            break;
                        case 2:
                            number1 = 0;
                            Calculator.pushTheNumber();
                            break;
                        case 3:
                            stopMenuCalculator = true;
                            System.out.println("Программа завершена");
                            break;
                    }
                    break;
                case "*":
                    number2 = Console.readFromConsoleIntValue();
                    System.out.println("=");
                    number3 = Arithmetic.multiply(number1, number2);
                    Calculator.show(number3);
                    Calculator.request();
                    switch (Console.readFromConsoleIntValue()) {
                        case 1:
                            number1 = number3;
                            Calculator.show(number1);
                            break;
                        case 2:
                            number1 = 0;
                            Calculator.pushTheNumber();
                            break;
                        case 3:
                            stopMenuCalculator = true;
                            System.out.println("Программа завершена");
                            break;
                    }
                    break;
                case "/":
                    number2 = Console.readFromConsoleIntValue();
                    System.out.println("=");
                    number3 = Arithmetic.divis(number1, number2);
                    Calculator.show(number3);
                    Calculator.request();
                    switch (Console.readFromConsoleIntValue()) {
                        case 1:
                            number1 = number3;
                            Calculator.show(number1);
                            break;
                        case 2:
                            number1 = 0;
                            Calculator.pushTheNumber();
                            break;
                        case 3:
                            stopMenuCalculator = true;
                            System.out.println("Программа завершена");
                            break;
                    }
                    break;
                case "mod":
                    System.out.println("=");
                    number3 = Arithmetic.createModuleInt(number1);
                    Calculator.show(number3);
                    Calculator.request();
                    switch (Console.readFromConsoleIntValue()) {
                        case 1:
                            number1 = number3;
                            Calculator.show(number1);
                            break;
                        case 2:
                            number1 = 0;
                            Calculator.pushTheNumber();
                            break;
                        case 3:
                            stopMenuCalculator = true;
                            System.out.println("Программа завершена");
                            break;
                    }
                    break;
                case "st":
                    number3 = Arithmetic.degree(number1);
                    System.out.println("=");
                    Calculator.show(number3);
                    Calculator.request();
                    switch (Console.readFromConsoleIntValue()) {
                        case 1:
                            number1 = number3;
                            Calculator.show(number1);
                            break;
                        case 2:
                            number1 = 0;
                            Calculator.pushTheNumber();
                            break;
                        case 3:
                            stopMenuCalculator = true;
                            System.out.println("Программа завершена");
                            break;
                    }
                    break;
            }
            if (stopMenuCalculator) {
                break;
            }
        }
    }

    public static void pushTheNumber() {
        System.out.println("Введите целое число");
        number1 = Console.readFromConsoleIntValue();
    }

    public static void request() {
        System.out.println("1= Желаете продолжить");
        System.out.println("2= Желаете продолжить с обнулением результата");
        System.out.println("3= Выход из калькулятора");
    }

    public static void show(int number) {
        System.out.println(number);
    }
}
