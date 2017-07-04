/*
 * Створіть масив з усіх парних  чисел від 2 до 20 і виведіть елементи масиву на екран спочатку в рядок,
 * відокремлюючи один елемент від іншого прогалиною, а потім в стовпчик (відокремлюючи  один  елемент від іншого початком
 * нового рядка). Перед створенням  масиву подумайте, якого він буде розміру.
 */
package work02;

public class Ex01 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int position = 0;
		for (int value = 2; value <= 20; value++) {
			if (value % 2 == 0) {
				array[position] = value;
				position++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
