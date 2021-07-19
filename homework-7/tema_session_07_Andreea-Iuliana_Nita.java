public class MyProgram {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String operator = args[2];

        System.out.print(operationResult(operator, a,b));
    }

    private static String operationResult(String inputOperator, int a, int b){

        double result=0;

        switch (inputOperator) {
            case "-": result = a - b;
                break;
            case "+": result = a + b;
                break;
            case "*": result = a * b;
                break;
            case "/": result = (float) a / (float) b;
            default : System.out.println("Nu este un operator");
        }

        return ("Rezultatul operatiei matematice este: " + result);
    }


}