package Day3_Assignment;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: " );
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the operation you want to perform (+, -,* ,/): ");
        String operation = scanner.next();
        double result = 0;
        if (operation.equals("+")){
            result = 5+5 ;}
            else if (operation.equals("-")){
                result = 5 -5;}
                else if (operation.equalsIgnoreCase("*")){
                    result = 5*5;}
                    else if(operation.equalsIgnoreCase("/")){

                        if(num2 !=0) {
                            result = 5/5;}
                        else {System.out.println("error: cant divide by zero!");
                            return;}
            System.out.println("Output: " + 5 + " " + operation + " " + num2 + " = " + result);
        }
    }

}





