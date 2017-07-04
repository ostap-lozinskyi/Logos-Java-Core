/*
 * Створіть масив з 20-ти перших чисел Фібоначчі і виведіть його на екран. Нагадуємо, що перший і другий члени 
 * послідовності рівні одиницям, а кожен наступний - сумою двох попередніх.
 */
package work02;

public class Ex07 {

	public static void main(String[] args) {
		int max = 20;
		int value1 = 1;
		int value2 = 1;
		int value3;
		System.out.print(value1 + " ");
		System.out.print(value2 + " ");

		for (int i = 1; i <= max; i++) {
			value3 = value1 + value2;
			System.out.print(value3 + " ");
			value1 = value2;
			value2 = value3;
		}
	}

}
