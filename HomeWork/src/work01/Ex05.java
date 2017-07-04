/*
 * 2. Створіть програму, що виводить на екран перші 55 елементів 
 * послідовності 1 3 5 7 9 11 13 15 17 .... 
*/
package work01;

public class Ex05 {

	public static void main(String[] args) {
		int max = 55;
				
		for (int i = 1; i <= max; i=i+2) {
			System.out.print(i + " ");			
		}
	}

}
