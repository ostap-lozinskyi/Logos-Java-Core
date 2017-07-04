package work12;

/* Виконати наступні завдання використовуючи введення з клавіатури та при потребі ітератор чи лістітератор: 
 * 1) Знайти машини, які використовують введений тип кузова. 
 * 2) Видалити з ліста усі машини, які мають введений колір кузова. 
 * 3) Замінити усім машинам, діаметр коліс яких лежить у введеному діапазоні шини на зимові. 
 * 4) Видалити усі машини, які мають введений тип кузова та введений діапазон діаметра керма. 
 * 5) Запам'ятати індекси машин, які мають введений тип кузова. 
 */

import work12.Car.*;
import work12.Model.*;

import java.util.*;

public class Main {
	private List<Car> cars = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private CarCreator carCreator = new CarCreator();
	private Searcher searcher = new Searcher();
	private Replacer replacer = new Replacer();
	private Remover remover = new Remover();
	private Holder holder = new Holder();

	private void setCars() {
		for (int i = 0; i < 11; i++) {
			cars.add(carCreator.createCar());
		}
	}

	private void start() {
		setCars();
		boolean isRun = true;

		while (isRun) {
			System.out.println("Головне меню");
			System.out.println("Щоб знайти машини, які використовують введений тип кузова, введіть: 1");
			System.out.println("Щоб видалити з ліста усі машини, які мають введений колір кузова, введіть: 2");
			System.out.println(
					"Щоб замінити усім машинам, діаметр коліс яких лежить у введеному діапазоні шини на зимові, введіть: 3");
			System.out.println(
					"Щоб видалити усі машини, які мають введений тип кузова та введений діапазон діаметра керма введіть: 4");
			System.out.println("Щоб запам'ятати індекси машин, які мають введений тип кузова, введіть 5");
			System.out.println("Щоб вивести список машин, введіть 6");

			switch (scanner.next()) {
			case "1":
				searcher.searchBodyType(cars);
				break;
			case "2":
				remover.removeColor(cars);
				break;
			case "3":
				replacer.replaceTireType(cars);
				break;
			case "4":
				remover.removeBodyStyleAndHelmDiameter(cars);
				break;
			case "5":
				holder.holdBodyStyle(cars);
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
