package work12.Car;

import work12.Properties.*;

public class Car {
	private Helm helm;
	private Wheel wheel;
	private CarBody carBody;

	private Model model;

	public Car(Model model, Helm helm, Wheel wheel, CarBody carBody) {
		super();
		this.model = model;
		this.helm = helm;
		this.wheel = wheel;
		this.carBody = carBody;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
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
		return "Car [model= " + model + ", " + helm + ", " + wheel + ", " + carBody + "]";
	}
}