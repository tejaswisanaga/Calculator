import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter second number:");
        double num2 = input.nextDouble();

        System.out.println("Select a particular opertaion to perform");
        System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Remainder" );
        int choice = input.nextInt();
        double result;
        switch (choice) {
            case 1: result = num1 + num2;
            System.out.println("Result: " + result);
                break;
            case 2: result = num1 - num2;
            System.out.println("Result: " + result);
                break;
            case 3: result = num1 * num2;
            System.out.println("Result: " + result);
                break;
            case 4:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
            if(num2 != 0){
            result = num1 / num2;
            System.out.println("Result: " + result);
            }else{
                System.out.println("Cannot be divided by Zero");
            }
                break;
            case 5: result = num1 % num2;
                break;
            default: System.out.println("Invalid Operator");
               break;

        }
    }
    
}