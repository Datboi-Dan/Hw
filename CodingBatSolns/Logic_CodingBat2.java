
public class Logic_CodingBat2 
{
	
	/**
	 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, 
	 * return a string of the form "7:00" indicating when the alarm clock should ring. 
	 * Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". 
	 * Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
	 * @param day - the day encoded as an int from 0 - 6.
	 * @param vacation - tells whether you are on vacation or not.
	 * @return When the alarm should ring.
	 */
	public String alarmClock(int day, boolean vacation) 
	{
	  
		if (vacation)
		{
	    
			if (day == 0 || day == 6)
			{
	      
				return "off";
	      
			}
			else
			{
	      
				return "10:00";
	      
			}
	    
		}
		else
		{
	    
			if (day == 0 || day == 6)
			{
	      
				return "10:00";
	      
			}
			else
			{
	      
				return "7:00";
	      
			}
	    
		}
	  
	}
	
	
	/**
	 * Given a number n, return true if n is in the range 1..10, inclusive. 
	 * Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
	 * @param n - A number.
	 * @param outsideMode - Changes the conditions whether it's true or not.
	 * @return Whether n is within 1 - 10 or outside 1 - 10 if outside mode is true.
	 */
	public boolean in1To10(int n, boolean outsideMode) 
	{
	  
		if (outsideMode)
		{
	    
			if (n <= 1 || n >= 10)
			{
	      
				return true;
	    
			}
			else
			{
	      
				return false;
			}
	    
		}
		else
		{
	    
			if (n >= 1 && n <= 10)
			{
	      
				return true;
	      
			}
			else
			{
	      
				return false;
	      
			}
	    
		}
	  
	}

	
	/**
	 * Return true if the given non-negative number is a multiple of 3 or 5, but not both. 
	 * Use the % "mod" operator
	 * @param n - A number.
	 * @return Whether the number is a multiple of 3 or 5, but not both at the same time.
	 */
	public boolean old35(int n) 
	{
	  
		if (n % 3 == 0 && n % 5 == 0)
		{
	    
			return false;
	    
		}
		else if (n % 3 == 0 || n % 5 == 0)
		{
	    
			return true;
	    
		}
		else
		{
	    
			return false;
	    
		}
	  
	}



}
