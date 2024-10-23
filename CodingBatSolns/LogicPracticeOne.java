
public class LogicPracticeOne.java
{
	
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
	
	
	public int sortaSum(int a, int b) 
	{
	  
		return a + b >= 10 && a + b <= 19? 20 : a + b;
	  
	}

}
