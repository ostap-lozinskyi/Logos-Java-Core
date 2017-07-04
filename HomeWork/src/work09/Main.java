package work09;
/* Створити клас Кермо, Колесо, Кузов – описати дані класи(гетери, сетери, туСтрінг, конструктор). 
 * Додати методи які б виконували певні функції з полями (наприклад збільшення діаметру колеса). 
 * Створити клас Машина, який матиме деякі свої поля та об’єкти класу Кермо, Кузов, Колесо як поля класу. 
 * «Обгорнути» функціональні методи композиційних класів в класі Машина. В мейн методі створити клас Машина, 
 * запустити всі його методи. 
 */

public class Main {

	public static void main(String[] args) {
		SteeringWheel steeringWheel = new SteeringWheel("leather");
		Wheel wheel = new Wheel(30);
		CarBody carBody = new CarBody("red");
		Car car = new Car("Nissan", steeringWheel, wheel, carBody);
		car.setParameters("cloth", 22, "green");
		System.out.println(car.toString());

	}
}
