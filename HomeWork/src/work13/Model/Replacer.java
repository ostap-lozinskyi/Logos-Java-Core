package work13.Model;

import java.util.Set;

import work13.Car.*;
import work13.Properties.*;

public class Replacer {
	private Boolean hasCar = false;
	private EnterParameters enterParameters = new EnterParameters();
	private BodyStyle bodyStyle;
	private TireType tireType;
	private WheelDiameter wheelDiameter;

	public void replaceBodyStyleAndWheelDiameter(Set<Car> cars) {
		hasCar = false;
		bodyStyle = enterParameters.bodyStyleEnter();
		if (bodyStyle == null) {
			return;
		}
		wheelDiameter = enterParameters.diameterWheelEnter();
		if (wheelDiameter == null) {
			return;
		}
		tireType = enterParameters.tireTypeEnter();
		if (tireType == null) {
			return;
		}
		for (Car car : cars) {
			if ((car.getCarBody().getBodyStyle().equals(bodyStyle))
					&& (car.getWheel().getDiameter().equals(wheelDiameter))) {
				car.getWheel().setTireType(tireType);
				hasCar = true;
				System.out.println(car.toString() + " шини замінено");
			}
		}
		if (!hasCar) {
			System.out.println("Відсутні автомобілі з цим типом кузова та діаметром колеса");
		}
	}
}
