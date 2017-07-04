package work12.Model;

import java.util.List;

import work12.Car.Car;
import work12.Properties.*;

public class Searcher {
	private Boolean hasCar = false;
	private WheelDiameter wheelDiameter;
	private Color color;
	private BodyStyle bodyStyle;
	private EnterParameters enterParameters = new EnterParameters();

	public void searchWheelDiameter(List<Car> cars) {
		hasCar = false;
		wheelDiameter = enterParameters.diameterWheelEnter();

		for (Car car : cars) {
			if (car.getWheel().getDiameter().equals(wheelDiameter)) {
				hasCar = true;
				System.out.println(car);
			}
		}

		if (!hasCar) {
			System.out.println("Відсутні автомобілі з вказаним діаметром колеса");
		}
	}

	public void searchWheelDiameterAndColor(List<Car> cars) {
		wheelDiameter = enterParameters.diameterWheelEnter();
		color = enterParameters.colorEnter();
		hasCar = false;

		for (Car car : cars) {
			if (car.getWheel().getDiameter().equals(wheelDiameter) && (car.getCarBody().getColor().equals(color))) {
				hasCar = true;
				System.out.println(car);
			}
		}
		if (!hasCar) {
			System.out.println("Відсутні автомобілі з вказаним діаметром колеса та кольором");
		}
	}

	public void searchBodyType(List<Car> cars) {
		hasCar = false;
		bodyStyle = enterParameters.bodyStyleEnter();

		for (Car car : cars) {
			if (car.getCarBody().getBodyStyle().equals(bodyStyle)) {
				hasCar = true;
				System.out.println(car);
			}
		}

		if (!hasCar) {
			System.out.println("Відсутні автомобілі з вказаним типом кузова");
		}
	}
}
