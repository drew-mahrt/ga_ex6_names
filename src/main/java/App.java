import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        // create a first method called cleanFullName that accepts two parameters: firstName, lastName
        // Use the capitalize method to make all the letters of both those parameters lowercase, and then capitalize the first letter of each
        // this method should return the combination of the first and last name as one string

        // ask the user for their first name
        System.out.println("What's your first name?");
        Scanner input = new Scanner ( System.in );
        String firstName = input.nextLine();

        // ask the user for their last name
        System.out.println("What's your last name?");
        String lastName = input.nextLine();

        // run the cleanFullName method and store the results in a variable called fullName
        String fullName = cleanFullName(firstName, lastName);
        // print the fullName to the screen
        System.out.println("Your full name is " + fullName);
    }

    private static String capitalize(String name)
    {
        name = name.toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }

    private static String cleanFullName(String firstName, String lastName)
    {
        return capitalize(firstName + " " + lastName);
    }
}
