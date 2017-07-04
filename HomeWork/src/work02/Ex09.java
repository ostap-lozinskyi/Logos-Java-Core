/*
 * Створіть два масиви з 10 цілих випадкових чисел з відрізка [1; 9] і третій масив з 10 дійсних чисел. Кожен 
 * елемент з i-им індексом третього масиву повинен дорівнювати відношенню елементу з першого масиву з i-им індексом до 
 * елементу з другого масиву з i-им індексом. Вивести всі три масиву на екран (кожен на окремому рядку), потім вивести
 * кількість цілих елементів в третьому масиві.
 */
package work02;

import java.util.Random;

public class Ex09 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		double[] array3 = new double[10];
		Random rand = new Random();

		for (int i = 0; i < array1.length; i++) {
			array1[i] = rand.nextInt(9) + 1;
		}
		System.out.println("масив 1: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			array2[i] = rand.nextInt(9) + 1;
		}
		System.out.println("масив 2: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < array3.length; i++) {
			array3[i] = (double) array1[i] / array2[i];
		}
		System.out.println("масив 3: ");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + "  ");
		}
		System.out.println();
		System.out.println("цілі числа масиву 3: ");
		for (int i = 0; i < array3.length; i++) {
			if (array3[i] % 1 == 0) {
				System.out.print(array3[i] + "  ");
			}
		}

	}

}
