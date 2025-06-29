import java.util.Scanner;

public class AccountTest 
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Create an Account object and assign it to myAccount
        Account myAccount = new Account();

        // dispaly initial value of name(null)
        System.out.printf("Initial name is : %s%n%n", myAccount.getName());

        // Prompt the user to enter a name
        System.out.println("Enter your name: ");
        String theName = input.nextLine();
        myAccount.setName(theName); // Set the name in the Account object using the setName method
        System.out.println();

        //Dispaly the name stored in object myAccount
        System.out.printf("Name in object myAccount is: %s%n", myAccount.getName());
        System.out.println();
    }
}
