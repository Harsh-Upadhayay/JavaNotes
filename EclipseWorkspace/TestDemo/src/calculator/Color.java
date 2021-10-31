package calculator;

public enum Color {
	RED("red"), GREEN("green"), Blue("Blue");
		
	private String value;
	
	Color(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
