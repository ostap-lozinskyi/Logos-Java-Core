package work12.Car;

import work12.Properties.*;

public class Wheel {
	private WheelDiameter wheelDiameter;
	private TireType tireType;

	public Wheel(WheelDiameter wheelDiameter, TireType tireType) {
		this.wheelDiameter = wheelDiameter;
		this.tireType = tireType;
	}

	public WheelDiameter getDiameter() {
		return wheelDiameter;
	}

	public void setDiameter(WheelDiameter wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}

	public TireType getTireType() {
		return tireType;
	}

	public void setTireType(TireType tireType) {
		this.tireType = tireType;
	}

	@Override
	public String toString() {
		return "Wheel diameter= " + wheelDiameter + " tire type= " + tireType;
	}
}
