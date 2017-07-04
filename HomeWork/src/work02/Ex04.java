/*
 * Створіть масив з 8 випадкових цілих чисел з відрізка [1;   10]. Виведіть масив на екран у рядок. Замініть кожен 
 * елемент з непарним індексом на нуль. Знову виведете масив на екран на окремому рядку.
 */
package work02;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		int[] array = new int[8];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(11);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				array[i] = 0;
			}
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
