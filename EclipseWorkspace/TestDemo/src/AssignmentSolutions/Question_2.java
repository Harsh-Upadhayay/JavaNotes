
package AssignmentSolutions;

import java.util.Scanner;
import java.lang.Math;

class Question_2 {
	public static void main(String[] args) {
		Shape rect = new ShapeRectangle();
		Shape tri  = new ShapeTriangle();
		
		rect.input_data();
		rect.output_data();
		rect.output_area();
		rect.output_parameter();
		
		tri.input_data();
		tri.output_data();
		tri.output_area();
		tri.output_parameter();
	}
}


abstract class Shape {
	double edge_1, edge_2, edge_3, edge_4, height, radius, area, parm;
	
	public abstract void input_data();
	public abstract void output_data();
	public abstract void output_area();
	public abstract void output_parameter();
}

class ShapeRectangle extends Shape{

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void input_data() {
		System.out.print("Enter lenght of first side of Rectangle in cm: ");
		edge_3 = edge_1 = sc.nextFloat();
		System.out.println();
		System.out.print("Enter lenght of side adjcent to first side of Triangle in cm: ");
		edge_4 = edge_2 = sc.nextFloat();
		System.out.println();
		
	}

	@Override
	public void output_data() {
		System.out.println("\nFirst side of Rectangle  : " + edge_1 + " cm" +
				 		 "\nSecond side of Rectangle   : " + edge_2 + " cm" +
				 		 "\nThird side of Rectangle    : " + edge_3 + " cm" +		
						 "\nFourth side of Rectangle   : " + edge_4 + " cm" );
	}

	@Override
	public void output_area() {
		area = edge_1*edge_2;
		System.out.println("Area of Rectangle is : " + area + " sqcm");
		
	}

	@Override
	public void output_parameter() {
		parm = (edge_1 + edge_2 + edge_3 + edge_4);
		System.out.println("Parameter of Rectangle is : " + parm);
		
	}
	
}

class ShapeTriangle extends Shape{

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void input_data() {
		System.out.print("Enter lenght of first side of Triangle in cm: ");
		edge_1 = sc.nextFloat();
		System.out.print("Enter lenght of second side of Triangle in cm: ");
		edge_2 = sc.nextFloat();
		System.out.print("Enter lenght of third side of Triangle in cm: ");
		edge_3 = sc.nextFloat();
		
	}

	@Override
	public void output_data() {
		System.out.println("First side of Triangle  : " + edge_1 + " cm" +
						 "\nSecond side of Triangle : " + edge_2 + " cm" +		
						 "\nThird side of Triangle  : " + edge_3 + " cm" );
	}

	@Override
	public void output_area() {
		double s = (edge_1 + edge_2 + edge_3)/ 2;
		area = Math.sqrt(s*(s-edge_1)*(s-edge_2)*(s-edge_3));
		System.out.println("Area of Triangle is : " + area + " sqcm");
		
	}

	@Override
	public void output_parameter() {
		parm = (edge_1 + edge_2 + edge_3);
		System.out.println("Parameter of Triangle is : " + parm);
		
	}
	
}
