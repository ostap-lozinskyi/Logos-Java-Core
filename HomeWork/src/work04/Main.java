package work04;

/*Написати  гру вгадай слово, потрібно реалізувати питання і вадповідь на  них,  можна використати 2-х вимірний масив стрічок. 
 * Далі потрібно  рандомом  вибрати пару питання-відповідь і вивести питання в консоль, а  також  показати користувачу слово 
 * з * замість букв, для наглядності  також можна  вивести кількість букв у слові. Встановити лічильник спроб в  значення  5, 
 * і запропонувати користувачу ввести букву, якщо вгадав,  вивести слово з  цією буквою або буквами замість * і дати можливість  
 * ввести ще букву,  якщо не вгадав — вивести повідомлення що такої букви  немає у слові і  зменшити лічільник на 1, якщо 
 * лічильник досягне 0  потрібно вивести  повідомлення що користувач програв. Також рекомендую  вести лічильник з  кількістю 
 * відгаданих букв і порівнювати його з  довжиною стрічки в якій  відповідь.   
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static Random rand = new Random();
	static String[][] res = { { "Депресивний стан", "апатія" }, { "Риба-хижак", "акула" },
			{ "Наука про небо", "астрономія" } };
	static String answer = "";
	static String hideAnswer = "";
	static char[] arrayHideAnswer;
	static String recent = "";
	static int attemptCount = 5;

	static int random() {
		return rand.nextInt(res.length);
	}

	static void printTask() {
		int randomTask = random();
		String task = res[randomTask][0];
		System.out.println(task);
		answer = res[randomTask][1];
		arrayHideAnswer = new char[answer.length()];
		for (int i = 0; i < answer.length(); i++) {
			arrayHideAnswer[i] = '*';
		}
		printArray(arrayHideAnswer);
	}

	static String replaceCharAt(String s, int pos, String replaceString) {
		return s.substring(0, pos) + replaceString + s.substring(pos + 1);
	}

	static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println("   " + arrayHideAnswer.length+" букв");
	}

	static void userMove() {
		System.out.println("Введіть вашу букву:");
		String string = scanner.next();
		char s = string.toCharArray()[0];
		if (recent.contains(string)) {
			System.out.println("Ця буква вже використовувалась!");
		} else {
			if (answer.contains(string)) {
				System.out.println("Є така буква!");
				recent += s;
				for (int i = 0; i < arrayHideAnswer.length - 1; i++) {
					if (answer.indexOf(s, i) != -1) {
						arrayHideAnswer[answer.indexOf(s, i)] = s;
					}
				}
				printArray(arrayHideAnswer);
			} else {
				attemptCount--;
				System.out.println("Нема такої букви. У Вас залишилось " + attemptCount + " спроб");
			}
			if (attemptCount == 0) {
				System.out.println("Ви програли :(");
			}
			hideAnswer = "";
			for (int i = 0; i < arrayHideAnswer.length; i++) {
				hideAnswer += arrayHideAnswer[i];
			}
			if (answer.equals(hideAnswer)) {
				System.out.println("Ви відгадали слово!");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Ласкаво просимо в гру 'Поле чудес!'");
		System.out.println("Ваше завдання: ");
		printTask();
		while (attemptCount != 0) {
			userMove();			
		}
	}

}
