package work17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import work17.Model.Remover;
import work17.Model.Serializator;
import work17.Model.Adder;

/* Додати до Зооклубу наступні методи: 
 * Дописати в блокнот 
 * Перезаписати в блокнот 
 * Зчитати з блокноту на консоль 
 * Провести серіалізацію та десеріалізацію. 
 */

public class Main {
	private Scanner scanner = new Scanner(System.in);
	private ZooClub zooClub = new ZooClub();
	private Adder adder = new Adder();
	private Remover remover = new Remover();
	private Serializator serializator = new Serializator();
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
					+ "Щоб дописати в блокнот, введіть: 7 \n"
					+ "Щоб перезаписати в блокнот, введіть: 8 \n"
					+ "Щоб зчитати з блокноту на консоль, введіть: 9 \n" 
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
			case "7":
				serializator.serialize(zooClub);
				break;
			case "8":
				serializator.serializeOverride(zooClub);
				break;
			case "9":
				printZooClub(serializator.readFromFile());
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
