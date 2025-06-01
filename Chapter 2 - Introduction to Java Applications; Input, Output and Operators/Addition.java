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
/*
✅ System.out.print()
Description: Prints the text to the console without adding a new line at the end.

Use case: When you want to continue output on the same line.

System.out.print("Hello ");
System.out.print("World");
// Output: Hello World
✅ System.out.println()
Description: Prints the text to the console and adds a new line after the output.

Use case: When you want to print each output on a new line.

System.out.println("Hello");
System.out.println("World");
// Output:
// Hello
// World
✅ System.out.printf()
Description: Prints formatted text to the console, similar to printf in C/C++.

Use case: When you need precise control over formatting (numbers, alignment, decimals, etc.).

System.out.printf("Name: %s, Age: %d", "Alice", 30);
// Output: Name: Alice, Age: 30
*/
