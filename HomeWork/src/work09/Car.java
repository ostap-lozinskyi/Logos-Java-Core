package work09;

public class Car {
	private final SteeringWheel steeringWheel;
	private final Wheel wheel;
	private final CarBody carBody;

	private String model;

	public Car(String model, SteeringWheel steeringWheel, Wheel wheel, CarBody carBody) {
		super();
		this.model = model;
		this.steeringWheel = steeringWheel;
		this.wheel = wheel;
		this.carBody = carBody;
	}

	public void setCovering(String covering) {
		steeringWheel.setCovering(covering);
	}

	public void setDiameter(int diameter) {
		wheel.setDiameter(diameter);
	}

	public void setColor(String color) {
		carBody.setColor(color);
	}

	@Override
	public String toString() {
		return "Car [model= " + model + ", " + steeringWheel + ", " + wheel + ", " + carBody + "]";
	}
	
	public void setParameters(String covering, int diameter, String color){
		setCovering(covering);
		setDiameter(diameter);
		setColor(color);
	}

}
