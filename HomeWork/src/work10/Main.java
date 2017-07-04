package work10;

/* Створити клас Кермо, Колесо, Кузов – описати дані класи(гетери, сетери, туСтрінг, конструктор). 
 * Додати методи які б виконували певні функції з полями (наприклад збільшення діаметру колеса). 
 * Створити клас Машина, який матиме деякі свої поля та об’єкти класу Кермо, Кузов, Колесо як поля класу. 
 * «Обгорнути» функціональні методи композиційних класів в класі Машина. В мейн методі створити клас Машина, 
 * запустити всі його методи. 
 */

import work10.enumPack.Color;
import work10.enumPack.Covering;
import work10.enumPack.Diameter;
import work10.enumPack.Model;

public class Main {

	public static void main(String[] args) {
		SteeringWheel steeringWheel = new SteeringWheel(Covering.LEATHER);
		Wheel wheel = new Wheel(Diameter.R16);
		CarBody carBody = new CarBody(Color.RED);
		Car car = new Car(Model.NISSAN, steeringWheel, wheel, carBody);
		car.setParameters(Covering.CLOTH, Diameter.R15, Color.GREEN);
		System.out.println(car.toString());

	}
}
