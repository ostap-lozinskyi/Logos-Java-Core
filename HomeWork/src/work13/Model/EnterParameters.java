package work13.Model;

import java.util.Scanner;

import work13.Properties.*;

public class EnterParameters {
	private Scanner scanner = new Scanner(System.in);

	public WheelDiameter diameterWheelEnter() {
		WheelDiameter wheelDiameter = null;
		System.out.println("Виберіть діаметр колеса: \n"
				+ "R13, введіть: R13 \n"
				+ "R14, введіть: R14 \n"
				+ "R15, введіть: R15 \n"
				+ "R16, введіть: R16 \n"
				+ "R17, введіть: R17 \n"
				+ "R18, введіть: R18 \n"
				+ "R19, введіть: R19 \n"
				+ "R20, введіть: R20");

		try {
			String size = scanner.next();
			wheelDiameter = WheelDiameter.valueOf(size.toUpperCase());
		} catch (Exception e) {
			System.out.println("Введено недопустиме значеня, введіть значення в діапазоні 13-20!");
		}
		return wheelDiameter;
	}

	public BodyStyle bodyStyleEnter() {
		BodyStyle bodyStyle = null;
		
		try {
			System.out.println("Виберіть тип кузова: \n"
					+ "SEDAN, введіть: sedan \n"
					+ "WAGON, введіть: wagon \n"
					+ "TRUCK, введіть: truck \n"
					+ "VAN, введіть: van \n"
					+ "HATCHBACK, введіть: hatchback");
			
			String style = scanner.next();
			bodyStyle = BodyStyle.valueOf(style.toUpperCase());
		} catch (Exception e) {
			System.out.println("Введено недопустиме значеня типу кузова!");
		}
		return bodyStyle;
	}

	public TireType tireTypeEnter() {
		TireType tireType = null;
		System.out.println("Виберіть тип шин: \n"
				+ "WINTER, введіть: w \n"
				+ "SUMMER, введіть: s \n"
				+ "ALLSEASON, введіть: a");

		try {
			String type = scanner.next();
			tireType = TireType.valueOf(type.toUpperCase());
		} catch (Exception e) {
			System.out.println("Введіть правильний тип шин!");
		}
		return tireType;
	}
}
