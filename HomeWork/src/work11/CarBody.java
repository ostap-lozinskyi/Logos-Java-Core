package work11;

import work11.enumPack.Color;

public class CarBody {
	private Color color;

	public CarBody(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CarBody color= " + color;
	}

}
