
public class LogicPracticeOne
{
	
	/**
	 * Challenge 1: cigarParty.
	 * When squirrels get together for a party, they like to have cigars. 
	 * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
	 * Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
	 * Return true if the party with the given values is successful, or false otherwise.
	 * @param cigars - The number of cigars that the squirrels have.
	 * @param isWeekend - Tells whether it is the weekend or not.
	 * @return If the party is successful with the given values.
	 */
	public boolean cigarParty(int cigars, boolean isWeekend) 
	{
	  
		if (isWeekend == true && cigars >= 40)
		{
	    
			return true;
	    
		}
		else if (cigars >= 40 && cigars <= 60)
		{

			return true;
		
		}
		else
		{
			
			return false;
			
		}
	  
	}
	
	
	/**
	 * Challenge 2: dateFashion.
	 * You and your date are trying to get a table at a restaurant. 
	 * The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. 
	 * The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. 
	 * If either of you is very stylish, 8 or more, then the result is 2 (yes). 
	 * With the exception that if either of you has style of 2 or less, then the result is 0 (no). 
	 * Otherwise the result is 1 (maybe).
	 * @param you - Your level of stylishness encoded as an int.
	 * @param date - Your date's level of stylishness encoded as an int.
	 * @return The result of getting the table encoded as an int.
	 */
	public int dateFashion (int you, int date)
	{
	  
		if (you <= 2 || date <= 2)
		{
	    
			return 0;
	    
		}
		else if (you >= 8 || date >= 8)
		{
	    
			return 2;
	    
		}
		else
		{
	    
			return 1;
	    
		}
	  
	}
	
	
	/**
	 * Challenge 3: squirrelPlay.
	 * The squirrels in Palo Alto spend most of the day playing. 
	 * In particular, they play if the temperature is between 60 and 90 (inclusive). 
	 * Unless it is summer, then the upper limit is 100 instead of 90. 
	 * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
	 * @param temp - The temperature in Palo Alto.
	 * @param isSummer - Tells whether it is summer or not.
	 * @return If the squirrels play with the given values.
	 */
	public boolean squirrelPlay(int temp, boolean isSummer) 
	{
	  
		if (isSummer == true && (temp >= 60 && temp <= 100))
		{
	    
			return true;
	    
		}
		else if (temp >= 60 && temp <= 90)
		{
	    
			return true;
	    
		}
		else
	  	{
	    
			return false;
	    
	  	}
	  
	}
	
	
	/**
	 * Challenge 4: caughtSpeeding.
	 * You are driving a little too fast, and a police officer stops you. 
	 * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
	 * If speed is 60 or less, the result is 0. 
	 * If speed is between 61 and 80 inclusive, the result is 1. 
	 * If speed is 81 or more, the result is 2. 
	 * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
	 * @param speed - The speed that you're going.
	 * @param isBirthday - Tells whether it is your birthday or not.
	 * @return The ticket you got, encoded as an int.
	 */
	public int caughtSpeeding(int speed, boolean isBirthday) 
	{
	  
		int lowerLimit = isBirthday? 65 : 60;
		int upperLimit = isBirthday? 85 : 80;
	  
		if (speed <= lowerLimit)
		{
	    
			return 0;
	    
		}
		else if (speed <= upperLimit)
		{
	    
			return 1;
	    
		}
		else
		{
	    
			return 2;
	    
		}
	  
	}
	
	
	/**
	 * Challenge 5: sortaSum.
	 * Given 2 ints, a and b, return their sum. 
	 * However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
	 * @param a - The first addend.
	 * @param b - The second addend.
	 * @return The sum of a and b unless it is between 10 and 19 inclusive, in which case it will just return 20.
	 */
	public int sortaSum(int a, int b) 
	{
	  
		return a + b >= 10 && a + b <= 19? 20 : a + b;
	  
	}

}
