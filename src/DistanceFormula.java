
public class DistanceFormula {

	public DistanceFormula() {
	}
	
	public double xSolution(int x2, int x1) {
		return Math.pow((x2 - x1), 2);
	}
	
	public double ySolution(int y2, int y1) {
		return Math.pow((y2 - y1), 2);
	}
	
	public double solveSolution(double xValues, double yValues) {
		return Math.sqrt(xValues + yValues);
	}
	
}
