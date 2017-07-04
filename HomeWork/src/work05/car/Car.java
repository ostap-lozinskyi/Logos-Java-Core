package work05.car;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Car {
	String color;
	String model;
	double fuelConsumption;
	double amountOfFuel;
	int distance;
	int canRide;
	int carMileage;
	boolean isWorking = true;
	Scanner scanner = new Scanner(System.in);

	Car(String color, String model, int fuelConsumption) {
		this.color = color;
		this.model = model;
		this.fuelConsumption = fuelConsumption;
		input();
	}

	void input() {		
		System.out.println("Введіть об'єм пального, л: ");
		amountOfFuel = scanner.nextInt();
		while (isWorking) {
			System.out.println("Введіть відстань, км: ");
			distance = scanner.nextInt();
			drive(distance);
			System.out.println("Вивесті інформацію про автомобіль? (y-так, n-ні)");
			if (scanner.next().equals("y")) {
				distance();
			}
			System.out.println("Запланувати ще одну поїздку? (y-так, n-ні)");
			if (scanner.next().equals("n")) {
				isWorking = false;
			}
		}
		System.exit(0);

	}

	void drive(int km) {
		if (amountOfFuel / (fuelConsumption / 100) > distance) {
			carMileage += distance;
			amountOfFuel -= (distance * (fuelConsumption / 100));
			System.out.println("Машина проїхала " + distance + " км");
			String formattedDouble = new DecimalFormat("#0.00").format(amountOfFuel);
			System.out.println("Залишок пального: " + formattedDouble + " л");
			System.out.println("Загальний побіг " + carMileage + " км");
		} else {
			canRide = (int) Math.round(amountOfFuel / (fuelConsumption / 100));
			carMileage += canRide;
			System.out.println("Машина змогла проїхати " + canRide + " км");
			amountOfFuel = 0;
			System.out.println("Залишок пального: 0 л");
			System.out.println("Загальний побіг " + carMileage + " км");
		}
		if (amountOfFuel == 0) {			
			System.out.println("Нема пального!");
			System.out.println("Заправити автомобіль? (y-так, n-ні)");
			if (scanner.next().equals("y")) {
				System.out.println("Введіть кількість пального");
				int x = scanner.nextInt();
				reFuel(x);
			}
		}
	}

	void reFuel(int fuelVolume) {
		amountOfFuel += fuelVolume;
		System.out.println("Автомобіль заправлено!");
		System.out.println("Залишок пального " + amountOfFuel + " л");
	}

	void distance() {
		System.out.println("Колір авто " + color);
		System.out.println("Модель авто " + model);
		System.out.println("Розхід пального " + fuelConsumption + " на 100 км");
		System.out.println("Пробіг " + carMileage + " км");
		String formattedDouble = new DecimalFormat("#0.00").format(amountOfFuel);
		System.out.println("Залишок пального: " + formattedDouble + " л");
	}

}
