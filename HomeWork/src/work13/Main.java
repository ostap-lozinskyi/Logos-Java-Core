package work13;

/* Кожному класу (Кузов, Кермо, Колесо та Машина) написати методи equals та hashCode. Створити LinkedHashSet Машин.
 * Написати методи, які будуть робити наступне: 
 * 1. Машинам, які мають вказаний колір кузова та вказаний діаметр колеса, змінити тип шин на вказаний. 
 * 2. Видалити машини, діаметр колес яких попадає у вказаний діапазон. 
 * 3. Знайти машини, які мають вказаний тип шин та діаметр коліс яких попадає у вказаний діапазон.
 */

import work13.Car.*;
import work13.Model.*;

import java.util.*;

public class Main {
	public static final int CARS_NUMBER=10;
	
	private Set<Car> cars = new LinkedHashSet<>();
	private Scanner scanner = new Scanner(System.in);
	private CarCreator carCreator = new CarCreator();
	private Searcher searcher = new Searcher();
	private Replacer replacer = new Replacer();
	private Remover remover = new Remover();	

	private void setCars() {
		boolean hasCar = false;
		int count = 0;
		while (count < CARS_NUMBER) {
			Car createdCar = carCreator.createCar();
			for (Car car : cars) {
				if (car.equals(createdCar)) {
					hasCar = true;
				}
			}
			if (!hasCar) {
				cars.add(createdCar);
				count++;
			}
		}
	}

	private void start() {
		setCars();
		boolean isRun = true;

		while (isRun) {
			System.out.println("Головне меню \n"
					+ "Щоб змінити тип шин на вказаний машинам, які мають вказаний колір кузова та вказаний діаметр колеса, введіть: 1 \n"
					+ "Щоб видалити машини, діаметр колес яких попадає у вказаний діапазон, введіть: 2 \n"
					+ "Щоб знайти машини, які мають вказаний тип шин та діаметр коліс яких попадає у вказаний діапазон, введіть: 3 \n"
					+ "Щоб вивести список машин, введіть 4");

			switch (scanner.next()) {
			case "1":
				replacer.replaceBodyStyleAndWheelDiameter(cars);
				break;
			case "2":
				remover.removeWheelDiameterRange(cars);
				break;
			case "3":
				searcher.searchTireTypeAndWheelDiameterRange(cars);
				break;
			case "4":
				if (cars.size() == 0) {
					System.out.println("Список машин пустий!");
				} else {
					for (Car car : cars) {
						System.out.println(car);
					}
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
