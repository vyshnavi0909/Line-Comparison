import java.util.*;

public class lineComparison {

	//Creating a constructor for reading inputs from user
	static int userInput(){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		return x;
	}

	//Creating a constructor for calculating lengths of the lines
	static double length(int a, int b, int c, int d){
		double lenOfLine = Math.sqrt(Math.pow((c - a),2) + Math.pow((d - b),2));
		return lenOfLine;
	}

	public static void main(String[] args){
		System.out.println("Welcome to Line Comparison Computation");

		//reading inputs by calling static method UserInput()
		int x1 = userInput();
		int x2 = userInput();
		int x3 = userInput();
		int x4 = userInput();
		int y1 = userInput();
		int y2 = userInput();
		int y3 = userInput();
		int y4 = userInput();

		//creating objects for finding lengths
		double lenOfLine1 = length(x1, y1, x2, y2);
		double lenOfLine2 = length(x3, y3, x4, y4);

		System.out.println("length of First Line: " + lenOfLine1 );

		System.out.println("length of Second Line: " + lenOfLine2 );

		Double len1 = new Double(lenOfLine1);
		Double len2 = new Double(lenOfLine2);

		//checking whether both the lines are equal or not
		System.out.println(len1.equals(len2));

		//comparing both the lines
		System.out.println(len1.compareTo(len2));
	}
}
