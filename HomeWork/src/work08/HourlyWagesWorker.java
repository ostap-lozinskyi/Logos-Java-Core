package work08;

public class HourlyWagesWorker implements Salary {

	String name;
	int numberOfHours;
	int rate = 10;
	int salary;

	public HourlyWagesWorker(String name, int numberOfHours) {
		this.name = name;
		this.numberOfHours = numberOfHours;
		salary();
	}

	@Override
	public void salary() {
		salary = rate * numberOfHours;
		System.out.println("Salary of " + name + " = " + salary + "$");
	}

}
