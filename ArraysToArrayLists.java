import java.util.ArrayList;

/**
 * This is a submission to the Converting array algs to ArrayList algs assignment.
 * MILCS
 * @author Daniel B)
 */
public class ArraysToArrayLists
{

	public static void main(String[] args)
	{

		ArrayList<Integer> arrayList = rng(10, 10, 0);
		System.out.println("Original ArrayList: " + arrayList);
		//For the following problems, all ArrayLists will store references to Integer objects.
		
		//1. Create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
		System.out.println(checkFor4(arrayList) != -1? "Index of 4: " + checkFor4(arrayList) : "No 4's over here.");
		
		//2. Create a method ridAllFives() that is passed an ArrayList nums and alters that ArrayList without returning anything.
		ridAllFives(arrayList);
		System.out.println(arrayList);
		
		//3. Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
		bubbleSort(arrayList);
		System.out.println(arrayList);
		
		
	}
	
	/**
	 * 1. Create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
	 * @param arrayList - The ArrayList that is passed.
	 * @return The index of the first 4, or -1 if there is no 4.
	 */
	public static int checkFor4(ArrayList<Integer> arrayList)
	{
		
		/*
		 * Alternate way that I would do:
		 return arrayList.indexOf(4);
		 */
		
		//Declare ordinal keeping track of what number we're on for the upcoming for each loop.
		int ordinal = 0;
		
		//Using a for each loop cause I'm lazy and don't wanna use a getter.
		for (int number : arrayList)
		{
			
			if (number == 4)
				return ordinal;
			
			ordinal++;
			
		}
		
		//Return the ordinal minus the size even though it's less efficient by one step just cause it's funny.
		return --ordinal - arrayList.size();
				
		
	}
	
	/**
	 * Copy and pasted checkFor4 but but changed 5 to use for ridAllFives.
	 * @param arrayList - The ArrayList that is passed.
	 * @return The index of the first 4, or -1 if there is no 4.
	 */
	public static int checkFor5(ArrayList<Integer> arrayList)
	{
		
		/* The simple way.
		return arrayList.indexOf(4);
		*/
		
		////Declare ordinal keeping track of what number we're on for the upcoming for each loop.
		int ordinal = 0;
		
		
		for (int number : arrayList)
		{
			
			if (number == 5)
				return ordinal;
			
			ordinal++;
			
		}
		
		//Return the decremented ordinal minus the size even though it's less efficient by one step just cause it's funny.
		return --ordinal - arrayList.size();
				
		
	}
	
	/**
	 * 2. Create a method ridAllFives() that is passed an ArrayList nums and alters that ArrayList without returning anything. 
	 * The ArrayList will have any 5’s deleted from nums.
	 * @param nums - The ArrayList of numbers that is altered to have no five.
	 */
	public static void ridAllFives(ArrayList<Integer> nums)
	{
		
		/* Another simple way.
		while (nums.contains(5))
			nums.remove(nums.indexOf(5));
		*/
		
		//Loops until checkFor5 doesn't five a five.
		while (checkFor5(nums) != -1)
			//Removes the five at the index checkFor5 returns.
			nums.remove(checkFor5(nums));
		
		
	}
	
	/**
	 * 3. Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
	 * @param arrayList - The ArrayList that is passed.
	 */
	public static void bubbleSort(ArrayList<Integer> arrayList)
	{
		
		/* Funny use of the .forEach method.
		var wrapper = new Object() {int i = 0; boolean sorted = false;};
		while (!wrapper.sorted)
		{
			
			wrapper.sorted = true;
			
			arrayList.forEach( number -> {if (wrapper.i < arrayList.size() - 1 && arrayList.get(wrapper.i) > arrayList.get(wrapper.i + 1)) {arrayList.set(wrapper.i, arrayList.set(wrapper.i + 1, number)); wrapper.sorted = false;} wrapper.i++;});
			
			wrapper.i = 0;
			
		}
		*/
		
		//Declare a boolean that represents if the array is sorted.
		boolean sorted = false;
		
		//Loops until the array is sorted.
		while (!sorted)
		{
			
			//Sets sorted to true until a change occurs.
			sorted = true;
			
			//Keeps track of the index cause I still don't want to use getters and standard for.
			int index = 0;
			
			//Loops through each element in the array.
			for (int number : arrayList)
			{
				
				//Switches the current number and the one after it if the current number is greater than the next. Excludes the last index.
				if (index < arrayList.size() - 1 && number > arrayList.get(index + 1))
				{
					
					//Switches the elements at the current and next indices with each other.
					arrayList.set(index, arrayList.set(index + 1, number));
					//Sets sorted to false as a change occurred.
					sorted = false;
					
				}
				
				//Increments the index.
				index++;
				
			}
			
			//Resets the index for the next iteration.
			index = 0;
			
		}
		
	}
	
	/**
	 * Random ArrayList generator.
	 * @param elements - The number of elements to be in the ArrayList.
	 * @param range - The range of numbers an element can be.
	 * @param min - The minimum number an element can be.
	 * @return An ArrayList of random numbers.
	 */
	public static ArrayList<Integer> rng(int elements, int range, int min)
	{
		
		//Make a new ArrayList.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Loop for a number of times equal to the passed elements parameter.
		for (int i = 0; i < elements; i++)
		{
			
			//Add a random number from the passed range parameter that is at least the passed min parameter.
			numbers.add((int)(Math.random() * range + min));
			
		}
		
		//Return the random ArrayList.
		return numbers;
		
	}
	
}
