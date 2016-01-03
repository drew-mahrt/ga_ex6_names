import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        // create a first method called cleanFullName that accepts two parameters: firstName, lastName
        // Use the capitalize method to make all the letters of both those parameters lowercase, and then capitalize the first letter of each
        // this method should return the combination of the first and last name as one string
        final Scanner scanner  =  new Scanner(System.in);
        // ask the user for their first name
        System.out.print("Enter your first name:\t");
        final String userFirstName = scanner.nextLine();
        // ask the user for their last name
        System.out.print("Enter your last name:\t");
        final String userLastName = scanner.nextLine();
        // run the cleanFullName method and store the results in a variable called fullName
        final String fullName = cleanFullName(userFirstName, userLastName);
        // print the fullName to the screen
        System.out.println("Your full name is "+ fullName);
    }

    private static String capitalize(String name)
    {
        name = name.toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }

    private static String cleanFullName(String firstname, String lastName) {
        return capitalize(firstname) + " " + capitalize(lastName);
    }
}
