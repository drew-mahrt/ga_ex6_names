import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        // create a first method called cleanFullName that accepts two parameters: firstName, lastName
        // Use the capitalize method to make all the letters of both those parameters lowercase, and then capitalize the first letter of each
        // this method should return the combination of the first and last name as one string

        // ask the user for their first name

        // ask the user for their last name

        // run the cleanFullName method and store the results in a variable called fullName

        // print the fullName to the screen

        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        String fullName = cleanFullName(firstName, lastName);
        System.out.println(fullName);
    }

    public static String cleanFullName(String firstName, String lastName){
        String fullName = capitalize(firstName) + " " + capitalize(lastName);
        return fullName;
    }

    private static String capitalize(String name)
    {
        name = name.toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }
}
