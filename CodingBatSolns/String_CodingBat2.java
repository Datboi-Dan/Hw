
public class String_CodingBat2 
{
	
	public String makeOutWord(String out, String word) 
	{
	  
		return out.substring(0, 2) + word + out.substring(2);
	  
	}
	
	
	public String extraEnd(String str) 
	{
	  
		return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
	  
	}
	
	
	public String firstTwo(String str) 
	{
	  
	  String newString = str.length() < 2? str : str.substring(0, 2);
	  return newString;
	  
	}
	
	
	public String withoutEnd(String str) 
	{
	  
		if (str.length() < 2)
		{
			
			return str;
			
		}
		else
		{
			
			return str.substring(1, str.length() - 1);
		
		}
	  
	}

}

