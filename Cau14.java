import java.util.Arrays;
import java.util.Scanner;

/*
 * Mục đích: Cho phép nhập vào số phần tử và từng phần tử của một mảng. Xóa đi các phần tử bị lặp
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 13/12/2021
 * Version: 1.0
 * */
public class Cau14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = inputNum(scan);
		int[] arr = creatArray(scan, n);
		printArray(arr);
		arr = removeSameNum(arr);
		System.out.println("Mảng sau khi xóa các phần tử lặp: ");
		printArray(arr);
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
	
	public static int[] removeSameNum(int[] arr) {
		int indexCurrent = 0;
		do {
			int indexSameNum = -1;
			int count = 0;
			for (int i = indexCurrent+ 1; i < arr.length; i++) {
				if (arr[indexCurrent] == arr[i]) {
					indexSameNum = i;
					count++;
				}
			}
			if (count != 0) {
				arr = helperRemove(arr, count, indexSameNum, indexCurrent);
			}
			indexCurrent++;
		}while (indexCurrent < arr.length-1);
		return arr;
	}
	
	public static int[] helperRemove(int[] arr, int count,int indexSameNum,int indexCurrent ) {
		int[] subArr = new int[arr.length-count];
		for (int k = 0,j = 0; j<subArr.length;k++,j++) {
			if (arr[k] == arr[indexSameNum] && k!= indexCurrent) {
				subArr[j] = arr[++k];
			}else {
				subArr[j] = arr[k];
			}
		}
		return subArr;
	}
}
