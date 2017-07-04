package work15.Model;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import work15.Person;
import work15.Pet;

public class Remover {
	EnterParameters enterParameters = new EnterParameters();

	public void removePersonByName(Map<Person, List<Pet>> map) {
		boolean hasPerson = false;
		String name = enterParameters.nameEnter().toUpperCase();

		Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
		for (Entry<Person, List<Pet>> entry : entrySet) {
			if (entry.getKey().getName().equals(name)) {
				hasPerson = true;
				System.out.println("Учасника клубу " + entry.getKey() + " видалено");
				map.remove(entry.getKey());
			}
		}
		if (!hasPerson) {
			System.out.println("Відсутній учасник клубу з таким іменем!");
		}
	}

	public void removePet(Map<Person, List<Pet>> map) {
		boolean hasPerson = false;
		boolean hasPet = false;
		System.out.println("Введіть учасника клубу");
		String personName = enterParameters.nameEnter().toUpperCase();
		System.out.println("Введіть назву тваринки");
		String petName = enterParameters.nameEnter().toLowerCase();

		Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
		for (Entry<Person, List<Pet>> entry : entrySet) {
			if (entry.getKey().getName().equals(personName)) {
				hasPerson = true;
				List<Pet> pets = entry.getValue();
				Iterator<Pet> iterator = pets.iterator();
				while (iterator.hasNext()) {
					Pet tmp = iterator.next();
					if (tmp.getName().equals(petName)) {
						hasPet = true;
						iterator.remove();
						System.out.println("Тваринку " + tmp + " видалено");
					}
				}
			}
		}
		if (!hasPerson) {
			System.out.println("Відсутній учасник клубу з таким іменем!");
		}
		if (!hasPet) {
			System.out.println("Відсутня тваринка з таким іменем у даного учасника клубу!");
		}
	}

	public void removePetFromAll(Map<Person, List<Pet>> map) {
		boolean hasPet = false;
		System.out.println("Введіть назву тваринки");
		String petName = enterParameters.nameEnter().toLowerCase();

		Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
		for (Entry<Person, List<Pet>> entry : entrySet) {
			List<Pet> pets = entry.getValue();
			Iterator<Pet> iterator = pets.iterator();
			while (iterator.hasNext()) {
				Pet tmp = iterator.next();
				if (tmp.getName().equals(petName)) {
					hasPet = true;
					iterator.remove();
					System.out.println("Тваринку " + tmp + " з учасника " + entry.getKey() + " видалено");
				}
			}
		}
		if (!hasPet) {
			System.out.println("Відсутня тваринка з таким іменем в учасників клубу!");
		}
	}
}
