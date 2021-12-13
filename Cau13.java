import java.util.Arrays;
import java.util.Scanner;

/*
 * Mục đích: Cho phép nhập vào số phần tử và từng phần tử của một mảng.
 * +Tính giá trị trung bình
 * +Tìm phần tử lớn nhất, nhỏ nhất
 * +Tìm phần tử âm lớn nhất, nhỏ nhất trong mảng
 * +Tìm phần tử dương lớn nhất, nhỏ nhất trong mảng
 * +In ra các phần tử chẵn, lẻ
 * +Thêm một phần tử theo index
 * +Xóa một phần tử theo index
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 12/12/2021
 * Version: 1.0
 * */
public class Cau13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = inputNum(scan);
		int[] arr = creatArray(scan, n);
		printArray(arr);
		float average = calculateAverage(arr);
		int indexMaxNum = findMaxNum(arr);	
		int indexMinNum = findMinNum(arr);		
		int indexMaxNegativeNum = findMaxNegativeNum(arr, indexMinNum);	
		int indexMinNegativeNum = findMinNegativeNum(arr, indexMinNum);
		int indexMaxPositiveNum = findMaxPositiveNum(arr, indexMaxNum);
		int indexMinPositiveNum = findMinPositiveNum(arr, indexMaxNum);
		printEvenNum(arr);
		printOddNum(arr);	
		arr = addNumByIndex(scan, arr);
		System.out.print("Mảng sau khi thêm: ");
		printArray(arr);		
		arr = removeNumByIndex(scan, arr);
		System.out.print("Mảng sau khi xóa: ");
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

	public static float calculateAverage(int[] arr) {
		float sum = 0;
		for (int item : arr) {
			sum += item;
		}
		System.out.println("Giá trị trung bình: " + (sum / arr.length));
		return sum /= arr.length;
	}

	public static int findMaxNum(int[] arr) {
		int indexMax = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[indexMax]) {
				indexMax = i;
			}
		}
		System.out.println("Phần tử lớn nhất: " + arr[indexMax]);
		return indexMax;
	}

	public static int findMinNum(int[] arr) {
		int indexMin = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[indexMin]) {
				indexMin = i;
			}
		}
		System.out.println("Phần tử nhỏ nhất: "+ arr[indexMin]);
		return indexMin;
	}

	public static int findMaxNegativeNum(int[] arr, int indexMin) {
		if (arr[indexMin] >= 0) {
			System.out.println("Không có phần tử âm lớn nhất");
			return -1;
		}
		int indexMaxNegative = indexMin;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[indexMaxNegative] && arr[i] < 0) {
				indexMaxNegative = i;
			}
		}
		System.out.println("Phần tử âm lớn nhất: " + arr[indexMaxNegative]);		
		return indexMaxNegative;
	}

	public static int findMinNegativeNum(int[] arr, int indexMin) {
		if (arr[indexMin] >= 0) {
			System.out.println("Không có phần tử âm nhỏ nhất");
			return -1;
		}
		System.out.println("Phần tử âm nhỏ nhất: "+ arr[indexMin]);
		return indexMin;
	}

	public static int findMaxPositiveNum(int[] arr, int indexMax) {
		if (arr[indexMax] <= 0) {
			System.out.println("Không có phần tử dương lớn nhất.");
			return -1;
		}
		System.out.println("Phần tử dương lớn nhất: " + arr[indexMax]);
		return indexMax;
	}

	public static int findMinPositiveNum(int[] arr, int indexMax) {
		if (arr[indexMax] <= 0) {
			System.out.println("Không có phần tử dương nhỏ nhất");
			return -1;
		}
		int indexMinPositiveNum = indexMax;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[indexMinPositiveNum] && arr[i] > 0) {
				indexMinPositiveNum = i;
			}
		}
		System.out.println("Phần tử dương nhỏ nhất: " + arr[indexMinPositiveNum]);
		return indexMinPositiveNum;
	}
	
	public static void printEvenNum(int[] arr) {
		System.out.print("Các phần tử chẵn: ");
		for (int item: arr) {
			if (item %2 == 0) {
				System.out.print(item +"\t");
			}
		}
		System.out.println("\t");
	}
	public static void printOddNum(int[] arr) {
		System.out.print("Các phần tử Lẻ: ");
		for (int item: arr) {
			if (item %2 != 0) {
				System.out.print(item +"\t");
			}
		}
		System.out.println("\t");
	}
	
	public static int[] addNumByIndex(Scanner scan,int[] arr) {
		System.out.println("Thêm một phần tử theo index:");
		System.out.print("Nhập index: ");
		int addIndex = Integer.parseInt(scan.nextLine());
		while (addIndex <0 || addIndex >arr.length-1) {
			System.out.println("Vui lòng nhập index hợp lệ... (từ 0 đến " + (arr.length-1) +")");
			addIndex= Integer.parseInt(scan.nextLine());
		}
		System.out.print("Nhập giá trị phần tử muốn thêm: ");
		int addNum = Integer.parseInt(scan.nextLine());
		int[] subArr = new int[arr.length+1];
		for (int i = 0,j = 0; i< arr.length; i++,j++) {
			if (i == addIndex) {
				subArr[j++] = addNum;
			}
				subArr[j] = arr[i];
		}
		return subArr;
	}
	
	public static int[] removeNumByIndex(Scanner scan,int[] arr) {
		System.out.println("Xóa một phần tử theo index:");
		System.out.print("Nhập index: ");
		int removeIndex = Integer.parseInt(scan.nextLine());
		while (removeIndex <0 || removeIndex >arr.length-1) {
			System.out.println("Vui lòng nhập index hợp lệ... (từ 0 đến " + (arr.length-1) +")");
			removeIndex= Integer.parseInt(scan.nextLine());
		}
		
		int[] subArr = new int[arr.length-1];
		for (int i = 0,j = 0; j< subArr.length; i++,j++) {
			if (i == removeIndex) {
				subArr[j] = arr[++i];
			}else {
				subArr[j] = arr[i];				
			}
		}
		return subArr;
	}
}
