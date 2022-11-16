package FirstComputerScienceAssignment;

import java.util.Scanner;

public class Problem10FindTheVolumeOfACylinderAndCone {

	public static void main(String[] args) {
		
/*		Fing a way to make it so that decimals can be imputted. */
		
		Scanner findTheVolumeOfCylinderAndCone = new Scanner(System.in);
		double height;
		double radius;
		
		System.out.println("Please enter the height and radius of your three dimensional shape and hit enter inbetween:");
		
		height = findTheVolumeOfCylinderAndCone.nextDouble();
		radius = findTheVolumeOfCylinderAndCone.nextDouble();
		
		double volumeOfCylinder = (((Math.pow(radius, 2)) * 3.14159265358979323846) * height );
		
		double volumeOfCone = (((Math.pow(radius, 2)) * 3.14159265358979323846) * (height / 3));
		
		System.out.println("\nThe volume of the cylinder is: " + volumeOfCylinder + " units².");
		System.out.println("\nThe volume of the cone is: " + volumeOfCone + " units².");
		
		
			



	}

}
