package work13.Model;

import java.util.Iterator;
import java.util.Set;

import work13.Car.Car;
import work13.Properties.*;

public class Remover {
	private Boolean hasCar = false;
	private WheelDiameter wheelDiameter1;
	private WheelDiameter wheelDiameter2;
	private EnterParameters enterParameters = new EnterParameters();

	public void removeWheelDiameterRange(Set<Car> cars) {
		hasCar = false;
		System.out.println("Введіть початковий та кінцевий діаметр");
		wheelDiameter1 = enterParameters.diameterWheelEnter();
		if (wheelDiameter1 == null) {
			return;
		}
		wheelDiameter2 = enterParameters.diameterWheelEnter();
		if (wheelDiameter2 == null) {
			return;
		}
		try {
			Iterator<Car> iterator = cars.iterator();
			while (iterator.hasNext()) {
				Car tmp = iterator.next();
				if ((tmp.getWheel().getDiameter().ordinal() >= wheelDiameter1.ordinal())
						&& (tmp.getWheel().getDiameter().ordinal() <= wheelDiameter2.ordinal())) {
					iterator.remove();
					hasCar = true;
					System.out.println("Автомобіль " + tmp + " видалено");
				}
			}
		} catch (Exception e) {
			System.err.println("Введено недопустиме значеня, введіть значення в діапазоні 13-20!");
		}
		if (!hasCar) {
			System.out.println("Відсутні автомобілі з введеним діаметром коліс");
		}
	}
}
