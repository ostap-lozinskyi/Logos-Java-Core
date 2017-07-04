package work06;
/*Створити   клас Robot від якого слід унаслідувати CoffeRobot, RobotDancer,   RobotCoocker. В Robot є метод work() , 
 * в якому слід описати роботу яку   виконує кожен з роботів. 
 * Для Robot в методі work() слід написати код, щоб на консоль виводився наступний текст «Я Robot – я просто працюю». 
 * Для CoffeRobot в методі work() слід написати код, щоб на консоль виводився наступний текст «Я CoffeRobot – я варю каву». 
 * Для RobotDancer в методі work() слід написати код, щоб на консоль виводився наступний текст «Я RobotDancer – я просто танцюю». 
 * Для RobotCoocker в методі work() слід написати код, щоб на консоль виводився наступний текст «Я RobotCoocker – я просто готую». 
 * Створити в Main класі екземпляри даних класів і викликати до кожного з них метод work().*/

public class Main {

	public static void main(String[] args) {
		new Robot().work();
		new CoffeRobot().work();
		new RobotCoocker().work();
		new RobotDancer().work();

	}

}
