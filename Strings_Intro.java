import java.util.Scanner;

/**
 * This class is a submission to the String Intro Assignment.
 * I'm gonna be honest, a lot of this code was pretty extra and unnecessary to the actual assignment.
 * It was mostly purely for my own enjoyment that included the extra functionalities.
 * MILCS (Man I Love Comp Sci)
 * @author Datboi-Dan
 */
public class StringsIntro 
{
	
	public static void main(String[] args)
	{
		
		/*
		 * For my own personal preference:
		 * I included this part to tell the user what to do because I like it better than a blank console.
		 */
		System.out.println("Please enter an input below.");
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------//----------------------------------------------------------------------------------------------------
		
		
		/*
		 * Task 1:
		 * In the main method, instantiate a Scanner object and then instantiate a String object equal to a scanned input. 
		 * Be sure to close the scanner at the bottom of your main method before testing any code. 
		 */
		Scanner myReader = new Scanner(System.in);
		String userInput = new String(myReader.nextLine());
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		/*
		 * For my own personal preference:
		 * I included this part to clarify to the user that all this code does is give you a few arbitrary stats about what they have input.
		 * I also included the second part in case they couldn't figure out that spaces counted as characters and got confused.
		 */
		System.out.println("Here are a few random stats about your input: " + userInput + "\n"
				+ "--Spaces are counted as characters in the analysis!--\n");
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		/*
		 * Task 2:
		 * Make and test a void method printSecondAndLastLetter that will print the second character and last character in the passed String. 
		 */
		printSecondAndLastLetter(userInput);
		System.out.println("");
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		/*
		 * Task 3:
		 * Make and test a method findTheE that returns the index of the first 'e' character in a passed String. 
		 * 
		 * For my own personal preference:
		 * I wanted the output to be understandable to a person who doesn't know much about Computer Science, and by extension what a String is.
		 * Additionally, immediately stating, "the first occurrence of the letter e is blah," felt too random.
		 * (I don't know why it bothered me, it just did.)
		 * To remedy this, I started it off with the number of e's in their input.
		 * Thus, I created... whatever this is.
		 */
		if (findTheE(userInput) == -1) //This block runs if there are no e's in the input.
		{
			
			//Prints a statement stating that there are no occurrences in the input
			System.out.println("There are no occurrences of the letter e in your input. :(\n");
			
		}
		else if (numberOfE(userInput) == 1) //This block runs if there is only one e in the input.
		{
			
			//Prints a statement stating that there is one occurrence of the letter e in the input.
			System.out.print("There is 1 occurrence of the letter e in your code. It is the ");
			
			//Decides between using 1st, 2nd, 3rd, last, second to last, or nth character depending on the index of the first occurrence of the letter e.
			switch (findTheE(userInput))
			{
			
				case 0:
					System.out.print("1st ");
					break;
				
				case 1:
					System.out.print("2nd ");
					break;
				
				case 2:
					System.out.print("3rd ");
					break;
				
				default:					
					System.out.print(findTheE(userInput) + 1 + "th ");			
					break;
				
			}
			
			//If e is the last or second to last character in the input, this block runs and prints out "(last)" or "(second to last)".
			if (findTheE(userInput) == userInput.length() - 1)
			{
				
				System.out.print("(last) ");
				
			}
			else if(findTheE(userInput) == userInput.length() - 2)
			{
				
				System.out.print("(second to last) ");
				
			}
			
			//Finishes the print statement.
			System.out.println("character of your input.\n");
			
		}
		else //This block runs if there is more than one e in the input.
		{
			
			//Prints a statement stating that the specific number of occurrences the letter e in the input.
			System.out.print("There are " + numberOfE(userInput) + " occurrences of the letter e in your code, the first of which being the ");
			
			//Decides between using 1st, 2nd, 3rd, last, second to last or nth character depending on the index of the first occurrence of the letter e.
			switch (findTheE(userInput))
			{
			
				case 0:
					System.out.print("1st ");
					break;
				
				case 1:
					System.out.print("2nd ");
					break;
				
				case 2:
					System.out.print("3rd ");
					break;
				
				default:
					System.out.print(findTheE(userInput) + 1 + "th ");
					break;
					
			}
			
			//If e is the second to last character in the input, this block runs and prints out "(second to last)".

			if(findTheE(userInput) == userInput.length() - 2)
			{
				
				System.out.print("(second to last) ");
				
			}
			
			//Finishes the print statement.
			System.out.println("character of your input.\n");
		}
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		/*
		 * Task 4:
		 * Make and test a method getLength that returns the amount of characters (the length) of a passed String.
		 */
		System.out.println("The number of characters in your input is " + getLength(userInput) + ".\n");
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		/*
		 * Task 5:
		 * Make and test a void method printFirstAndLastThree that is passed a string and prints the first three and last three characters in a passed String. 
		 */
		printFirstAndLastThree(userInput);
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		/*
		 * Task 1:
		 * In the main method, instantiate a Scanner object and then instantiate a String object equal to a scanned input. 
		 * Be sure to close the scanner at the bottom of your main method before testing any code. 
		 */
		myReader.close();
		
	}
	
	
	/**
	 * Task 2:
	 * Make and test a void method printSecondAndLastLetter that will print the second character and last character in the passed String. 
	 * 
	 * For my own personal preference:
	 * I know that the input will always be more than 6 characters long, but I couldn't resist making a try catch block after learning it.
	 * It just feels so unsatisfying knowing that an exception can be thrown.
	 * @param input - This is the String that is passed.
	 */
	public static void printSecondAndLastLetter(String input)
	{
		
		//This runs if the input length is two or more.
		try
		{
			
			//Identifies the second and last characters, and sets them to variables.
			char secondChar = input.charAt(1);
			char lastChar = input.charAt(input.length() - 1);
			
			//Prints a string utilizing the two variables explaining what the second and last characters of the code is.
			System.out.println("The second character of your input is \"" + secondChar + "\", "
					+ "and the last character of your input is \"" + lastChar + "\". "
					+ "If you put them together and then repeat it five times, you get \"" 
					+ secondChar + lastChar + secondChar + lastChar + secondChar + lastChar + secondChar + lastChar + secondChar + lastChar + "\"."
					+ "\nPlease say that out loud. It'll be fun, I promise.");
		
		}
		//This runs if the input length is less then two.
		catch (Exception thisGuyReallyEnteredAnInputWithALengthLessThanTwo)
		{
			
			if (input.length() == 0) //Runs if input length is 0.
			{
				
				System.out.println("Your input is a grand total of zero characters long. We got a real silent guy over here huh.");
				
			}
			else //Runs if input length is 1.
			{
				
				System.out.println("Your input is only 1 character long. You should set that as your password for maximum security!");
				
			}
			
		}
		
	}
	
	
	/**
	 * Task 3:
	 * Make and test a method findTheE that returns the index of the first 'e' character in a passed String.
	 * @param input - This is the String that is passed.
	 * @return The index of the first occurrence of the letter e in the passed String. If e cannot be found, -1 is returned.
	 */
	public static int findTheE(String input)
	{
		
		return input.toLowerCase().indexOf('e');
		
	}
	
	
	/**
	 * Task 4:
	 * Make and test a method getLength that returns the amount of characters (the length) of a passed String.
	 * @param input - This is the String that is passed.
	 * @return The number of characters in the String. In other words, the length.
	 */
	public static int getLength(String input)
	{
		
		return input.length();
		
	}
	
	
	/**
	 * Task 5:
	 * Make and test a void method printFirstAndLastThree that is passed a String and prints its first three and last three characters. 
	 * @param input
	 */
	public static void printFirstAndLastThree(String input)
	{
		
		//Runs if input length is 6 or more.
		try
		{
			
			//Prints the first and last three characters of the input in a statement.
			System.out.println("The first three characters in your input are \"" + input.substring(0, 3) + "\", "
					+ "and the last three characters in your input are \"" + input.substring(input.length() - 3) + "\".");
			
			//This part was entirely for fun, but so so worth it.
			if (input.length() > 6) //This runs if the input length is greater than 6.
			{
				
				System.out.print("You could say those two are the buns, and the patty is \"" + input.substring(3, input.length() - 3) + "\". ");
				
				//If the middle of the string, or the "patty", starts with a vowel, this block prints "an".
				//If the middle of the string, or the "patty", does not start with a vowel, this block prints "a".
				if (startsWithVowel(input.substring(3, 4)))
					System.out.print("An \"");

				else
					System.out.print("A \"");
				
				//Prints the middle of the string and then sandwich to complete the print statement.
				System.out.println(input.substring(3, input.length() - 3) + "\" sandwich.");
				
			}
			else if (input.length() == 6) //Runs if input length is 6.
			{
				
				System.out.print("You could say those two are the buns, and the patty is... "
						+ "Wait where'd the patty go? Guess there's not enough meat in your input for a burger.");
			
			}
			
		}
		//This runs if the input length is less than three.
		catch (Exception thisGuyReallyEnteredAnInputWithALengthLessThanThree)
		{
			
			System.out.print("I'm sorry, but your input does not fulfill the requirements for this stat too be printed.\n"
					+ "Yes, it's because it's too short.\n"
					+ "No, I won't give you the stat anyway because of a reason like, \"it's not the length, it's how you use it.\"");
			
		}
		
	}
	
	
	/**
	 * For my own personal preference:
	 * I made a method that returns the number of e's in the input.
	 * I thought it would be funny.
	 * Also I like better than just randomly stating the first occurrence of e.
	 * @param input - The string that method counts e's from.
	 * @return
	 * The number of e's in the input.
	 */
	public static int numberOfE(String input)
	{
		
		//Declares a variable called eCount that tracks the number of e's in the input.
		int eCount = 0;
		
		//Sets up a loop that iterates through the input and updates the counter if the current index is e.
		for (int character = 0; character != input.length(); character++)
		{
			
			eCount += input.substring(character, character + 1).toLowerCase().equals("e")? 1 : 0;
			
		}
		return eCount;
		
	}
	
	
	/**
	 * For my own personal preference:
	 * I made a method that determines if the passed string starts with a vowel or not.
	 * Its sole use in this class is in the printFirstAndLastThree method; it determines whether to use an or a in the printed statement.
	 * @param input - The string to be determined as starting with a vowel or not.
	 * @return
	 * True if the string starts with a vowel, and false if the string does not start with a vowel.
	 */
	public static boolean startsWithVowel(String input)
	{
		
		//Runs if the length is not zero.
		try
		{
			
			//There was probably a better way to write this, but I'm not knowledgeable/smart enough yet.
			//Returns true if the first character is a, e, i, o, or u, and false for anything else.
			switch (input.substring(0, 1).toLowerCase())
			{
			
				case "a":
					return true;
				
				case "e":
					return true;
				
				case "i":
					return true;
			
				case "o":
					return true;
				
				case "u":
					return true;
				
				default:
					return false;
					
			}

		}
		//Runs if the length is zero.
		catch (Exception lengthIsZero)
		{
			
			return false;
			
		}
		
	}

}
