import java.util.Scanner;

public class DistanceRunner {

	static int y2, y1, x2, x1;
	static double xSolution, ySolution;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		DistanceFormula df = new DistanceFormula();
		
		System.out.println("--- Coordinate Grid Distance Calculator ---");
		System.out.println("This distance calculator solves for the distance between 2 coordinate points.");
		System.out.println("The formula uses integers/whole numbers only, as follows:");
		System.out.println("The square root of: (X2 minus X1)squared PLUS (Y2 minus Y1)squared");
		System.out.println("--------------------");
		System.out.print("Enter X2: ");
		x2 = s.nextInt();

		System.out.print("Enter X1: ");
		x1 = s.nextInt();

		System.out.print("Enter Y2: ");
		y2 = s.nextInt();
		
		System.out.print("Enter Y1: ");
		y1 = s.nextInt();
		
		xSolution = df.xSolution(x2, x1);
		ySolution = df.ySolution(y2, y1);
		
		System.out.println("The distance between " + "(" + x1 + ", " + y1 + " and (" + x2 + ", " + y2 + ") is:");
		System.out.println(df.solveSolution(xSolution, ySolution));
		
	}
	
}
