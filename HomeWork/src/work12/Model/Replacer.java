package work12.Model;

import java.util.List;

import work12.Car.*;
import work12.Properties.*;

public class Replacer {
	private WheelDiameter diameter;
	private Boolean hasCar = false;
	private EnterParameters enterDiameterAndColor = new EnterParameters();
	private CarCreator carCreator = new CarCreator();
	private WheelDiameter diameter1;
	private WheelDiameter diameter2;

	public void replaceSteeringWheel(List<Car> cars) {
		hasCar = false;
		for (Car car : cars) {
			if (car.getCarBody().getColor().equals(Color.RED)) {
				if (car.getHelm().getCovering().equals(Covering.CLOTH)) {
					car.getHelm().setCovering(Covering.LEATHER);
				} else {
					car.getHelm().setCovering(Covering.CLOTH);
				}
				hasCar = true;
				System.out.println(car.toString() + " кермо замінено");
			}
		}
		if (!hasCar) {
			System.out.println("Відсутні автомобілі з меншим діаметром колеса");
		}
	}

	public void replaceDiameter(List<Car> cars) {
		WheelDiameter[] diameters = WheelDiameter.values();
		for (Car car : cars) {
			if (car.getHelm().getHelmButtons().equals(HelmButtons.WITHBUTTONS)) {
				int ord = car.getWheel().getDiameter().ordinal();
				try {
					car.getWheel().setDiameter(diameters[ord + 2]);
					System.out.println(car.toString() + " діаметр колеса збільшено");
				} catch (Exception e) {
					System.err.println("Максимальний розмір колеса, збільшити діаметр неможливо");
				}
			}
		}
	}

	public void replaceCar(List<Car> cars) {
		diameter = enterDiameterAndColor.diameterWheelEnter();
		hasCar = false;
		try {
			for (int i = 0; i < cars.size(); i++) {
				if (cars.get(i).getWheel().getDiameter().ordinal() < diameter.ordinal()) {
					System.out.println("машину " + cars.get(i) + "замінено");
					cars.set(i, carCreator.createCar());
					System.out.println("на " + cars.get(i));
					System.out.println();
					hasCar = true;
				}
			}
		} catch (Exception e) {
			System.err.println("Введено недопустиме значеня, введіть значення в діапазоні 13-20!");
		}
		if (!hasCar) {
			System.out.println("Відсутні автомобілі з меншим діаметром колеса");
		}
	}

	public void replaceTireType(List<Car> cars) {
		System.out.println("Введіть початковий та кінцевий діаметр");
		diameter1 = enterDiameterAndColor.diameterWheelEnter();
		diameter2 = enterDiameterAndColor.diameterWheelEnter();
		hasCar = false;

		try {
			for (int i = 0; i < cars.size(); i++) {
				if ((cars.get(i).getWheel().getDiameter().ordinal() >= diameter1.ordinal())
						&& (cars.get(i).getWheel().getDiameter().ordinal() <= diameter2.ordinal())) {
					System.out.println("машину " + cars.get(i) + "замінено");
					cars.get(i).getWheel().setTireType(TireType.WINTER);
					System.out.println("на " + cars.get(i));
					System.out.println();
					hasCar = true;
				}
			}
		} catch (Exception e) {
			System.err.println("Введено недопустиме значеня, введіть значення в діапазоні 13-20!");
		}
		if (!hasCar) {
			System.out.println("Відсутні автомобілі з розміром коліс в даному діапазоні");
		}
	}
}
