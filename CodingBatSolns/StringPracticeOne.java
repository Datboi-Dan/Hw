
public class StringPracticeOne 
{
	
	/**
	 * Challenge 1: helloName. 
	 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	 * @param name which should be a name as a string.
	 * @return The greeting, "Hello *insert name*!".
	 */
	public String helloName(String name) 
	{
		
		//This code concatenates "Hello ", the name argument passed, and "!" in that order, and returns it.
		return "Hello " + name + "!";
	  
	}
	
	
	/**
	 * Challenge 2: makeAbba. 
	 * Given two strings, a and b, return the result of putting them together in the order abba, 
	 * e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 * @param a which can be any string value.
	 * @param b which can be any string value.
	 * @return The first string, the second string twice, then the first string.
	 */
	public String makeAbba(String a, String b) 
	{
	  
		//Concatenates a, b, b, and a in that order, and returns it.
		return a + b + b + a;
	  
	}

	
	/**
	 * Challenge 3: makeTags. 
	 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
	 * In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
	 * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
	 * @param tag which is the tag to surround the word with (without the <> or </>).
	 * @param word which is the word to be surrounded by tags.
	 * @return The word surrounded in tags.
	 */
	public String makeTags(String tag, String word) 
	{
	  
		/*
		 * Returns the word surrounded in tags.
		 * This is done by concatenating "<", the tag argument, ">", the word argument, "</", the tag argument again, and then ">" in that order.
		 */
		return "<" + tag + ">" + word + "</" + tag + ">";
	  
	}

	
	/**
	 * Challenge 4: firstHalf.
	 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	 * @param str which is the string to be halved.
	 * @return Half of the passed string.
	 */
	public String firstHalf(String str) 
	{
	 
		/*
		 * Declares a variable called halfstr, and assigns it the value of the half of the passed string.
		 * This is done by declaring the first index to be 0, and the second index to be whatever the length of the passed string is but halved.
		 */
		String halfstr = str.substring(0, (str.length() / 2));
		
		//Returns halfstr (the halved string).
		return halfstr;
	  
	}
	
}
