/*
 * 8. Виведіть на екран всі позитивні подільники натурального числа, 
 * введеного користувачем з клавіатури. 
*/
/*
 * Від'ємні, дробові числа, та число нуль не є натуральними числами.
 */
package work01;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть натуральне число: ");
		int n = scanner.nextInt();
		int max = n / 2;
		for (int i = 1; i <= max; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(n);

	}

}
