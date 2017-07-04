/*
 * Створіть масив з 15 випадкових цілих чисел з відрізка [0;   9]. Виведіть масив на екран. Підрахуйте скільки в 
 * масиві парних елементів і виведете цю кількість на екран на окремому рядку.    
 */
package work02;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		int[] array = new int[15];
		int count = 0;
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			if (array[i] % 2 == 0) {
				count++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("парних елементів: " + count);

	}

}
