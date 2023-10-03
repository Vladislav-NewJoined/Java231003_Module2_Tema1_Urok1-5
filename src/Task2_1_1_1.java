public class Task2_1_1_1 {
    public static void main(String[] args) {

        System.out.println("""
                Задание:\s
                5. Задание в рамках интерфейса java нужно создать калькулятор выполняющий 4
                   основных арифметических функций, сложение, вычитание, деление,
                   умножение, а также осуществить вывод на результатов на экран

                Решение:\s
                   Арифметическое действие задается в строке 13""");

        final String input = "10/5";
        final String[] numbers = input.split("[+-/*]");
        final int a = Integer.parseInt(numbers[0]);
        final int b = Integer.parseInt(numbers[1]);
        final int lastNumberIndex = input.indexOf(numbers[1]);
        final String operationString = input.substring(lastNumberIndex-1, lastNumberIndex);
        Calculation sum = new Calculation() {
            @Override
            public int calculate(int a, int b) {
                return a+b;
            }
        };
        Calculation minus = new Calculation() {
            @Override
            public int calculate(int a, int b) {
                return a-b;
            }
        };
        Calculation multiply = new Calculation() {
            @Override
            public int calculate(int a, int b) {
                return a*b;
            }
        };
        Calculation divide = new Calculation() {
            @Override
            public int calculate(int a, int b) {
                return a/b;
            }
        };

        Calculation operation = null;
        switch (operationString) {
            case "+":
                operation = sum;
                break;

            case "-":
                operation = minus;
                break;

            case "*":
                operation = multiply;
                break;

            case "/":
                operation = divide;
                break;

        }
        System.out.println(operation.calculate(a, b));
    }
}

interface Calculation {
    int calculate(int a, int b);

}