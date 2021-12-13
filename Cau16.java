import java.util.Scanner;

/*
 * Mục đích: Kiểm tra xem phải năm nhuận không?
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 13/12/2021
 * Version: 1.0
 * */
public class Cau16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = inputNum(scan);
		boolean isLeapYear = checkLeapYear(year);
		if (isLeapYear) {
			System.out.println("Năm "+year+" là năm nhuận");
		}else {
			System.out.println("Năm "+year+" không phải là năm nhuận");
		}
		
	}
	public static int inputNum(Scanner scan) {
		System.out.print("Nhập số năm: ");
		int num = Integer.parseInt(scan.nextLine());
		while (num <= 0) {
			System.out.print("Xin nhập số năm hợp lệ (lớn hơn 0)...");
			num = Integer.parseInt(scan.nextLine());
		}
		return num;
	}
	
	public static boolean checkLeapYear(int year) {
		if ( year % 400 == 0) {
			return true;
		}
		if(year %4 == 0 && year %100 != 0) {
			return true;
		}
		return false;
	}
	
}
