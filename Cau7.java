
import java.util.Scanner;

/*
 * Mục đích: In ra các ước số của một số tự nhiên nhập vào
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 12/12/2021
 * Version: 1.0
 * */
public class Cau7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Chương trình in ra các ước số của một số tự nhiên");
		do {
			num = inputNum(scan);
			if (num == -1) {
				System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
				break;
			}
			printDivisorOfNum(num);
		}while(num != -1);

	}

	public static int inputNum(Scanner scan) {
		System.out.print("Nhập một số tự nhiên (Nhập -1 để thoát): ");
		int num = Integer.parseInt(scan.nextLine());
		while (num < -1) {
			System.out.print("Nhập số tự nhiên (lớn hơn hoặc bằng 0)... ");
			num = Integer.parseInt(scan.nextLine());
		}
		return num;
	}

	public static void printDivisorOfNum(int num) {
		if (num == 0) {
			System.out.println("Số 0 không có ước số của nó.");
		} else {
			System.out.println("Các ước số của " + num + " là: ");
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(i + "\t");
				}
			}
		}
	}
}
