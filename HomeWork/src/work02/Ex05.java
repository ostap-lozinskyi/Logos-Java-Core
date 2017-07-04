/*
 * Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0;   5] кожен, виведіть масиви на екран у двох окремих 
 * рядках. Порахуйте середнє арифметичне елементів кожного масиву і повідомте, для якого з масивів це значення виявилося 
 * більше (або повідомте, що їх середні арифметичні рівні). 
 */
package work02;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		Random rand = new Random();
		double countArray1 = 0;
		double countArray2 = 0;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rand.nextInt(6);
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = rand.nextInt(6);
		}

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

		for (int i = 0; i < array1.length; i++) {
			countArray1 += array1[i];
		}
		countArray1 = countArray1 / array1.length;

		for (int i = 0; i < array2.length; i++) {
			countArray2 += array2[i];
		}
		countArray2 = countArray2 / array2.length;

		System.out.println();
		if (countArray1 > countArray2) {
			System.out.println("Середнє арифм. масиву 1 більше" + " (" + countArray1 + " і " + countArray2 + ")");
		} else if (countArray1 < countArray2) {
			System.out.println("Середнє арифм. масиву 2 більше" + " (" + countArray1 + " і " + countArray2 + ")");
		} else {
			System.out.println("Середнє арифм. масиву 1 і 2 однакові" + " (" + countArray1 + " і " + countArray2 + ")");
		}
	}

}
