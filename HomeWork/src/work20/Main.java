package work20;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* Створити потік. Створити клас MyThread наслідувати його від класу Thread. Перевизначити метод run(), 
 * так щоб можна було вивести введену з консолі кількість чисел Фібоначі. Для цього використовуємо в методі run() клас Scanner.
 * Тобто ми вводимо з консолі скільки ми хочемо бачити чисел Фібоначі і ми їх виводимо з затримкою в 1 секунду.
 *
 * Створити потік. Створити клас RunnableThread імплементувати його від інтерфейсу Runnable. 
 * Метод run() перевизначити таким чином, щоб числа Фібоначі виводились в зворотньому порядку. 
 * Тобто Спершу ввели через Scanner скільки ми хочемо бачити чисел Фібоначі, потім з затримкою в 1 
 * секунду вивести їх від останнього до першого значення.
 */

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Введіть кількість бажаних чисел Фібоначі:");
		int length = scanner.nextInt();

		ExecutorService service = Executors.newFixedThreadPool(1);
		service.execute(new MyThread(length));
		service.execute(new Thread(new RunnableThread(length)));
		service.execute(new MyThread(length));
		service.execute(new Thread(new RunnableThread(length)));
		service.execute(new MyThread(length));
		service.execute(new Thread(new RunnableThread(length)));
		service.execute(new MyThread(length));
		service.execute(new Thread(new RunnableThread(length)));
		service.shutdown();
	}

}
