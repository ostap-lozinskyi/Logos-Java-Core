/*
 * Створіть масив з 12 випадкових цілих чисел з відрізка [-15;   15]. Визначте який елемент є в цьому масиві
 * максимальним і повідомте індекс його останнього входження в масив.  
 */
package work02;

import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {
		int[] array = new int[12];
		Random rand = new Random();
		int maxElement = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(31) - 15;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= maxElement) {
				maxElement = array[i];
				index = i;
			}
		}
		System.out.println();
		System.out.println("Максимальний елемент " + maxElement);
		System.out.println("Останнє входження " + index);
	}

}
