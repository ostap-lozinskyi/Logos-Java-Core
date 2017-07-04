package work14.Model;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import work14.Commodity;

public class Replacer {
	private Scanner scanner = new Scanner(System.in);
	private String name;
	private String name2;
	private int weight;
	private int volume;
	private boolean hasCommodity;

	public void replaceByName(List<Commodity> commodities) {
		hasCommodity = false;
		System.out.println("Введіть назву товару, який хочете видалити");
		name = scanner.next();
		System.out.println("Введіть назву товару, який хочете додати");
		name2 = scanner.next();
		System.out.println("Введіть вагу нового товару");

		try {
			weight = scanner.nextInt();
			System.out.println("Введіть об'єм нового товару");
			volume = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Введіть число!");
			scanner.next();
		}

		Commodity commodity = new Commodity(name2, weight, volume);
		ListIterator<Commodity> listIterator = commodities.listIterator();
		while (listIterator.hasNext()) {
			Commodity tmp = listIterator.next();
			if (tmp.getName().equals(name)) {
				System.out.println("Товар " + tmp + " замінено на:");
				listIterator.set(commodity);
				System.out.println("Товар " + commodity);
				hasCommodity = true;
			}
		}
		System.out.println();
		if (!hasCommodity) {
			System.out.println("Товару із вказаними параметрами не знайдено");
		}
	}
}
