import java.util.Scanner;

/*
 * Mục đích: Viết chương trình giải phương trình bậc 1 và bậc 2 ( Dạng menu lựa chọn )
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 13/12/2021
 * Version: 1.0
 * */
public class Cau19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Chương trình giải phương trình bậc 1 và bậc 2");
		doMenu(scan);
	}

	public static void printMenu() {
		System.out.println("Mời lựa chọn: ");
		System.out.println("1. Giải phương trình bậc 1");
		System.out.println("2. Giải phương trình bậc 2");
		System.out.println("3. Thoát");
	}

	public static byte inputChoice(Scanner scan) {
		System.out.print("Lựa chọn của bạn: ");
		byte choice = Byte.parseByte(scan.nextLine());
		while (choice < 1 || choice > 3) {
			System.out.println("Vui lòng nhập đúng...");
			choice = Byte.parseByte(scan.nextLine());
		}
		return choice;
	}

	public static void doMenu(Scanner scan) {
		byte choice;
		int a,b,c;
		boolean quit = false;
		do {
			printMenu();
			choice = inputChoice(scan);
			switch (choice) {
			case 1:
				System.out.println("Phương trình bậc 1 có dạng: ax + b =0");
				System.out.print("Nhập a = ");
				a = Integer.parseInt(scan.nextLine());
				System.out.print("Nhập b = ");
				b = Integer.parseInt(scan.nextLine());
				doLinearEquation(a, b);
				break;
			case 2:
				System.out.println("Phương trình bậc 1 có dạng: ax^2 + bx + c =0");
				System.out.print("Nhập a = ");
				a = Integer.parseInt(scan.nextLine());
				System.out.print("Nhập b = ");
				b = Integer.parseInt(scan.nextLine());
				System.out.print("Nhập c = ");
				c = Integer.parseInt(scan.nextLine());
				DoQuadraticEquation(a, b, c);
				break;
			case 3:
				quit = true;
				break;
			}
		} while (!quit);
		System.out.println("Cảm ơn vì đã sử dụng chương trình!");
	}

	public static void doLinearEquation(int a, int b) {
		boolean haveSolutions = checkLinerSolution(a, b);
		if (haveSolutions) {
			solveLinearEquation(a, b);
		}else {
			System.out.println("Phương trình vô nghiệm.");
		}	
	}

	public static void solveLinearEquation(int a,int b) {
		float x;
		if (a == 0) {
			if(b==0) {
				System.out.println("Phương trình có vô số nghiệm");
			}
		}else {
			x=(float) (-b)/a;
			System.out.println("Phương trình có một nghiệm: x = "+ x);
		}
	}
	public static void DoQuadraticEquation(int a, int b, int c) {
		boolean haveSolution = checkQuadraticSolution(a, b, c);
		if (haveSolution) {
			solveQuadraticEquation(a, b, c);
		}else {
			System.out.println("Phương trình vô nghiệm");
		}
		
	}

	public static void solveQuadraticEquation(int a, int b, int c) {
		float delta, x1, x2;
		if (a == 0) {
			solveLinearEquation(b, c);
		}else {
			delta = b * b - (4 * a * c);				
			if (delta > 0) {
				System.out.println("Phương trình có 2 nghiệm phân biệt:");
				x1 = (float) ((-b) + Math.sqrt(delta)) / (2 * a);
				x2 = (float) ((-b) - Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = "+ x1);
				System.out.println("x2 = "+ x2);				
			} else if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép: ");
				x1 = (float) (-b) / (2 * a);
				x2 = x1;
				System.out.println("x1 = x2 = " + x1);
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
	}
	public static boolean checkLinerSolution(int a, int b) {
		if (a == 0 && b != 0) {
			return false;
		}
		return true;
	}
	public static boolean checkQuadraticSolution(int a, int b, int c) {
		if (a== 0) {
			return checkLinerSolution(b, c);
		}
		return true;
	}
}
