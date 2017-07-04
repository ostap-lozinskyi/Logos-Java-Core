package work10;

import work10.enumPack.Color;
import work10.enumPack.Covering;
import work10.enumPack.Diameter;
import work10.enumPack.Model;

public class Car {
	private final SteeringWheel steeringWheel;
	private final Wheel wheel;
	private final CarBody carBody;

	private Model model;

	public Car(Model model, SteeringWheel steeringWheel, Wheel wheel, CarBody carBody) {
		super();
		this.model = model;
		this.steeringWheel = steeringWheel;
		this.wheel = wheel;
		this.carBody = carBody;
	}

	public void setCovering(Covering covering) {
		steeringWheel.setCovering(covering);
	}

	public void setDiameter(Diameter diameter) {
		wheel.setDiameter(diameter);
	}

	public void setColor(Color color) {
		carBody.setColor(color);
	}

	@Override
	public String toString() {
		return "Car [model= " + model + ", " + steeringWheel + ", " + wheel + ", " + carBody + "]";
	}
	
	public void setParameters(Covering covering, Diameter diameter, Color color){
		setCovering(covering);
		setDiameter(diameter);
		setColor(color);
	}

}
