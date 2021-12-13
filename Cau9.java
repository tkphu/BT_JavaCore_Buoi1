import java.util.Scanner;

/*
 * Mục đích: Cho nhập 2 số nguyên dương từ 10-99, in true nếu 2 số đó có cùng 1 hoặc 2 chữ số,ngược lại in false
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 12/12/2021
 * Version: 1.0
 * */
public class Cau9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numA, numB;
		System.out.println("Nhập 2 số nguyên dương từ 10-99: ");
		System.out.print("Số thứ nhất: ");
		numA = inputNum(scan);
		System.out.print("Số thứ hai: ");
		numB = inputNum(scan);
		if (haveSameDigits(numA, numB)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

	}

	public static int inputNum(Scanner scan) {
		int num = Integer.parseInt(scan.nextLine());
		while (num < 10 || num > 99) {
			System.out.print("Chỉ nhập từ 10-99...");
			num = Integer.parseInt(scan.nextLine());
		}
		return num;
	}

	public static boolean haveSameDigits(int numA, int numB) {
		for (int i = numA; i != 0; i /= 10) {
			for (int j = numB;j != 0;j/=10 ) {
				if (i%10 == j%10) {
					return true;
				}
			}
		}
		return false;
	}
}
