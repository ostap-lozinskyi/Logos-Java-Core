/*
 * 3. Створіть програму, що виводить на екран всі невід'ємні елементи 
 * послідовності 90 85 80 75 70 65 60 .... 
*/
package work01;

public class Ex06 {

	public static void main(String[] args) {
		int start = 90;
		int end = 0;

		for (int i = start; i >= end; i -= 5) {
			System.out.print(i + " ");
		}

	}

}
