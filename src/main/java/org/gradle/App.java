
public class App
{
	public static void main(String[] args)
	{
		// create a first method called cleanFullName that accepts two parameters: firstName, lastName
		// Use the capitalize to make all the letters of both those paramters lowercase and then capitalize the first letter of each
		// this method should return the combination of the first and last name as one string

		// ask the user for their first name

		// ask the user for their last name

		// run the cleanFullName method and store the results in a variable called fullName

		// print the fullName to the screen
	}

	private static String capitalize(String firstName)
	{
		firstName = firstName.toLowerCase();
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		return firstName;
	}
}


