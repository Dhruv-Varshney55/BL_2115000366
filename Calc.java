package Calculator;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();
        System.out.println("Select an operation:");
        System.out.println("1- Addition (+)");
        System.out.println("2- Subtraction (-)");
        System.out.println("3- Multiplication (*)");
        System.out.println("4- Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int ch = scanner.nextInt();
        switch(ch){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                if(num2 != 0){
                    System.out.println(num1 / num2);
                }
                else{
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
