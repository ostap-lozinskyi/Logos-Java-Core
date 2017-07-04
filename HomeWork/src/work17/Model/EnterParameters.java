package work17.Model;

import java.util.Scanner;

import work17.Gender;

public class EnterParameters {
	private Scanner scanner = new Scanner(System.in);

	public String nameEnter() {
		System.out.println("Введіть ім'я:");
		String name = scanner.next();
		return name;
	}

	public int personAgeEnter() {
		int age = 0;
		try {
			System.out.println("Введіть вік учасника клубу:");
			int enteredAge = scanner.nextInt();
			if ((enteredAge > 18) && (enteredAge < 150)) {
				age = enteredAge;
			} else {
				System.out.println("Введіть вік від 18 до 150!");
			}
		} catch (Exception e) {
			System.out.println("Введено неправильний вік!");
			scanner.next();
		}
		return age;
	}
	
	public Gender personGenderEnter() {
		Gender gender=null;
		System.out.println("Введіть стать учасника клубу: \n"
				+ "Чоловіча, введіть: M \n"
				+ "Жіноча, введіть: F");
		switch (scanner.next().toUpperCase()) {
		case "M":
			gender = Gender.MALE;
			break;
		case "F":
			gender = Gender.FEMALE;
			break;
		default:
			System.out.println("Неправильно введена стать!");
			break;
		}

		return gender;
	}

}
