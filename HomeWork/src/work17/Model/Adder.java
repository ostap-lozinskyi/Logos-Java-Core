package work17.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import work17.Gender;
import work17.Person;
import work17.Pet;

public class Adder {
	private EnterParameters enterParameters = new EnterParameters();

	public void addPerson(Map<Person, List<Pet>> map) {
		String name = enterParameters.nameEnter().toUpperCase();
		int age = enterParameters.personAgeEnter();
		if (age == 0) {
			return;
		}
		Gender gender = enterParameters.personGenderEnter();
		if (gender == null) {
			return;
		}
		Person person = new Person(name, age, gender);
		if (!map.containsKey(person)) {
			map.put(person, new ArrayList<Pet>());
			System.out.println("Учасника клубу " + person + " додано");
		} else {
			System.out.println("Такий учасник клубу вже існує!");
		}
	}

	public void addPet(Map<Person, List<Pet>> map) {
		boolean hasPerson = false;
		System.out.println("Введіть учасника клубу");
		String personName = enterParameters.nameEnter().toUpperCase();
		System.out.println("Введіть назву тваринки");
		String petName = enterParameters.nameEnter().toLowerCase();
		Pet pet = new Pet(petName);

		Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
		for (Entry<Person, List<Pet>> entry : entrySet) {
			if (entry.getKey().getName().equals(personName)) {
				hasPerson = true;
				List<Pet> pets = entry.getValue();
				pets.add(pet);
				map.put(entry.getKey(), pets);
				System.out.println("Тваринку " + pet + " додано");
			}
		}
		if (!hasPerson) {
			System.out.println("Відсутній учасник клубу з таким іменем!");
		}
	}
}
