package work16;

/* Створити клас Methods, Описати в ньому методи , які б розраховували додавання, віднімання, множення, ділення двох змінних . При цьому врахувати : 
 * Якщо a<0, b<0  викидаємо IllegalArgumentException 
 * Якщо a=0 b!=0  викидаємо ArithmeticException 
 * Якщо a!=0 b=0  викидаємо ArithmeticException 
 * Якщо a=0 b=0   викидаємо IllegalAccessException 
 * Якщо a>0 b>0   викидаємо MyException 
 * Протестувати всі можливі варіанти, і вивести все на консоль.   
 */

public class Methods {

	public static void main(String[] args) {
		Methods methods = new Methods();
		methods.sum(0, 4);
		methods.subtraction(5, 0);
		methods.multiplication(0, 12);
		methods.division(5, 0);
	}

	public int sum(int a, int b) {
		try {
			check(a, b);
		} catch (IllegalAccessException | MyException e) {
			e.printStackTrace();
		}
		return a + b;
	}

	public int subtraction(int a, int b) {
		try {
			check(a, b);
		} catch (IllegalAccessException | MyException e) {
			e.printStackTrace();
		}
		return a - b;
	}

	public int multiplication(int a, int b) {
		try {
			check(a, b);
		} catch (IllegalAccessException | MyException e) {
			e.printStackTrace();
		}
		return a * b;
	}

	public int division(int a, int b) {
		try {
			check(a, b);
		} catch (IllegalAccessException | MyException e) {
			e.printStackTrace();
		}
		return a / b;
	}

	private void check(int a, int b) throws MyException, IllegalAccessException {
		if (a < 0 || b < 0)
			throw new IllegalArgumentException();
		if ((a == 0 && b != 0) || (a != 0 && b == 0))
			throw new ArithmeticException();
		if (a == 0 || b == 0)
			throw new IllegalAccessException();
		if (a > 0 && b > 0)
			throw new MyException();

	}

}
