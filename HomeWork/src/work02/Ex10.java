/*
 * Створіть масив з 11 випадкових цілих чисел з відрізка [-1; 1], виведіть масив на екран у 
 * рядок. Визначте який елемент зустрічається в масиві найчастіше і виведіть про це повідомлення на екран. Якщо два 
 * якихось елемента зустрічаються однакову кількість разів, то не виводьте нічого.
 */
package work02;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		int[] array = new int[11];
		Random rand = new Random();
		int count_1 = 0;
		int count0 = 0;
		int count1 = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(3) - 1;
			if (array[i] == -1) {
				count_1++;
			} else if (array[i] == 0) {
				count0++;
			} else {
				count1++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		/*
		 * System.out.println(count_1); System.out.println(count0);
		 * System.out.println(count1);
		 */

		if ((count_1 > count0) && (count_1 > count1)) {
			System.out.println("-1 зустрічається найчастіше");
		} else if ((count0 > count_1) && (count0 > count1)) {
			System.out.println("0 зустрічається найчастіше");
		} else if ((count1 > count_1) && (count1 > count0)) {
			System.out.println("1 зустрічається найчастіше");
		}
	}

}
