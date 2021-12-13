import java.util.Scanner;

/*
 * Mục đích: In ra số tự nhiên lớn nhất nhỏ hơn log2 (n), n do người dùng nhập vào.
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 12/12/2021
 * Version: 1.0
 * */
public class Cau11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		double log2n,variable;
		n =inputNum(scan);
		if (n == 0) {
			System.out.println("log2 "+n+" vô nghiệm");
		}else {
			log2n = Math.log10(n)/Math.log10(2);
			System.out.println("log2 " + n +" = " + log2n);
			variable = findNaturalNumBiggest( log2n);
			if (variable < 0 ) {
				System.out.println("Không có số tự nhiên nào hợp lệ.");
			}else {
				System.out.println("Số tự nhiên lớn nhất nhỏ hơn log2 "+n+" là: "+ variable);				
			}
		}
	}
	
	public static int inputNum(Scanner scan) {
		System.out.print("Nhập n lớn hơn 1: ");
		int num = Integer.parseInt(scan.nextLine());
		while (num<0) {
			System.out.print("Xin nhập n lớn hơn 1...");
			num = Integer.parseInt(scan.nextLine());
		}
		return num;
	}
	
	public static double findNaturalNumBiggest(double log2n) {
		double variable = Math.round(log2n);
		if(variable >= log2n) {
			variable--;
		}
		return variable--;
	}
}
