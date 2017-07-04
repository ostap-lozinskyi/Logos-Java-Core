package work12.Model;

import java.util.Iterator;
import java.util.List;

import work12.Car.Car;
import work12.Properties.*;

public class Remover {
	private Color color;
	private BodyStyle bodyStyle;
	private HelmDiameter helmDiameter1;
	private HelmDiameter helmDiameter2;
	private Boolean hasCar = false;
	private EnterParameters enterParameters = new EnterParameters();

	public void removeColor(List<Car> cars) {
		hasCar = false;
		color = enterParameters.colorEnter();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car tmp = iterator.next();
			if (tmp.getCarBody().getColor().equals(color)) {
				iterator.remove();
				hasCar = true;
				System.out.println("Автомобіль видалено");
			}
		}
		if (!hasCar) {
			System.out.println("Відсутні автомобілі з введеним кольором кузова");
		}
	}

	public void removeBodyStyleAndHelmDiameter(List<Car> cars) {
		hasCar = false;
		bodyStyle = enterParameters.bodyStyleEnter();
		System.out.println("Введіть діапазон діаметру керма");
		helmDiameter1 = enterParameters.diameterHelmEnter();
		helmDiameter2 = enterParameters.diameterHelmEnter();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car tmp = iterator.next();
			if ((tmp.getCarBody().getBodyStyle().equals(bodyStyle))
					&& (tmp.getHelm().getHelmDiameter().ordinal() >= helmDiameter1.ordinal())
					&& tmp.getHelm().getHelmDiameter().ordinal() <= helmDiameter2.ordinal()) {
				iterator.remove();
				hasCar = true;
				System.out.println("Автомобіль видалено");
			}
		}
		if (!hasCar) {
			System.out.println("Відсутні автомобілі з введеним типом кузова та діаметром керма");
		}
	}
}
