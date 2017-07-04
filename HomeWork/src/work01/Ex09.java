/*
 * 6. Виведіть на екран всі двозначні члени послідовності 2a+200, де a1 = 
 * -166. 
*/
package work01;

public class Ex09 {

	public static void main(String[] args) {
		/*
		int max = 100;
		int a1 = -166;
		
		 * for (int a = a1; a < MAX; a = 2 * a + 200) { if ((a > -100) && (a <
		 * 100)) { System.out.print(a + " "); } }
		 */

		int a = -166;
		while (a < 100) {
			if (a > -100) {
				System.out.print(a + " ");
			}
			a = 2 * a + 200;
		}

	}

}
