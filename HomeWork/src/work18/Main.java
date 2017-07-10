package work18;

import work18.Collection.CheckSecond;

/* Створити інтерфейс Iterator, в якому оголосити метод hasNext(), next(). Створити  клас Collection,в якого оголосити 
 * як поле масив типу Object. Створити  конструктор з визначеними параметрами куди передати даний масив.
 * Створити два внутрішніх класи, які імплементуватимуть інтерфейс Iterator. Перевизначити методи так щоб: 
 * Перший клас виводив значення масиву від першого до останнього. Зробити заміну непарних елементів на 
 * нуль і вивести на екран даний масив. 
 * Другий клас виводив від останнього до першого значення через одну цифру. 
 * Створити анонімний клас який повинен: 
 * Прогнати від останнього до першого елементу масиву. Перевірити кожен третій елемент масиву від останнього чи він непарний,
 * якщо так то вивести дані елементи на консоль.
 * Створити Локальний клас який повинен: 
 * Пройтись від першого до останнього елементу масиву, перевірити кожен п’ятий елемент масиву, якщо він парний то відняти 
 * від нього число 100, і вивести на консоль ці числа. 
 * Створити статичний клас який повинен: 
 * Пройтись від першого до останнього елемента масиву. Перевірити кожен другий елемент масив на парність, якщо він парний,
 * тоді зробити з нього непарний і вивести дані елементи на консоль. 
*/

public class Main {
	public void start() {
		Object[] objects = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		Collection collection = new Collection(objects);
		System.out.println("Вхідний масив:");
		collection.print(objects);
		System.out.println();

		System.out.println("Вивід значення масиву від першого до останнього. Заміна непарних елементів на нуль:");
		Collection.FirstEnd firstEnd = collection.new FirstEnd();
		collection.print(firstEnd.next());
		System.out.println();

		System.out.println("Вивід від останнього до першого значення через одну цифру:");
		Collection.EndFirst endFirst = collection.new EndFirst();
		collection.print(endFirst.next());
		System.out.println();

		System.out.println("Вивід від останнього до першого елементу масиву кожен третій елемент, якщо він непарний");
		System.out.println(collection.checkThird(objects).next());
		System.out.println();

		System.out.println(
				"Вивід від першого до останнього елементу масиву кожен п’ятий елемент, якщо він парний, і відняти від нього число 100");
		System.out.println(collection.checkFifth(objects));
		System.out.println();

		System.out.println(
				"Вивід від першого до останнього елемента масиву кожен другий елемент, якщо він парний - зробити непарним:");
		CheckSecond checkSecond = new CheckSecond();
		collection.print(checkSecond.next());
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}
