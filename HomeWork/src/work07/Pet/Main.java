package work07.Pet;

/* Написати абстрактний клас Pet, в якому описати абстрактний метод voice(). Створити класи Cow, Cat, Dog , 
 * які наслідуються від Pet. Перевизначити в них метод voice(), так, щоб викликаючи його в методі main, 
 * на консоль виводилось: “Я кіт- Мяууу-Мяууу”, “Я пес- Гаууу-Гаууу”, “Я корова- Мууу-Мууу”. 
 */
public class Main {

	public static void main(String[] args) {
		new Cow().voice();
		new Cat().voice();
		new Dog().voice();
	}

}
