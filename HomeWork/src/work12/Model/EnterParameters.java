package work12.Model;

import java.util.Scanner;

import work12.Properties.*;

public class EnterParameters {
	private Scanner scanner = new Scanner(System.in);
	private WheelDiameter wheelDiameter;
	private HelmDiameter helmDiameter;
	private Color color;
	private BodyStyle bodyStyle;

	public WheelDiameter diameterWheelEnter() {
		System.out.println("Виберіть діаметр колеса:");
		System.out.println("R13, введіть: 13");
		System.out.println("R14, введіть: 14");
		System.out.println("R15, введіть: 15");
		System.out.println("R16, введіть: 16");
		System.out.println("R17, введіть: 17");
		System.out.println("R18, введіть: 18");
		System.out.println("R19, введіть: 19");
		System.out.println("R20, введіть: 20");

		try {
			switch (scanner.nextInt()) {
			case 13:
				wheelDiameter = WheelDiameter.R13;
				break;
			case 14:
				wheelDiameter = WheelDiameter.R14;
				break;
			case 15:
				wheelDiameter = WheelDiameter.R15;
				break;
			case 16:
				wheelDiameter = WheelDiameter.R16;
				break;
			case 17:
				wheelDiameter = WheelDiameter.R17;
				break;
			case 18:
				wheelDiameter = WheelDiameter.R18;
				break;
			case 19:
				wheelDiameter = WheelDiameter.R19;
				break;
			case 20:
				wheelDiameter = WheelDiameter.R20;
				break;
			default:
				System.out.println("Введіть значення в діапазоні 13-20!");
			}
		} catch (Exception e) {
			System.err.println("Введено недопустиме значеня, введіть значення в діапазоні 13-20!");
		}
		return wheelDiameter;
	}

	public Color colorEnter() {
		System.out.println("Виберіть колір кузова:");
		System.out.println("red, введіть: red");
		System.out.println("green, введіть: green");
		System.out.println("blue, введіть: blue");
		System.out.println("white, введіть: white");
		System.out.println("black, введіть: black");
		System.out.println("grey, введіть: grey");

		switch (scanner.next().toLowerCase()) {
		case "red":
			color = Color.RED;
			break;
		case "green":
			color = Color.GREEN;
			break;
		case "blue":
			color = Color.BLUE;
			break;
		case "white":
			color = Color.WHITE;
			break;
		case "black":
			color = Color.BLACK;
			break;
		case "grey":
			color = Color.GRAY;
			break;
		default:
			System.err.println("Введено недопустиме значеня кольору!");
		}
		return color;
	}

	public BodyStyle bodyStyleEnter() {
		System.out.println("Виберіть тип кузова:");
		System.out.println("SEDAN, введіть: sedan");
		System.out.println("WAGON, введіть: wagon");
		System.out.println("TRUCK, введіть: truck");
		System.out.println("VAN, введіть: van");
		System.out.println("HATCHBACK, введіть: hatchback");

		switch (scanner.next().toLowerCase()) {
		case "sedan":
			bodyStyle = BodyStyle.SEDAN;
			break;
		case "wagon":
			bodyStyle = BodyStyle.WAGON;
			break;
		case "truck":
			bodyStyle = BodyStyle.TRUCK;
			break;
		case "van":
			bodyStyle = BodyStyle.VAN;
			break;
		case "hatchback":
			bodyStyle = BodyStyle.HATCHBACK;
			break;
		default:
			System.err.println("Введено недопустиме значеня типу кузова!");
		}
		return bodyStyle;
	}

	public HelmDiameter diameterHelmEnter() {
		System.out.println("Виберіть діаметр керма:");
		System.out.println("S, введіть: s");
		System.out.println("M, введіть: m");
		System.out.println("L, введіть: l");
		System.out.println("XL, введіть: xl");
		System.out.println("XXL, введіть: xxl");
		System.out.println("XXXL, введіть: xxxl");

		switch (scanner.next()) {
		case "s":
			helmDiameter = HelmDiameter.S;
			break;
		case "m":
			helmDiameter = HelmDiameter.M;
			break;
		case "l":
			helmDiameter = HelmDiameter.L;
			break;
		case "xl":
			helmDiameter = HelmDiameter.XL;
			break;
		case "xxl":
			helmDiameter = HelmDiameter.XXL;
			break;
		case "xxxl":
			helmDiameter = HelmDiameter.XXXL;
			break;
		default:
			System.out.println("Введіть значення в діапазоні S-XXXL!");
		}

		return helmDiameter;
	}
}
