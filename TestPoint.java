package tryingOut;
import javax.swing.JOptionPane;

public class TestPoint {

	public static void main(String[] args) 
	{
		
		
		// Double Section:
		
		// Create two double objects to use as coordinates
	
		Double dblX = 1.5;
		Double dblY = 2.5;
		
		
		// Create a Point oject that can hold Doubles
		Point<Double> dPoint = new Point<Double>(dblX, dblY);
		
		//COULD HAVE BEEN WRITTEN LIKE THIS
		// Point<Double> dPoint new Point<>(1.5,2.5);
		
		
		
		// Use Autoboxing to pass doubles to the constructor
		// Point<Double> dPoint = new Point<>(1.5, 2.5);
		
		//Use unboxing to retrieve the X and Y coordinates and assign them to double variables
		double x = dPoint.getX();
		double y = dPoint.getY();
		
		
		
		// Integer Section:
		
		// Create Two Integer objects to use as coordinates.
		Integer intX = 10;
		Integer intY = 20;
		
		
		// Create a point object that can hold Integers
		Point<Integer, Integer> iPoint = new Point<Integer, Integer>(intX, intY);
		
		
		// Display the Double Values stored in dPoint
		JOptionPane.showMessageDialog(null, "Here are the values in dPoint");
		JOptionPane.showMessageDialog(null, "X Coordinate: " + dPoint.getX());
		JOptionPane.showMessageDialog(null, "Y Coordinate: " + dPoint.getY());
		
		
		// Display the Integer Values stored in iPoint
		JOptionPane.showMessageDialog(null, "Here are all the values in iPoint");
		JOptionPane.showMessageDialog(null,"X Coordinate: " + iPoint.getX());
		JOptionPane.showMessageDialog(null,"Y Coordinate: " + iPoint.getY());
		
		// Use a Double and an int
		Point<Double, Integer> doubleIntegerPoint = new Point<Double, Integer>(dblX, intY);
		
		

	}

}
