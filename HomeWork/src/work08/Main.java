package work08;
/*Створити interface Зарплата, в якому передбачити метод зарплата(). Створити клас Працівник з погодинною зарплатою,
 * та Працівник з фіксованою місячною зарплатою . Формула розрахунку зарплати працівника є довільною. Вивести на екран
 * скільки заробляють перший і другий працівники.
 */
public class Main {

	public static void main(String[] args) {

		HourlyWagesWorker worker1 = new HourlyWagesWorker("Smith", 100);
		FixedSalaryWorker worker2 = new FixedSalaryWorker("John", 12);

	}

}
