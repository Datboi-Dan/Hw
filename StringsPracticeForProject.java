import java.util.Scanner;


/**
 * This class is a submission to the Strings Practice (for Project) assignment.
 * I made sure not to use anything we didn't learn in class. (I think)
 * I made things so much harder than they needed to be though in making a string to double converter. (So we can prevent an error from terminating the program)
 * MILCS
 * @author Daniel B)
 */
public class StringsPracticeForProject
{

	public static void main(String[] args)
	{
		
		System.out.println("Enter a new input."); //Prompts the user to enter an input.
		Scanner myReader = new Scanner(System.in); //Creates a scanner to read input
		String input = myReader.nextLine(); //Declares a string called input and sets it to whatever the user inputs next.
		
		/* 
		 * Create a while loop that prompts the user to input text into the console.
		 * Then the console prints out what they inputted and a number representing how many times the loop has run.
		 * Unless the player types "stop" in which case the loop should end. 
		 */
		
		
		int iteration = 1; //Declares an iteration intialized to one.
		
		while (!input.equals("stop")) //Iterates until the input equals stop.
		{
			
			System.out.println("Iteration " + iteration++ + ": " + input); //Prints out iteration, increments it, then prints out the input.
			System.out.println("Please enter a new input, or input stop."); //Prompts for a new input.
			input = myReader.nextLine(); //Reads whatever user inputs next and sets it to input.
			
		}
		
		/*
		 * Use your previously created shapes classes to complete the following task: 
		 * Choose one of the shape objects you created, for example Circle1. 
		 * Make a for loop that will run 5 times. 
		 * Each time, the user should be prompted to input a double. 
		 * Then, the double should be added to one of the object's attributes. 
		 * After the loop is done, print the shape's original attribute value and its final attribute value. 
		 */
		
		
		Sphere sphere1 = new Sphere(1); //Instantiates a sphere with a radius of 1.0. (1 is implicitly cast to a double.)
		
		for (int i = 0; i < 5; i++) //Iterates 5 times.
		{
			
			
			System.out.println("Please enter a double."); //Prompt for a double.
			input = myReader.nextLine(); //Reads whatever user inputs next and sets it to input.
			String inputCopy = input;
			
			//Check to see if input is a double to avoid error and halt of code.
			//Unfortunately this doesn't work for decimals past 14 digits after the decimal point (I checked myself cause I was curious).
			//Also Math.pow sometimes doesn't work for some reason meaning this can be inconsistent?
			boolean isNegative = false;
			
			while (!checkIfDouble(input)) //Iterates until the input is a valid double.
			{
				
				System.out.println("Invalid input. Please input a decimal number. (Include zero before the decimal even if it is less than zero)");
				input = myReader.nextLine();
				
			}
			
			
			if (input.charAt(0) == '-') //Sets isNegative to true if the input starts with a negative sign, then takes the negative sign out of the input.
			{
				
				isNegative = true;
				input = input.substring(1);
				
			}
			
			for (int j = 0; j < input.length(); j++) //Iterate through the input and add or subtract by iterating through each char, converting it to an int, then multiplying it by a power of 10 depending on the index of the decimal point - 1 - j.
			{
				
				if (input.charAt(j) != '.') //Skips body if the character is the decimal point.
				{
					
					if (isNegative) //Subtracts if the decimal is negative.
					{
						
						if (inputCopy.indexOf(input.charAt(j)) > input.indexOf('.')) //Subtracts an extra one from the power if greater than zero.
						{
							
							sphere1.setRadius(sphere1.getRadius() - (convertCharToInt(input.charAt(j)) * Math.pow(10, input.indexOf('.') - j)));
							
						}
						else
						{
							
							sphere1.setRadius(sphere1.getRadius() - (convertCharToInt(input.charAt(j)) * Math.pow(10, input.indexOf('.') - j - 1)));
							
						}
					
					}
					else //Adds if it is not.
					{
						
						if (inputCopy.indexOf(input.charAt(j)) > input.indexOf('.')) //Subtracts an extra one from the power if greater than zero.
						{
							
							sphere1.setRadius(sphere1.getRadius() + (convertCharToInt(input.charAt(j)) * Math.pow(10, input.indexOf('.') - j)));
							
						}
						else
						{
							
							sphere1.setRadius(sphere1.getRadius() + (convertCharToInt(input.charAt(j)) * Math.pow(10, input.indexOf('.') - j - 1)));
							
						}
						
					}
					
				}
				
			}
			
		}
		
		System.out.print("New Radius: " + sphere1.getRadius()); //Prints the new Radius.
	
		myReader.close();
	}
	
	
	/**
	 * Method to convert a char to an int.
	 * @param character - The character to be converted to an int.
	 * @return the character as an int, or -1 if the int could not be converted.
	 */
	public static int convertCharToInt(char character)
	{
		
		if (character == '0')
		{
			
			return 0;
			
		}
		else if (character == '1')
		{
			
			return 1;
			
		}
		else if (character == '2')
		{
			
			return 2;
			
		}
		else if (character == '3')
		{
			
			return 3;
		
		}
		else if (character == '4')
		{
			
			return 4;
			
		}
		else if (character == '5')
		{
			
			return 5;
			
		}
		else if (character == '6')
		{
			
			return 6;
			
		}
		else if (character == '7')
		{
			
			return 7;
			
		}
		else if (character == '8')
		{
			
			return 8;
			
		}
		else if (character == '9')
		{
			
			return 9;
			
		}
		else
		{
			
			return -1;
			
		}
		
	}
	
