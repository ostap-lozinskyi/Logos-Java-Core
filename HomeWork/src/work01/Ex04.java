/*
 * 1. Створіть програму, що виводить на екран всі чотиризначні числа
 * послідовності 1000 1003 1006 1009 1012 1015. 
*/
package work01;

public class Ex04 {

	public static void main(String[] args) {
		int min = 1000;
		int max = 10000;
		for (int i = min; i < max; i += 3) {
			System.out.println(i);
		}

	}

}
