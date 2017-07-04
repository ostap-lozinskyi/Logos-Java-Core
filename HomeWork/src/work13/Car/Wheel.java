package work13.Car;

import work13.Properties.*;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tireType == null) ? 0 : tireType.hashCode());
		result = prime * result + ((wheelDiameter == null) ? 0 : wheelDiameter.hashCode());
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
		Wheel other = (Wheel) obj;
		if (tireType != other.tireType)
			return false;
		if (wheelDiameter != other.wheelDiameter)
			return false;
		return true;
	}	
}
