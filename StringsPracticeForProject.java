import java.util.Scanner;


/**
 * This class is a submission to the Strings Practice (for Project) assignment.
 * I made sure not to use anything we didn't learn in class. (I think)
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
			System.out.println("Please enter a new input, or input stop."); //Prompts for a new input, or stop.
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
			
			System.out.println("Please enter a double.");
			input = myReader.nextLine();
			
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
			
			for (int j = 0; j < input.length(); j++) //Iterate through the input add or subtract by iterating through each char, converting it to an int, then multiplying it by a power of 10 depending on j.
			{
				
				if (input.charAt(j) != '.')
				{
					
					if (isNegative)
					{
						
						sphere1.setRadius(sphere1.getRadius() - ( convertCharToInt(input.charAt(j)) * Math.pow(10, input.indexOf('.') - j - 1) ));
					
					}
					else
					{
						
						sphere1.setRadius(sphere1.getRadius() + ( convertCharToInt(input.charAt(j)) * Math.pow(10, input.indexOf('.') - j - 1) ));
						
					}
					
				}
				
			}
			
		}
		
		System.out.print(sphere1.getRadius());
	
		myReader.close();
	}
	
	
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
	
	public static int countOccurrences(String string, char character)
	{
		
		int counter = 0;
		
		for (int i = 0; i < string.length(); i++)
		{
			
			if (string.charAt(i) == character)
			{
				
				counter++;
				
			}
			
		}
		
		return counter;
		
	}
	
	
	public static boolean checkIfDouble(String input)
	{
		
		for (int j = 0; j < input.length(); j++) //Iterate through the input to check if the input is a valid double.
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
				
				return false;
				
			}
				
		}
			
		if 
		(
					
			input.length() < 3
			
			||
					
			(input.charAt(0) != '0' && input.charAt(1) != '.') &&
			input.charAt(0) != '1' && 
			input.charAt(0) != '2' &&
			input.charAt(0) != '3' && 
			input.charAt(0) != '4' && 
			input.charAt(0) != '5' && 
			input.charAt(0) != '6' &&
			input.charAt(0) != '7' &&
			input.charAt(0) != '8' &&
			input.charAt(0) != '9' &&
			input.charAt(0) != '-'
					
					
			||
					
			countOccurrences(input, '.') != 1
					
		)
		{
				
			return false;
				
		}
		else
		{
				
			return true;
				
		}
		
	}
	
}
