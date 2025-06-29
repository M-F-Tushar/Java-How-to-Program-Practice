// Account class that contains a name instance variable
// and methods to set and get its value.
public class Account 
{
        private String name; // Declares a private instance variable name of type String. The private keyword restricts access to this variable to within the Account class only.

        // method to set the name in the Account object
        public void setName(String name) // Defines a public method setName that takes a String parameter. Inside the method, this.name = name; assigns the value of the parameter name to the instance variable name. The this keyword distinguishes the instance variable from the parameter.
        {
            this.name = name;
        }
        // method to retrieve the name from the Account object
        public String getName() //Defines a public method getName that returns a String. It returns the value of the instance variable name.
        {
            return name;
        }
    }