	/**
	 * Counts the number of occurrences a character has in a string.
	 * @param string - The string that is checked for the character.
	 * @param character - The string whose occurrences are counted in the passed string.
	 * @return The amount of times the passed character occurs in the passed string.
	 */
	public static int countOccurrences(String string, char character)
	{
		
		int counter = 0; //Counter to keep track of character occurrence.
		
		for (int i = 0; i < string.length(); i++) //Iterate through the string to count the occurrences.
		{
			
			if (string.charAt(i) == character) //Increments the counter if the current character is equal to the passed character.
			{
				
				counter++;
				
			}
			
		}
		
		return counter; //Returns the counter.
		
	}
	
	/**
	 * Checks if the passed input is a double or not.
	 * @param input - the string to be checked as a double or not.
	 * @return A boolean representing whether or not the String is a valid double or not.
	 */
	public static boolean checkIfDouble(String input)
	{
		
		for (int j = 0; j < input.length(); j++) //Iterate through the input to check if all the characters are valid.
		{
			
			if 
			(
					
				input.charAt(j) != '0' &&
				input.charAt(j) != '1' && 
				input.charAt(j) != '2' &&
				input.charAt(j) != '3' && 
				input.charAt(j) != '4' && 
				input.charAt(j) != '5' && 
				input.charAt(j) != '6' &&
				input.charAt(j) != '7' &&
				input.charAt(j) != '8' &&
				input.charAt(j) != '9' &&
				input.charAt(j) != '-' &&
				input.charAt(j) != '.' 
					
					
			)
			{
				
				return false; //Returns false if there is an invalid character in the string.
				
			}
				
		}
			
		if //More checks.
		(
					
			//Checks if the input length is less than three.
			input.length() < 3 
			
			||
			
			//Checks if the first character is the decimal point.
			input.charAt(0) == '.'
			
			||
			
			//Checks if the first character is 0, and if it is, it is only valid if there is a decimal point after
			input.charAt(0) == '0' && input.charAt(1) != '.'
			
			||
			
			//Same check but with a negative sign.
			input.charAt(0) == '-' && (input.charAt(1) == '.' || (input.charAt(1) == '0' && input.charAt(2) != '.'))
						
			||
					
			//Checks if there is only one decimal point in the string.
			countOccurrences(input, '.') != 1
					
		)
		{
				
			return false; //Returns false if any of the the previous are true.
				
		}
		else
		{
				
			return true; //Returns true if all of the checks are passed, meaning it is a valid double.
				
		}
		
	}
	
}
