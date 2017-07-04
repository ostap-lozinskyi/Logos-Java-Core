package work14.Model;

import java.util.List;
import java.util.Scanner;

import work14.Commodity;

public class Adder {
	private Scanner scanner = new Scanner(System.in);
	private String name;
	private int weight;
	private int volume;

	public void addToList(List<Commodity> commodities) {
		try {
			System.out.println("Введіть назву товару");
			name = scanner.next();
			System.out.println("Введіть вагу товару");
			weight = scanner.nextInt();
			System.out.println("Введіть об'єм нового товару");
			volume = scanner.nextInt();
			Commodity newCommodity = new Commodity(name, weight, volume);
			boolean hasCommodity = false;
			for (Commodity commodity : commodities) {
				if (commodity.equals(newCommodity)) {
					hasCommodity = true;
					System.out.println("Такий товар вже існує!");
				}
			}
			if (!hasCommodity) {
				commodities.add(newCommodity);
				System.out.println("Товар " + newCommodity + " додано!");
			}
		} catch (Exception e) {
			System.out.println("Введіть число!, товар не додано!");
			scanner.next();
		}
	}
}
