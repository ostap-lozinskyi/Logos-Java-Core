/*
 * Створіть масив з 4 випадкових цілих чисел з відрізка [10;   99], виведіть його на екран у рядок. Визначити і 
 * вивести на екран повідомлення про те, чи є масив строго зростаючої послідовністю.  
 */
package work02;

import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		int[] array = new int[4];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(90) + 10;
		}
		// int[] array = {1,2,3,4,5,6};

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		for (int i = 1; i < array.length; i++) {
			if (array[i] <= array[i - 1]) {
				System.out.println("масив НЕ є строго зростаючою послідовністю, починаючи з " + (i + 1) + " елементу");
				break;
			} else if (i == array.length - 1) {
				System.out.println("масив Є строго зростаючою послідовністю!");
			}
		}
	}

}
