public class MyProgram {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String operator = args[2];

        System.out.print(operationResult(a, b, operator));
    }

    private static String operationResult(int a, int b, String operator){

        if (operator.equals("+") ||  operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            double result=0;
            switch (operator) {
                case "-":
                    result = a - b;
                    break;
                case "+":
                    result = a + b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = (double) a / (double) b;
            }
            return ("Rezultat: " + result);
        } else {
            return "Introduceti operator (+, -, *, /)";
        }

    }


}