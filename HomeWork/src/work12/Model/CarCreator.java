package work12.Model;

import work12.Properties.*;
import work12.Car.*;
import java.util.Random;

public class CarCreator {
	private Random random = new Random();
	private Model[] models = Model.values();
	private Covering[] coverings = Covering.values();
	private HelmButtons[] helmButtons = HelmButtons.values();
	private WheelDiameter[] diameters = WheelDiameter.values();
	private Color[] colors = Color.values();
	private BodyStyle[] bodyStyles = BodyStyle.values();
	private TireType[] tireTypes = TireType.values();
	private HelmDiameter[] helmDiameter = HelmDiameter.values();

	public Car createCar() {
		return new Car(models[random.nextInt(models.length)],
				new Helm(helmDiameter[random.nextInt(helmDiameter.length)], coverings[random.nextInt(coverings.length)],
						helmButtons[random.nextInt(helmButtons.length)]),
				new Wheel(diameters[random.nextInt(diameters.length)], tireTypes[random.nextInt(tireTypes.length)]),
				new CarBody(bodyStyles[random.nextInt(bodyStyles.length)], colors[random.nextInt(colors.length)]));
	}
}
