package Question_2;

import java.util.Scanner;


import java.lang.Math;

public class ShapeTriangle extends Shape{

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
