/*
* 1. Створити програму, що перевіряє і повідомляє на екран, чи є ціле 
* число записане в змінну n, парним або непарним. 
*/
package work01;

public class Ex01 {

	public static void main(String[] args) {
		int n = 7;
		if (n % 2 == 0) {
			System.out.println("Число " + n + " парне");
		} else {
			System.out.println("Число " + n + " непарне");
		}

	}

}
