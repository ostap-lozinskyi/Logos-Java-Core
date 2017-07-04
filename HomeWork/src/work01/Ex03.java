/*
 * У три змінні a, b і c записані три дійсних числа. Створити програму,
 * яка буде знаходити і виводити на екран речові коріння квадратного 
 * рівняння ax2 + bx + c = 0, або повідомляти, що коріння немає. 
*/
package work01;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a;
		double b;
		double c;
		double discr;
		double x1;
		double x2;

		System.out.println("Введіть а: (не дорівнює 0!) ");
		a = scanner.nextDouble();
		System.out.println("Введіть b: ");
		b = scanner.nextDouble();
		System.out.println("Введіть c: ");
		c = scanner.nextDouble();
		discr = Math.pow(b, 2) - (4 * a * c);

		if (discr > 0) {
			x1 = ((-1) * b + Math.sqrt(discr)) / (2 * a);
			x2 = ((-1) * b - Math.sqrt(discr)) / (2 * a);
			System.out.printf("x1 = " + x1 + " x2 = " + x2);
		} else if (discr == 0) {
			x1 = ((-1) * b) / 2 * a;
			System.out.printf("x1, x2 = " + x1);
		} else
			System.out.print("Рівняння не має дійсних коренів");

	}

}
