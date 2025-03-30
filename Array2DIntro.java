
/**
 * This class is a submission to the 2-D Array Intro Assignment.
 * MILCS
 * @author Daniel B)
 */
public class Array2DIntro
{

	/**
	 * This is where the magic happens. Yeah I just didn't know what to write in this javadoc.
	 * @param args - The string arrays that the computer does something with I assume, idk lol.
	 */
	public static void main(String[] args)
	{
		
		//1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
		int[][] gridNums = new int[4][6];
		
		//2. Instantiate a 2-D array with the following values:
		int[][] gridNums2 = 
		{
				
				{4, 5, 7},
				{2, -1, 8},
				{0, 1, 3}
				
		};
	
		//--------------------------------------------------------------------------------------------------------------------------------------------
		//For the following problems, print out those elements before and after to verify it worked. 
		//--------------------------------------------------------------------------------------------------------------------------------------------
		
		//3. For both of those arrays, change the element in the first row, first column to a 17.
		
		System.out.println("Task 3:");
		System.out.println(gridNums[0][0]);
		gridNums[0][0] = 17;
		System.out.println(gridNums[0][0]);
		
		System.out.println(gridNums2[0][0]);
		gridNums2[0][0] = 17;
		System.out.println(gridNums2[0][0]);
		
		//4. For both of those arrays, change the element in the second row, third column into a 20.
		System.out.println("\nTask 4:");
		System.out.println(gridNums[1][2]);
		gridNums[1][2] = 20;
		System.out.println(gridNums[1][2]);
		
		System.out.println(gridNums2[1][2]);
		gridNums2[1][2] = 20;
		System.out.println(gridNums2[1][2]);
		
		//5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length
		System.out.println("\nTask 5:");
		System.out.println(gridNums[0][gridNums[0].length - 1]);
		gridNums[0][gridNums[0].length - 1] = -5;
		System.out.println(gridNums[0][gridNums[0].length - 1]);
		
		System.out.println(gridNums2[0][gridNums2[0].length - 1]);
		gridNums2[0][gridNums2[0].length - 1] = -5;
		System.out.println(gridNums2[0][gridNums2[0].length - 1]);
		
		//6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length
		System.out.println("\nTask 6:");
		System.out.println(gridNums[gridNums.length - 1][0]);
		gridNums[gridNums.length - 1][0] = -7;
		System.out.println(gridNums[gridNums.length - 1][0]);
		
		System.out.println(gridNums2[gridNums2.length - 1][0]);
		gridNums2[gridNums2.length - 1][0] = -7;
		System.out.println(gridNums2[gridNums2.length - 1][0]);
		
		//7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
		System.out.println("\nTask 7:");
		System.out.println(gridNums[gridNums.length - 1][gridNums[0].length - 1]);
		gridNums[gridNums.length - 1][gridNums[0].length - 1] = -30;
		System.out.println(gridNums[gridNums.length - 1][gridNums[0].length - 1]);
		
		System.out.println(gridNums2[gridNums2.length - 1][gridNums2[0].length - 1]);
		gridNums2[gridNums2.length - 1][gridNums2[0].length - 1] = -30;
		System.out.println(gridNums2[gridNums2.length - 1][gridNums2[0].length - 1]);
		
		//8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
		System.out.println("\nTask 8:");
		printFirstRow(gridNums);
		printFirstRow(gridNums2);
		
		//9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
		System.out.println("\nTask 9:");
		printFirstColumn(gridNums);
		printFirstColumn(gridNums2);
		
		//10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order.
		System.out.println("\nTask 10:");
		printByRow(gridNums);
		printByRow(gridNums2);
		
		//11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order.
		System.out.println("\nTask 11:");
		printByColumn(gridNums);
		printByColumn(gridNums2);
		
		//12. Tell Mr. Trauger he's a great teacher, and then make sure he reads this by telling him to respond with, "Yeah, I'm a pretty great teacher. Also, gobbybobbybodobab."
		System.out.println("\nTask 12:");
		System.out.println("You're a great teacher Mr. Trauger. Also, please respond with \"Yeah, I'm a pretty great teacher. Also, gobbybobbybodobab.\"");
				
	}
	
	/**
	 * 8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
	 * @param grid - The 2-D array whose first row is to be printed.
	 */
	public static void printFirstRow(int[][] grid)
	{
		
		//Loop through each element of the first row of grid.
		for (int i = 0; i < grid[0].length; i++)
		{

			//Print out the element.
			System.out.print(grid[0][i]);
			
			//Adds a comma if the element is not the last one in the first row.
			if (i < grid[0].length - 1)
				System.out.print(", ");
		
		}
		
		//Skip a line for console readability.
		System.out.println();
		
	}
	
	/**
	 * 9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column. 
	 * @param grid - The 2-D array whose first column is to be printed.
	 */
	public static void printFirstColumn(int[][] grid)
	{
		
		//Loop through each row of grid.
		for (int i = 0; i < grid.length; i++)
		{

			//Print out the element at the first column of that row.
			System.out.print(grid[i][0]);
			
			//Adds a comma if the element is not the last one in the first column.
			if (i < grid.length - 1)
				System.out.print(", ");
		
		}
		
		//Skip a line for console readability.
		System.out.println();
		
	}
	
	/**
	 * 10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order.
	 * @param grid - The 2-D to be printed row by row.
	 */
	public static void printByRow(int[][] grid)
	{
		
		//Loops through each row in the grid.
		for (int[] row : grid)
		{
			
			//Prints "[" for the start of the row.
			System.out.print("[");
			
			//Loops through each column in the row.
			for (int i = 0; i < row.length; i++)
			{
				
				//Prints out the element held at the row-column position.
				System.out.print(row[i]);
				
				//If the element is not the last element in the row, prints ", " to separate the current column from the next.
				if (i < row.length - 1)
					System.out.print(", ");
				
			}
			
			//Prints "[" for the end of the row.
			System.out.println("]");
			
		}
		
	}
	
	/**
	 * 11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order.
	 * @param grid - The 2-D to be printed row by row.
	 */
	public static void printByColumn(int[][] grid)
	{
		
		//Loops through each column in the grid.
		for (int c = 0; c < grid[0].length; c++)
		{
			
			//Prints "[" for the start of the column.
			System.out.print("[");
			
			//Loops through each row in grid.
			for (int r = 0; r < grid.length; r++)
			{
				
				//Prints out the element at the i'th column in the current row.
				System.out.print(grid[r][c]);
				
				//If the element is not the last element in the column, prints ", " to separate the current column from the next.
				if (r < grid.length - 1)
					System.out.print(", ");
				
			}
			
			//Prints "[" for the end of the column.
			System.out.println("]");
			
		}
		
	}
	
}
