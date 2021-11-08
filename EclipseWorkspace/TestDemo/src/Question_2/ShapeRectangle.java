package Question_2;

import java.util.Scanner;

public class ShapeRectangle extends Shape{

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
