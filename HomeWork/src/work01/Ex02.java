/*
 * 2. Створити програму, що виводить на екран найближче до 10 з двох 
 * чисел, записаних в змінні m і n. Наприклад, серед чисел 8,5 і 11,45
 * найближче до десяти 11,45. 
*/
package work01;

public class Ex02 {

	public static void main(String[] args) {
		int numb = 10;
		int n = -60;
		int m = 80;
		if(Math.abs(numb-n)<Math.abs(numb-m)) {
			System.out.println(n+" ближче");
		} else if(Math.abs(numb-n)>Math.abs(numb-m)){
			System.out.println(m+" ближче");
		} else {
			System.out.println("Числа однаково віддалені");
		}

	}

}
