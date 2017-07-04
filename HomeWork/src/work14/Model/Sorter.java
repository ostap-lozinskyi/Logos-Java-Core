package work14.Model;

import java.util.List;
import java.util.Scanner;

import work14.Commodity;
import work14.CommodityComparatorReverse;

public class Sorter {
	private Scanner scanner = new Scanner(System.in);
	private int direction;
	boolean hasSorted;

	public void sortMenu(List<Commodity> commodities) {
		hasSorted = false;
		System.out.println("Виберіть варіант сортування: \n"
				+ "Щоб сортувати товар по імені, введіть: 1 \n"
				+ "Щоб сортувати товар по вазі, введіть: 2 \n"
				+ "Щоб сортувати товар по об'єму, введіть: 3");

		switch (scanner.next()) {
		case "1":
			direction = sortDirection();
			if (direction == 1) {
				commodities.sort(null);
				hasSorted = true;
			} else if (direction == -1) {
				commodities.sort(new CommodityComparatorReverse());
				hasSorted = true;
			}
			if (!hasSorted) {
				System.out.println("Неправильний вибір сортування!");
			} else {
				for (Commodity commodity : commodities) {
					System.out.println(commodity);
				}
			}
			break;
		case "2":
			direction = sortDirection();
			if (direction == 1) {
				commodities.sort((o1, o2) -> Double.compare(o1.getWeight(), o2.getWeight()));
				hasSorted = true;
			} else if (direction == -1) {
				commodities.sort((o1, o2) -> Double.compare(o2.getWeight(), o1.getWeight()));
				hasSorted = true;
			}
			if (!hasSorted) {
				System.out.println("Неправильний вибір сортування!");
			} else {
				for (Commodity commodity : commodities) {
					System.out.println(commodity);
				}
			}
			break;
		case "3":
			direction = sortDirection();
			if (direction == 1) {
				commodities.sort((o1, o2) -> Double.compare(o1.getVolume(), o2.getVolume()));
				hasSorted = true;
			} else if (direction == -1) {
				commodities.sort((o1, o2) -> Double.compare(o2.getVolume(), o1.getVolume()));
				hasSorted = true;
			}
			if (!hasSorted) {
				System.out.println("Неправильний вибір сортування!");
			} else {
				for (Commodity commodity : commodities) {
					System.out.println(commodity);
				}
			}
			break;
		default:
			System.out.println("Неправльний вибір сортування!");
		}
	}

	private int sortDirection() {
		System.out.println("Виберіть напрямок сортування: \n"
				+ "Прямий напрямок, введіть: 1 \n"
				+ "Зворотній напрямок, введіть: 2");

		int result = 0;
		switch (scanner.next()) {
		case "1":
			result = 1;
			break;
		case "2":
			result = -1;
			break;
		default:
			System.out.println("Неправльний вибір напрямку сортування!");
		}
		return result;
	}
}
