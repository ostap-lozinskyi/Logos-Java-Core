/*
 * Створіть масив з усіх непарних чисел від 1 до 99, виведіть його на екран у рядок, а потім цей же масив виведіть 
 * на екран теж в рядок, але в зворотному порядку (99 97 95 93 ... 7 5 3 1).  
 */
package work02;

public class Ex02 {

	public static void main(String[] args) {
		int[] array = new int[50];
		int position = 0;
		for (int value = 1; value <= 99; value++) {
			if (value % 2 != 0) {
				array[position] = value;
				position++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
