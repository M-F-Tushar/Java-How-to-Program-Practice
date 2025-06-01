//Displaying Text with printf
public class Welcome4 
{
    public static void main(String[] args)
    {
        System.out.printf("%s%n%s%n",
                "Welcome to, Java Programming!");
    }
}
/*
 * 
 * Format String Breakdown
"%s%n%s%n"
This is the format string. It contains format specifiers:

Specifier	    Meaning
  %s	        Insert a string
  %n	        Newline (works on all systems)

So this format string means:

Print a string

Add a newline

Print another string

Add another newline
 */