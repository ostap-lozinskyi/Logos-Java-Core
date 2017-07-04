package work11;

/* Створити List Машин (тих самих, що були в домашньому  по композиції). Додати 5-10 елементів в ліст. 
 * Виконати наступні завдання використовуючи введення з клавіатури: 
 * 1) Знайти машини, які мають введений діаметр коліс. 
 * 2) Знайти машини, які мають введений діаметр коліс та колір кузова. 
 * 3) Замінити в усіх машинах, які мають червоний колір кузова, кермо на інше. 
 * 4) Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки. 
 * 5) Замінити усі машини, які мають колеса діаметром менші за введене значення, на інші машини. 
 * Кожне окреме завдання повинне бути реалізоване в ОКРЕМОМУ методі. 
 * Класи Кермо, Колесо та Кузов повинні мати відповідні поля, щоб задовільняти описані вище завдання
 */

import work11.enumPack.*;
import java.util.*;

public class Main {
	private List<Car> cars = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private Random random = new Random();
	private Boolean hasCar = false;
	private Diameter diameter;
	Color color;

	private Car createCar() {
		Model[] models = Model.values();
		Covering[] coverings = Covering.values();
		SteeringWheelButtons[] steeringWheelButtons = SteeringWheelButtons.values();
		Diameter[] diameters = Diameter.values();
		Color[] colors = Color.values();
		return new Car(models[random.nextInt(models.length)],
				new SteeringWheel(coverings[random.nextInt(coverings.length)],
						steeringWheelButtons[random.nextInt(steeringWheelButtons.length)]),
				new Wheel(diameters[random.nextInt(diameters.length)]),
				new CarBody(colors[random.nextInt(colors.length)]));
	}

	private void setCars() {
		for (int i = 0; i < 11; i++) {
			cars.add(createCar());
		}
	}

	private Diameter diameterEnter() {
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
				diameter = Diameter.R13;
				break;
			case 14:
				diameter = Diameter.R14;
				break;
			case 15:
				diameter = Diameter.R15;
				break;
			case 16:
				diameter = Diameter.R16;
				break;
			case 17:
				diameter = Diameter.R17;
				break;
			case 18:
				diameter = Diameter.R18;
				break;
			case 19:
				diameter = Diameter.R19;
				break;
			case 20:
				diameter = Diameter.R20;
				break;
			default:
				System.out.println("Введіть значення в діапазоні 13-20!");
			}
		} catch (Exception e) {
			System.err.println("Введено недопустиме значеня, введіть значення в діапазоні 13-20!");
		}
		return diameter;
	}

	private void searchWheelDiameter() {
		hasCar = false;
		diameter = diameterEnter();

		for (Car car : cars) {
			if (car.getWheel().getDiameter().equals(diameter)) {
				hasCar = true;
				System.out.println(car);
			}
		}

		if (!hasCar) {
			System.out.println("Відсутні автомобілі з вказаним діаметром колеса");
		}
	}

	private Color searchColor() {
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

	private void searchWheelDiameterAndColor() {
		Diameter diameter = diameterEnter();
		color = searchColor();
		Boolean hasCar = false;

		for (Car car : cars) {
			if (car.getWheel().getDiameter().equals(diameter) && (car.getCarBody().getColor().equals(color))) {
				hasCar = true;
				System.out.println(car);
			}
		}
		if (!hasCar) {
			System.out.println("Відсутні автомобілі з вказаним діаметром колеса та кольором");
		}
	}

	private void replaceSteeringWheel() {
		for (Car car : cars) {
			if (car.getCarBody().getColor().equals(Color.RED)) {
				if (car.getSteeringWheel().getCovering().equals(Covering.CLOTH)) {
					car.getSteeringWheel().setCovering(Covering.LEATHER);
				} else {
					car.getSteeringWheel().setCovering(Covering.CLOTH);
				}
				System.out.println(car.toString() + " кермо замінено");
			}
		}
	}

	private void replaceDiameter() {
		Diameter[] diameters = Diameter.values();
		for (Car car : cars) {
			if (car.getSteeringWheel().getSteeringWheelButtons().equals(SteeringWheelButtons.WITHBUTTONS)) {
				int ord = car.getWheel().getDiameter().ordinal();
				try {
					car.setWheel(new Wheel(diameters[ord + 2]));
					System.out.println(car.toString() + " діаметр колеса збільшено");
				} catch (Exception e) {
					System.err.println("Максимальний розмір колеса, збільшити діаметр неможливо");
				}
			}
		}
	}

	private void replaceCar() {
		diameter = diameterEnter();
		hasCar = false;
		try {
			for (int i = 0; i < cars.size(); i++) {
				if (cars.get(i).getWheel().getDiameter().ordinal() < diameter.ordinal()) {
					System.out.println("машину " + cars.get(i) + "замінено");
					cars.set(i, createCar());
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

	private void start() {
		setCars();
		boolean isRun = true;

		while (isRun) {
			System.out.println("Головне меню");
			System.out.println("Щоб знайти машини, які мають введений діаметр коліс, введіть: 1");
			System.out.println("Щоб знайти машини, які мають введений діаметр коліс та колір кузова, введіть: 2");
			System.out
					.println("Щоб замінити в усіх машинах, які мають червоний колір кузова, кермо на інше, введіть: 3");
			System.out.println("Щоб збільшити діаметр коліс вдвічі, якщо кермо має кнопочки введіть: 4");
			System.out.println(
					"Щоб замінити усі машини, які мають колеса діаметром менші за введене значення, на інші машини, введіть 5");
			System.out.println("Щоб вивести список машин, введіть 6");

			switch (scanner.next()) {
			case "1":
				searchWheelDiameter();
				break;
			case "2":
				searchWheelDiameterAndColor();
				break;
			case "3":
				replaceSteeringWheel();
				break;
			case "4":
				replaceDiameter();
				break;
			case "5":
				replaceCar();
				break;
			case "6":
				for (Car car : cars) {
					System.out.println(car);
				}
				break;
			case "stop":
				isRun = false;
				break;
			default:
				System.out.println("Неправльний вибір в меню!");
			}
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}
