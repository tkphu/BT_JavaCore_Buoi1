import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Mục đích: Tách một mảng số tự nhiên đc nhập từ bàn phím thành 2 mảng: một mảng chẵn, một mảng lẻ
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 13/12/2021
 * Version: 1.0
 * */
public class Cau20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = inputNum(scan);
		int[] arr = creatArray(scan, n);
		int count = countEvenNum(arr);
		printArray(arr);
		detachedEvenOddArr(arr, count);
	}

	public static int inputNum(Scanner scan) {
		System.out.print("Nhập số phần tử: ");
		int num = Integer.parseInt(scan.nextLine());
		while (num < 1) {
			System.out.print("Xin nhập n lớn hơn 0...");
			num = Integer.parseInt(scan.nextLine());
		}
		return num;
	}

	public static int[] creatArray(Scanner scan, int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = Integer.parseInt(scan.nextLine());
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static int countEvenNum(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void detachedEvenOddArr(int[] arr,int count) {
		if (count == 0) {
			System.out.println("Mảng là mảng lẻ, không có số chẵn");
		} else if (count == arr.length) {
			System.out.println("Mảng là mảng chắn, không có số lẻ");
		} else {
			int[] evenArr = new int[count];
			int[] oddArr = new int[arr.length - count];
			for (int i = 0, j = 0, k = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					evenArr[j++] = arr[i];
				} else {
					oddArr[k++] = arr[i];
				}
			}
			System.out.print("Mảng chẵn: ");
			printArray(evenArr);
			System.out.print("Mảng lẻ: ");
			printArray(oddArr);
		}
	}
}
