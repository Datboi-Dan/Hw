/*
 * This assignment is the first homework from AP Computer Science
 */
public class Homework_1_Practicing_System_and_Primitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Task 1: Print out your name using the letter "O" in ASCII art. (why)
		/*
		 * Testing how it would look in the console
		 * OO       O     OO    O O OOOOO O
		 * O O     O O    O O   O O O     O
		 * O  O   OOOOO   O  O  O O OOO   O
		 * O O   O     O  O   O O O O     O
		 * OO   O       O O    OO O OOOOO OOOOO
		 */
		System.out.println("OO       O     OO    O O OOOOO O");
		System.out.println("O O     O O    O O   O O O     O");
		System.out.println("O  O   OOOOO   O  O  O O OOO   O");
		System.out.println("O O   O     O  O   O O O O     O");
		System.out.println("OO   O       O O    OO O OOOOO OOOOO");
		
		//Make new line
		System.out.println();
		
		/*	Task 2: Write code to compute the following math problem:
				6.0 x 3.5 - 1.5 x 5
				-------------------
    				55.6 - 30.2
		*/
		double top = 6.0 * 3.5 - 1.5 * 5;
		double bot = 55.6 - 30.2;
		System.out.println(top/bot);
		
		//Make new line
		System.out.println();
		
		/*Task 3: Write adaptable code that will print out the circumference and area of a circle that has a radius of 4.0. 
		 * (Hint: the value of pi is 3.1519 and it never changes)
		 */
		final double pi = 3.14159;
		double rad = 4.0;
		double circ = 2*pi*rad;
		double area = pi*(rad*rad);
		System.out.print("If the radius equals, "+rad+" the circumference of the circle is "+circ+" and the area of the circle is "+area+". :)");
		
	}

}
