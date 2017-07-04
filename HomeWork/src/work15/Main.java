package work15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import work15.Model.Remover;
import work15.Model.Adder;

/* Створити клас Зооклуб, як поля прописати в ньому List, map, Set, iterator, 
 * Map<Person, List<Pet>> map;
 * Провести ініціалізацію даних полів в конструкторі класу Зооклуб.
 * map = new HashMap<>();
 * Реалізувати консольне меню, таким чином щоб можна було:
 * Додати учасника клубу;
 * Додати тваринку до учасника клубу;
 * Видалити тваринку з учасника клубу;
 * Видалити учасника клубу;
 * Видалити конкретну тваринку зі всіх власників;
 * Вивести на екран зооклуб;
 * Вийти з програми;
 * Використати для побудови меню Switch. 
 */

public class Main {
	private Scanner scanner = new Scanner(System.in);
	private ZooClub zooClub = new ZooClub();
	private Adder adder = new Adder();
	private Remover remover = new Remover();
	private List<Pet> pets = new ArrayList<>();

	private void addTestZooClub() {
		pets.add(new Pet("dog"));
		pets.add(new Pet("cat"));
		zooClub.getMap().put(new Person("X", 54, Gender.FEMALE), pets);
	}

	private void printZooClub(ZooClub zooClub) {
		Set<Entry<Person, List<Pet>>> entrySet = zooClub.getMap().entrySet();
		for (Entry<Person, List<Pet>> entry : entrySet) {
			if (entry.getValue() == null) {
				System.out.println(entry.getKey());
			} else {
				System.out.println(entry);
			}
		}
		if (zooClub.getMap().size() == 0) {
			System.out.println("Клуб пустий");
		}
	}

	private void start() {
		boolean isRun = true;
		addTestZooClub();

		while (isRun) {
			System.out.println("Головне меню \n" 
					+ "Щоб додати учасника клубу, введіть: 1 \n"
					+ "Щоб додати тваринку до учасника клубу, введіть: 2 \n"
					+ "Щоб видалити тваринку з учасника клубу, введіть: 3 \n"
					+ "Щоб видалити учасника клубу, введіть: 4 \n"
					+ "Щоб видалити конкретну тваринку зі всіх власників, введіть: 5 \n"
					+ "Щоб вивести на екран зооклуб, введіть: 6 \n" 
					+ "Щоб ввийти з програми, введіть 0");

			switch (scanner.next()) {
			case "1":
				adder.addPerson(zooClub.getMap());
				break;
			case "2":
				adder.addPet(zooClub.getMap());
				break;
			case "3":
				remover.removePet(zooClub.getMap());
				break;
			case "4":
				remover.removePersonByName(zooClub.getMap());
				break;
			case "5":
				remover.removePetFromAll(zooClub.getMap());
				break;
			case "6":
				printZooClub(zooClub);
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
