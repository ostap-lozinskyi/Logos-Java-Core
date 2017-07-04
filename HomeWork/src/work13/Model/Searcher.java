package work13.Model;

import java.util.Set;

import work13.Car.Car;
import work13.Properties.*;

public class Searcher {
	private Boolean hasCar = false;
	private WheelDiameter wheelDiameter;
	private WheelDiameter wheelDiameter2;
	private TireType tireType;
	private EnterParameters enterParameters = new EnterParameters();

	public void searchTireTypeAndWheelDiameterRange(Set<Car> cars) {
		hasCar = false;
		tireType = enterParameters.tireTypeEnter();
		if (tireType == null) {
			return;
		}
		System.out.println("Введіть початковий та кінцевий діаметр");
		wheelDiameter = enterParameters.diameterWheelEnter();
		if (wheelDiameter == null) {
			return;
		}
		wheelDiameter2 = enterParameters.diameterWheelEnter();
		if (wheelDiameter2 == null) {
			return;
		}
		for (Car car : cars) {
			if ((car.getWheel().getTireType().equals(tireType))
					&& (car.getWheel().getDiameter().ordinal() >= wheelDiameter.ordinal())
					&& (car.getWheel().getDiameter().ordinal() <= wheelDiameter2.ordinal())) {
				hasCar = true;
				System.out.println(car);
			}
		}

		if (!hasCar) {
			System.out.println("Відсутні автомобілі з вказаним типом шин та діапазоном діаметрів колеса");
		}
	}
}
