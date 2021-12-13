import java.util.Scanner;

/*
 * Mục đích: Chương trình cho phép nhập một số tự nhiên và in ra tổng các chữ số của số tự nhiên đó
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 12/12/2021
 * Version: 1.0
 * */
public class Cau4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		float sumOfDigits;
		System.out.println("Chương trình tính tổng các chữ số của số tự nhiên");
		do {
			num = inputNum(scan);
			if (num == -1) {
				System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
				break;
			}
			sumOfDigits = calculateSumOfDigits(num);
			System.out.println("Tổng các chữ số của số " + num + " là: " + sumOfDigits);
		}while (num != -1);
	}

	public static int inputNum(Scanner scan) {
		System.out.print("Nhập vào một số tự nhiên (Nhập -1 để thoát): ");
		int num = Integer.parseInt(scan.nextLine());
		while (num < -1) {
			System.out.print("Xin nhập số tự nhiên ( lớn hơn hoặc bằng 0 )...");
			num = Integer.parseInt(scan.nextLine());
		}
		return num;
	}

	public static float calculateSumOfDigits(int num) {
		float sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
