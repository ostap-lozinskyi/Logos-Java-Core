package work13.Car;

import work13.Properties.*;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carBody == null) ? 0 : carBody.hashCode());
		result = prime * result + ((helm == null) ? 0 : helm.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		Car other = (Car) obj;
		if (carBody == null) {
			if (other.carBody != null)
				return false;
		} else if (!carBody.equals(other.carBody))
			return false;
		if (helm == null) {
			if (other.helm != null)
				return false;
		} else if (!helm.equals(other.helm))
			return false;
		if (model != other.model)
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}
	
}