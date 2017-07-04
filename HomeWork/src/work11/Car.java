package work11;

import work11.enumPack.*;

public class Car {
	private SteeringWheel steeringWheel;
	private Wheel wheel;
	private CarBody carBody;

	private Model model;

	public Car(Model model, SteeringWheel steeringWheel, Wheel wheel, CarBody carBody) {
		super();
		this.model = model;
		this.steeringWheel = steeringWheel;
		this.wheel = wheel;
		this.carBody = carBody;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public CarBody getCarBody() {
		return carBody;
	}

	public void setCarBody(CarBody carBody) {
		this.carBody = carBody;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model= " + model + ", " + steeringWheel + ", " + wheel + ", " + carBody + "]";
	}
}