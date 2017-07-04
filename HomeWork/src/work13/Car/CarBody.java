package work13.Car;

import work13.Properties.*;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodyStyle == null) ? 0 : bodyStyle.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarBody other = (CarBody) obj;
		if (bodyStyle != other.bodyStyle)
			return false;
		if (color != other.color)
			return false;
		return true;
	}
	

}
