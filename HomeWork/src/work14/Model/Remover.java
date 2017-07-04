package work14.Model;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import work14.Commodity;

public class Remover {
	private Scanner scanner = new Scanner(System.in);
	private String name;
	private int weight;
	private int volume;
	private boolean hasCommodity;

	public void removeFromListMenu(List<Commodity> commodities) {
		System.out.println("Виберіть варіант видалення: \n" + "Щоб видалити товар по імені, вазі, об'єму, введіть: 1 \n"
				+ "Щоб видалити товар по імені, введіть: 2 \n" + "Щоб видалити товар по вазі, введіть: 3 \n"
				+ "Щоб видалити товар по об'єму, введіть: 4");

		switch (scanner.next()) {
		case "1":
			removeByAll(commodities);
			break;
		case "2":
			removeByName(commodities);
			break;
		case "3":
			removeByWeight(commodities);
			break;
		case "4":
			removeByVolume(commodities);
			break;
		default:
			System.out.println("Неправльний вибір в меню!");
		}
	}

	private void removeByAll(List<Commodity> commodities) {
		hasCommodity = false;
		System.out.println("Введіть назву товару");
		name = scanner.next();
		System.out.println("Введіть вагу товару");
		try {
			weight = scanner.nextInt();
			System.out.println("Введіть об'єм товару");
			volume = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Введіть число!");
			scanner.next();
		}
		Commodity newCommodity = new Commodity(name, weight, volume);

		Iterator<Commodity> iterator = commodities.iterator();
		while (iterator.hasNext()) {
			Commodity tmp = iterator.next();
			if (tmp.equals(newCommodity)) {
				System.out.println("Товар " + tmp + " видалено");
				iterator.remove();
				hasCommodity = true;
			}
		}
		if (!hasCommodity) {
			System.out.println("Товару із вазаними параметрами не знайдено");
		}
	}

	private void removeByName(List<Commodity> commodities) {
		hasCommodity = false;
		System.out.println("Введіть назву товару");
		name = scanner.next();

		Iterator<Commodity> iterator = commodities.iterator();
		while (iterator.hasNext()) {
			Commodity tmp = iterator.next();
			if (tmp.getName().equals(name)) {
				System.out.println("Товар " + tmp + " видалено");
				iterator.remove();
				hasCommodity = true;
			}
		}
		if (!hasCommodity) {
			System.out.println("Товару із вазаними параметрами не знайдено");
		}
	}

	private void removeByWeight(List<Commodity> commodities) {
		hasCommodity = false;
		System.out.println("Введіть вагу товару");
		try {
			weight = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Введіть число!");
			scanner.next();
		}
		Iterator<Commodity> iterator = commodities.iterator();
		while (iterator.hasNext()) {
			Commodity tmp = iterator.next();
			if (Double.doubleToLongBits(tmp.getWeight()) != Double.doubleToLongBits(weight)) {
				System.out.println("Товар " + tmp + " видалено");
				iterator.remove();
				hasCommodity = true;
			}
		}
		if (!hasCommodity) {
			System.out.println("Товару із вазаними параметрами не знайдено");
		}
	}

	private void removeByVolume(List<Commodity> commodities) {
		hasCommodity = false;
		System.out.println("Введіть об'єм товару");
		try {
			volume = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Введіть число!");
			scanner.next();
		}

		Iterator<Commodity> iterator = commodities.iterator();
		while (iterator.hasNext()) {
			Commodity tmp = iterator.next();
			if (Double.doubleToLongBits(tmp.getVolume()) != Double.doubleToLongBits(volume)) {
				System.out.println("Товар " + tmp + " видалено");
				iterator.remove();
				hasCommodity = true;
			}
		}
		if (!hasCommodity) {
			System.out.println("Товару із вазаними параметрами не знайдено");
		}
	}
}
