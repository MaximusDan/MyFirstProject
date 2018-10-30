package first;

public class Calculator {
    public static int number1 = 0, number2 = 0, number3 = 0;
    public static boolean stopMenuCalculator = false;
    public static void menuCalculator() {
        System.out.println("Вас приветствует калькулятор Максим");
        CaseCalculator.pushTheNumber();
        while (true) {

            switch (Console.readFromConsoleStringValue()) {
                case "0":
                    stopMenuCalculator = true;
                    System.out.println("Программа завершена");
                    break;

                case "+":
                    CaseCalculator.calculatorSumm();
                    break;
                case "-":
                    CaseCalculator.calculatorSubtract();
                    break;
                case "*":
                    CaseCalculator.calculatorMultiply();
                    break;
                case "/":
                    CaseCalculator.calculatorDivis();
                    break;
                case "mod":
                    CaseCalculator.calculatorModule();
                    break;
                case "st":
                    CaseCalculator.calculatorDegree();
                    break;
            }
            if (stopMenuCalculator) {
                break;
            }
        }
    }
}
