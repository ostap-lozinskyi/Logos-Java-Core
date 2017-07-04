/*
 * 7. Створіть програму, яка обчислює факторіал натурального числа n, 
 * яке користувач введе з клавіатури. 
*/
package work01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть натуральне число: ");
		int n = scanner.nextInt();	
		int fact=0;
		for (int i=1; i <= n; i++) {
			fact=n*i;			
		}
		System.out.print(fact);
	}

}
