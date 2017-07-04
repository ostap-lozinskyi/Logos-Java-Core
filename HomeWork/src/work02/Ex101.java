/*
 * Створіть масив з 11 випадкових цілих чисел з відрізка [-1; 1], виведіть масив на екран у 
 * рядок. Визначте який елемент зустрічається в масиві найчастіше і виведіть про це повідомлення на екран. Якщо два 
 * якихось елемента зустрічаються однакову кількість разів, то не виводьте нічого.
 */
package work02;

import java.util.*;
import java.util.Map.Entry;

public class Ex101 {

	public static void main(String[] args) {
		int[] array = new int[11];
		Random rand = new Random();
		int countArrayMax = 0;
		int maxValueMap = 0;
		int getKey = 0;
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(3) - 1;
			if (countMap.containsKey(array[i])) {
				int j = countMap.get(array[i]);
				countMap.put(array[i], ++j);
			} else {
				countMap.put(array[i], 1);
			}

		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// System.out.println(countMap);
		maxValueMap = Collections.max(countMap.values());
		for (Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == maxValueMap) {
				getKey = entry.getKey();
				countArrayMax++;
			}
		}
		if (countArrayMax < 2) {
			System.out.println(getKey + " зустрічається найчастіше");
		}
	}

}
