import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            System.out.println("Result = " + (num1 + num2));
        }
        else if(choice == 2)
        {
            System.out.println("Result = " + (num1 - num2));
        }
        else if(choice == 3)
        {
            System.out.println("Result = " + (num1 * num2));
        }
        else if(choice == 4)
        {
            System.out.println("Result = " + (num1 / num2));
        }
        else
        {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
