package work17.Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import work17.Person;
import work17.Gender;
import work17.Pet;
import work17.ZooClub;

public class Serializator {
	public void serialize(ZooClub zooClub) {
		try (FileWriter writer = new FileWriter("save.txt", true)) {
			Map<Person, List<Pet>> map = zooClub.getMap();
			Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
			for (Entry<Person, List<Pet>> entry : entrySet) {
				writer.append(entry.getKey().getName() + " " + entry.getKey().getAge() + " "
						+ entry.getKey().getGender() + " " + petsString(entry.getValue()) + "\n");
			}
			System.out.println("Клуб дописано");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String petsString(List<Pet> pets) {
		String petStr = "";
		for (Pet pet : pets) {
			petStr += pet.getName() + " ";
		}
		return petStr;
	}

	public void serializeOverride(ZooClub zooClub) {
		try (FileWriter writer = new FileWriter("save.txt")) {
			Map<Person, List<Pet>> map = zooClub.getMap();
			Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
			for (Entry<Person, List<Pet>> entry : entrySet) {
				writer.append(entry.getKey().getName() + " " + entry.getKey().getAge() + " "
						+ entry.getKey().getGender() + " " + petsString(entry.getValue()) + "\n");
			}
			System.out.println("Клуб перезаписано");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<ZooClub> readFromFile() {
		List<ZooClub> zooClubs = new ArrayList<>();
		ZooClub zooClub = null;
		try (Scanner sc = new Scanner(new File("save.txt"))) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.isEmpty()) {
					String[] array = line.split(" ");
					Map<Person, List<Pet>> map = new HashMap<>();
					List<Pet> pets = new ArrayList<>();
					for (int i = 3; i < array.length; i++) {
						pets.add(new Pet(array[i]));
					}
					map.put(new Person(array[0], Integer.valueOf(array[1]), Gender.valueOf(array[2])), pets);
					zooClub = new ZooClub(map);
					zooClubs.add(zooClub);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return zooClubs;
	}
}
