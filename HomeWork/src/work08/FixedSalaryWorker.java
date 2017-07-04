package work08;

public class FixedSalaryWorker implements Salary {

	String name;
	int numberOfMonths;
	int rate = 100;
	int salary;

	public FixedSalaryWorker(String name, int numberOfMonth) {
		this.name = name;
		this.numberOfMonths = numberOfMonth;
		salary();
	}

	@Override
	public void salary() {
		salary = rate * numberOfMonths;
		System.out.println("Salary of " + name + " = " + salary + "$");
	}

}
