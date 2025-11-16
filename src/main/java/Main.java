import java.util.Scanner;

public class Main {
    static CalculatorService calculatorService;
    public static void main(String[] args) {
        calculatorService =new CalculatorService();
        Scanner scanner=new Scanner(System.in);
        int number=0;
        while(number!=7){
            dashboardConsole();
            number=scanner.nextInt();
            if(number>=1&&number<5){
                System.out.print("enter v1 : ");
                double v1=scanner.nextDouble();
                System.out.print("enter v2 : ");
                double v2=scanner.nextDouble();
                double result =doOperation(number,v1,v2);
                System.out.println("result = " + result);
            }else if(number==5){
                System.out.print("enter the number : ");
                int numberTest=scanner.nextInt();
                System.out.println("is prime: " + calculatorService.isPrime(numberTest));
            }else if(number==6){
                System.out.print("enter the number : ");
                int numberTest=scanner.nextInt();
                System.out.println("is even: ");
        }
    }

    }

    private static Double doOperation(int number, double v1, double v2) {
        switch (number) {
            case 1: {
                 return calculatorService.addition(v1, v2);
                //break;
            }
            case 2: {
                return calculatorService.subtraction(v1, v2);
                //break;
            }
            case 3: {
                return calculatorService.multiplication(v1, v2);
                //break;
            }
            case 4: {
                return calculatorService.division(v1, v2);
                //break;
            }
        }
    return null;}


    static void dashboardConsole(){
        System.out.println("******* choose a number ******");
        System.out.println("1: addition operation ");
        System.out.println("2: subtraction operation ");
        System.out.println("3: multiplication operation ");
        System.out.println("4: division operation");
        System.out.println("5: is prime number ");
        System.out.println("6:is even Number");
        System.out.println("7: quit the application ");
        System.out.println("*****************************");
    }
}
