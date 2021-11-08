package Question_2;


public class Main {
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
