package work03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] array = new int[3][3];
		Scanner sc = new Scanner(System.in);
		print(array);
		boolean isRun = true;
		while (isRun) {
			user(array, sc);
			System.out.println("User:");
			boolean isUserWin = whoWin(array, 1);
			print(array);
			if (isGameOver(array))
				break;
			cpu(array);
			System.out.println("Cpu:");
			print(array);
			// boolean isUserWin = whoWin(array, 1);
			boolean isCpuWin = whoWin(array, -1);
			if (isCpuWin || isUserWin) {
				isRun = false;
				if (isCpuWin) {
					System.out.println("Cpu win");
				} else {
					System.out.println("User win");
				}
			}
		}
	}

	static boolean isGameOver(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * Ostap start
	 */
	static boolean lineCheck(int[][] array, int xo) {
		for (int i = 0; i < array.length; i++) {
			if (array[i][0] + array[i][1] + array[i][2] == xo * 3)
				return true;
			if (array[0][i] + array[1][i] + array[2][i] == xo * 3)
				return true;
		}
		return false;
	}

	static boolean whoWin(int[][] array, int xo) {
		if (lineCheck(array, xo)) {
			return true;
		}
		if (array[0][0] + array[1][1] + array[2][2] == xo * 3)
			return true;
		if (array[2][0] + array[1][1] + array[0][2] == xo * 3)
			return true;
		return false;
	}

	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}

	static void cpu(int[][] array) {
		boolean isFull = true;
		while (isFull) {
			int x = random(0, 2);
			int y = random(0, 2);
			if (array[x][y] == 0) {
				array[x][y] = -1;
				isFull = false;
			}
		}
	}

	static void user(int[][] array, Scanner sc) {
		boolean isFull = true;
		while (isFull) {
			System.out.println("Enter x:");
			int x = sc.nextInt() - 1;
			System.out.println("Enter y:");
			int y = sc.nextInt() - 1;
			if (array[x][y] == 0) {
				array[x][y] = 1;
				isFull = false;
			} else {
				System.out.println("cell is Full!");
			}
		}
	}

	/*
	 * Ostap end
	 */

	static void print(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 0) {
					System.out.print("  ");
				}
				if (array[i][j] == -1) {
					System.out.print("0 ");
				}
				if (array[i][j] == 1) {
					System.out.print("x ");
				}
			}
			System.out.println();
		}
	}

}
