package work12.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import work12.Car.*;
import work12.Properties.*;

public class Holder {
	private static List<Integer> carIndices = new ArrayList<>();

	private EnterParameters enterParameters = new EnterParameters();
	private BodyStyle bodyStyle;
	private boolean hasCar;

	public void holdBodyStyle(List<Car> cars) {
		bodyStyle = enterParameters.bodyStyleEnter();

		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car tmp = iterator.next();
			if (tmp.getCarBody().getBodyStyle().equals(bodyStyle)) {
				carIndices.add(cars.indexOf(tmp));
				hasCar = true;
				System.out.println("Автомобіль додано в список");
			}
		}
		System.out.println(carIndices);
		if (!hasCar) {
			System.out.println("Відсутні автомобілі з введеним типом кузова");
		}
	}
}
