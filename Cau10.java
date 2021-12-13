import java.util.Scanner;

/*
 * Mục đích: Tính tổng các số nguyên tố từ 1 đến n, n do người dùng nhập vào.
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 12/12/2021
 * Version: 1.0
 * */
public class Cau10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		float sum;
		System.out.println("Chương trình tính tổng các số nguyên tố từ 1 đến n");
		n = inputNum(scan);
		sum = sumPrimes(n);
		System.out.println("Tổng các số nguyên tố từ 1 đến " + n +" = " + sum);

	}

	public static int inputNum(Scanner scan) {
		System.out.print("Nhập n lớn hơn 1: ");
		int num = Integer.parseInt(scan.nextLine());
		while (num<=1) {
			System.out.print("Xin nhập n lớn hơn 1...");
			num = Integer.parseInt(scan.nextLine());
		}
		return num;
	}
	
	public static float sumPrimes(int n) {
		float sum = 0;
		for (int i = 2; i<= n; i++) {
			if (isPrime(i)) {
				sum+= i;
			}
		}
		return sum;
	}
	public static boolean isPrime(int i) {
		for (int j = 2;j < i; j++) {
			if(i%j == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
