/*
 * 5. Виведіть на екран всі числа в послідовності 2a-1, де a1 = 2, які 
 * менше 10000. 
*/
package work01;

public class Ex08 {

	public static void main(String[] args) {
		int max = 10000;
		int a1 = 2;
		for (int a = a1; a < max; a = 2 * a - 1) {
			System.out.print(a + " ");
		}

	}

}
