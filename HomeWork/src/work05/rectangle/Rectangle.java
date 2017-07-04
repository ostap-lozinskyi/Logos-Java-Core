package work05.rectangle;

import java.util.Random;

public class Rectangle {
	int length;
	int width;
	static int count = 0;
	Random random=new Random();

	Rectangle() {
		length=random.nextInt(100);
		width=random.nextInt(100);
		count++;
		squareRectangle(length, width);
		perimeterRectangle(length, width);
	}

	Rectangle(int length, int width) {
		count++;
		squareRectangle(length, width);
		perimeterRectangle(length, width);
	}

	void squareRectangle(int length, int width) {
		int i = length * width;
		System.out.println("Площа прямокутника номер " + count + "= " + i);
	}

	void perimeterRectangle(int length, int width) {
		int i = length * 2 + width * 2;
		System.out.println("Периметр прямокутника номер " + count + "= " + i);
	}
}
