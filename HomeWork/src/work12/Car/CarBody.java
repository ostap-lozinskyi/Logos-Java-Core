package work12.Car;

import work12.Properties.*;

public class CarBody {
	private Color color;
	private BodyStyle bodyStyle;

	public CarBody(BodyStyle bodyStyle, Color color) {
		this.color = color;
		this.bodyStyle = bodyStyle;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public BodyStyle getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(BodyStyle bodyStyle) {
		this.bodyStyle = bodyStyle;
	}

	@Override
	public String toString() {
		return "CarBody style= " + bodyStyle + ", color= " + color;
	}

}
