import java.util.Scanner;

/*
 * Mục đích: Chương trình chuyển đổi số từ hệ cơ số 10 sang hệ cơ số nhị phân
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 10/12/2021
 * Version: 1.0
 * */
public class Cau2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Chương trình chuyển đổi số từ hệ cơ số 10 sang hệ cơ số nhị phân và ngược lại");
		doMeNu(scan);

	}

	public static void doMeNu(Scanner scan) {
		boolean flag = true;
		boolean isBinaryNum;
		int choice;
		long num;
		do {
			printMenu();
			choice = inputChoice(scan);
			switch (choice) {
			case 1:
				num = inputNum(scan);
				num = exchangeBinary(num);
				System.out.println("-> " + num);
				break;
			case 2:
				num = inputNum(scan);
				isBinaryNum = checkBinaryNum(num);
				if (isBinaryNum) {
					num = exchangeDecimal(num);
					System.out.println("-> " + num);
				} else {
					System.out.println("Số bạn vừa nhập không phải là số hệ cơ số nhị phân");
				}
				break;
			case 0:
				System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
				flag = false;
				break;
			default:
				System.out.println("Xin nhập đúng...");
				break;
			}
		} while (flag);
	}

	public static void printMenu() {
		System.out.println("Xin mời chọn số nhập vào: ");
		System.out.println("1. Hệ cơ số thập phân");
		System.out.println("2. Hệ cơ số nhị phân");
		System.out.println("0. Thoát");
	}

	public static int inputChoice(Scanner scan) {
		System.out.print("Lựa chọn của bạn: ");
		int choice = Integer.parseInt(scan.nextLine());
		return choice;
	}

	public static long inputNum(Scanner scan) {
		System.out.print("Nhập số của bạn: ");
		long num = Long.parseLong(scan.nextLine());
		return num;
	}

	public static long exchangeBinary(long num) {
		long binaryNum = 0;
		long variable = num;
		long count = 1;
		while (variable != 0) {
			if (variable % 2 == 0) {
				do {
					count *= 10;
					variable /= 2;
				} while (variable % 2 == 0 && variable != 0);
				binaryNum += count;
			} else {
				binaryNum += count;
			}
			count *= 10;
			variable /= 2;
		}
		return binaryNum;
	}

	public static boolean checkBinaryNum(long num) {
		do {
			if (num % 10 > 1) {
				return false;
			}
			num /= 10;
		} while (num != 0);
		return true;
	}

	public static long exchangeDecimal(long num) {
		long decimalNum = 0;
		int count = 0;
		while (num != 0) {
			long variable = 2;
			if (num % 10 == 1) {
				if (count == 0) {
					variable = 1;
				}
				for (int i = 1; i < count; i++) {
					variable *= 2;
				}
				decimalNum += variable;
			}
			num /= 10;
			count++;
		}
		return decimalNum;
	}
}
