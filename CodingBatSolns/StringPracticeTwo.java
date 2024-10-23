
public class StringPracticeTwo
{
	
	/**
	 * Challenge 1: makeOutWord.
	 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string.
	 * e.g. "<<word>>" 
	 * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
	 * @param out - The container surrounding the word.
	 * @param word = The word to be surrounded.
	 * @return The word surrounded by out.
	 */
	public String makeOutWord(String out, String word) 
	{
	  
		return out.substring(0, 2) + word + out.substring(2);
	  
	}
	
	
	/**
	 * Challenge 2: extraEnd.
	 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
	 * The string length will be at least 2.
	 * @param str - The string that will have its last two characters copied. 
	 * @return The last two characters of the string three times in a row.
	 */
	public String extraEnd(String str) 
	{
	  
		return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
	  
	}
	
	
	/**
	 * Challenge 3: firstTwo.
	 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
	 * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
	 * Note that str.length() returns the length of a string.
	 * @param str the string to be cut to its first two characters.
	 * @return Either the strings first two characters or the string itself if its length is less than two.
	 */
	public String firstTwo(String str) 
	{
	  
	  String newString = str.length() < 2? str : str.substring(0, 2);
	  return newString;
	  
	}
	
	
	/**
	 * Challenge 4: withoutEnd.
	 * Given a string, return a version without the first and last char, so "Hello" yields "ell". 
	 * The string length will be at least 2.
	 * @param str The string to be cut to its middle characters.
	 * @return The string without its first and last characters.
	 */
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

