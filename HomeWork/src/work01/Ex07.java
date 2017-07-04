/*
 * 4. Створіть програму, що виводить на екран перші 20 елементів
 *послідовності 2 4 8 16 32 64 128 .... 
*/
package work01;

public class Ex07 {

	public static void main(String[] args) {
		int max = 20;
		int n = 2;
		for (int i = 1; i <= max; i++) {
			int number = (int) Math.pow(n, i);
			System.out.print(number + " ");
		}
	}

}
