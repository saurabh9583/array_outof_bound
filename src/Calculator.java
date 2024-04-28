//Create a Java program that acts as a simple calculator. ● The program should prompt the user to enter two
//numbers and an operator (+, -, *, /). ● Perform the corresponding calculation based on the operator. ● Handle
//        potential exceptions, such as division by zero or invalid operator input. ● Display the result or an
//appropriate error message.

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the first number");
        int num2 = sc.nextInt();
        System.out.println("enter the operator:-");
        String operator = sc.next();
        
        try {
            if (Objects.equals(operator, "+")) {//Addition
                System.out.println(num1 + num2);
            } else if (Objects.equals(operator, "-")) {//subtraction
                System.out.println(num1 - num2);
            } else if (Objects.equals(operator, "*")) {//multiplication
                System.out.println(num1 * num2);

            } else if (Objects.equals(operator, "/")) {//division
                System.out.println(num1 / num2);
            } else {
                System.out.println("enter valid input");
            }
        }catch (ArithmeticException e){
            System.out.println("************************");
        }

    }
}
