package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem5TheAreaOfATriangle {
	
	public static void main(String[] args) {
		
//		fix the bugs for when it's not a triangle
		
		Scanner areaofaTriangle = new Scanner(System.in);
		Double a;
		Double b;
		Double c;
		
		System.out.println("Please enter the length of one of the sides of the triangle" + "\n" + "\n"
							+ "(Please enter it in as a numerical value not written in words," + "\n" 
							+ "or with a degrees sign and hit enter):" + "\n");

		a = areaofaTriangle.nextDouble();
		
		System.out.println("\n");
		
		System.out.println("Please enter the length of another side of the triangle in the same format:" + "\n");
		
		b = areaofaTriangle.nextDouble();
		
		System.out.println("\n");
		
		System.out.println("Please enter the length of the third and final side of the triangle in the same format:" + "\n");
		
		c = areaofaTriangle.nextDouble();
		
		System.out.println("\n");
		
		double totalPerimeterDividedby2 = ((a + b +c)/2);
		
		double totalAreaoftheTriangle = (Math.sqrt((totalPerimeterDividedby2  * (totalPerimeterDividedby2  - a) * (totalPerimeterDividedby2  - b) * (totalPerimeterDividedby2  - c))));
		
		if (totalAreaoftheTriangle == 0)
		//	totalAreaoftheTriangle == Double.NaN Mr. Snow hlep in the future?
		
		{
			System.out.println("This side lengths you entered are not equal to a triangle, please try again. :)");
			
		}
		
		else
		{
			System.out.println("The total area of the triangle is " + totalAreaoftheTriangle + " units²."
					+ "\n (NaN stands for NOT-A-NUMBER, if you recieved this, you did not enter side lengths that equal a triangle.");
			
		}
		
		
/*		I did not use the Pythagorean Theorem for this program dispite the hint because not all triangles are right angle 
 * 		triangles and therefore the Pythagorean Theorem would not work on them. 
 * 
 * 
 * 
 * 
 * 		This code is pretty straight forward
 * 		you just have to think a little bit math wise.
 * 
 * 		Need help for when the side lengths are NaN (Not-a-Number). 
 *
 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
