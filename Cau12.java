import java.util.Scanner;
/*
 * Mục đích: Cho phép nhập vào số tự nhiên n từ 1-9. in ra tam giác vuông có độ dài tương ứng
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 12/12/2021
 * Version: 1.0 
 * */
public class Cau12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = inputNum(scan);
		drawRightTriangle(n);
	}

	public static int inputNum(Scanner scan) {
		System.out.print("Nhập n từ 1-9: ");
		int num = Integer.parseInt(scan.nextLine());
		while (num<1||num>9) {
			System.out.print("Xin nhập n từ 1-9...");
			num = Integer.parseInt(scan.nextLine());
		}
		return num;
	}
	
	public static void drawRightTriangle(int n) {
		for (int i =1; i<=n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("\t");
		}
	}
}
