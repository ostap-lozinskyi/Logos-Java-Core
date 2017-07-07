package work19;

/*Створити клас MyEntry<K,V>. Описати в ньому дженеріками –поля, гетери/сетери, toString. 
 * Створити клас MyMap<K,V>, в якому буде поле  Set<MyEntry<K,V>>. Реалізвати в даному класі методи, які б:
 * додавали новий об’єкт в мапу 
 * видаляли об’єкт мапи за ключем(тобто немає ні ключа ні значення) 
 * видаляли об’єкт мапи за значенням(значенню об’єкта присвоюється нульова сcилка, при цьому зберігається ключ) 
 * виводили на екран Set ключів 
 * Виводили на екран List значень 
 * Виводили на екран цілу мапу 
 */

public class Main {

	public static void main(String[] args) {
		MyMap<Integer, String> myMap = new MyMap<>();
		myMap.addToMap(1, "first");
		myMap.addToMap(2, "second");
		myMap.addToMap(3, "third");
		myMap.removeByKey(1);
		myMap.removeByValue("second");
		myMap.printKeySet();
		myMap.printValueList();
		myMap.printMyMap();
	}

}
