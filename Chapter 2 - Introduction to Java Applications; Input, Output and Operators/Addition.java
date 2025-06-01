import java.util.Scanner;

public class Addition 
{
    public static void main(String[] args)
    {
        // Create a scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; // first number to add
        int number2; // second number to add
        int sum;     // sum of number1 and number2

        System.out.print("Enter first integer: "); // prompt user for first number
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt user for second number
        number2 = input.nextInt(); // read second number from user

        sum = number1 + number2; // add the numbers

        System.out.printf("Sum is %d%n", sum);

        input.close(); // close the scanner
    }
}
