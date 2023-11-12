public class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService =new CalculatorService();
        System.out.println("addition operation "+calculatorService.addition(5.0,6.0));
        System.out.println("subtraction operation "+calculatorService.subtraction(5.0,6.0));
        System.out.println("addition multiplication "+calculatorService.multiplication(7.0,2.0));
        System.out.println("addition division "+calculatorService.division(7.0,8.0));
        System.out.println("is prime "+calculatorService.isPrime(23));
        System.out.println("is prime "+calculatorService.isPrime(11));

    }
}
