package work14;

import java.util.ArrayList;
import java.util.List;
/* Реалізовуємо програму з консольним меню. Використати Scanner. Створити клас Commodity.Описати даний клас 
 * трьома - чотирма полями. Створити функціональний клас, в якому описати наступні методи для роботи з лістом об'єктів: 
 * 1. Додати товар в ліст. 
 * 2. Видалити товар з ліста (вказати або всі необіхідні параметри, або по якомусь критерію). 
 * 3. Замінити товар в лісті. 
 * 4. Посортувати по всьому (при натисканні повинне випасти меню, яке запропонує по якому полю посортувати. 
 *    Після вибору поля обрати напрям сортування). Створити усі необхідні компаратори. 
 * 0. Вихід з програми. * 
 */
import java.util.Scanner;

import work14.Model.*;

public class Main {
	private Scanner scanner = new Scanner(System.in);
	private List<Commodity> commodities = new ArrayList<>();
	private Sorter sorter = new Sorter();
	private Adder adder = new Adder();
	private Remover remover = new Remover();
	private Replacer replacer = new Replacer();

	private void addTestCommodity() {
		commodities.add(new Commodity("bread", 1, 4));
		commodities.add(new Commodity("milk", 2, 2));
		commodities.add(new Commodity("butter", 3, 3));
	}

	private void start() {
		boolean isRun = true;

		addTestCommodity();
		while (isRun) {
			System.out.println("Головне меню \n"
					+ "Щоб додати товар, введіть: 1 \n"
					+ "Щоб видалити товар, введіть: 2 \n"
					+ "Щоб замінити товар, введіть: 3 \n"
					+ "Щоб сортувати товар, введіть: 4 \n"
					+ "Щоб показати список товарів, введіть 5 \n"
					+ "Щоб ввийти з програми, введіть 0");

			switch (scanner.next()) {
			case "1":
				adder.addToList(commodities);
				break;
			case "2":
				remover.removeFromListMenu(commodities);
				break;
			case "3":
				replacer.replaceByName(commodities);
				break;
			case "4":
				sorter.sortMenu(commodities);
				break;
			case "5":
				for (Commodity commodity : commodities) {
					System.out.println(commodity);
				}
				if (commodities.size() == 0) {
					System.out.println("Товари відсутні");
				}
				break;
			case "0":
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
