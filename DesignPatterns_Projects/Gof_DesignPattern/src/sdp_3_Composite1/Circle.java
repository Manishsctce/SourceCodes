package sdp_3_Composite1;

public class Circle implements Shape {
	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);
	}
}
