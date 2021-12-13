
import java.util.Arrays;
import java.util.Scanner;

/*
 * Mục đích: Nhập vào tọa độ A(xA,yA) và B(xB,yB) trên hệ trục tọa độ Oxy. Tính và in ra độ dài đoạn thẳng AB
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 12/12/2021
 * Version: 1.0
 * */

public class Cau5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A;
		int[] B;
		float segmentAB;
		System.out.println("Chương trình tính độ dài đoạn thẳng A và B trên hệ trục tọa độ 0xy");
		System.out.println("Nhập tọa độ A(xA,yA): ");
		A = inputCoordinates(scan);
		System.out.println("Nhập tọa độ B(xB,yB): ");
		B = inputCoordinates(scan);
		System.out.println("Với A" + Arrays.toString(A) + "\t" + "B" + Arrays.toString(B));
		segmentAB = calculateSegment(A, B);
		System.out.println("Độ dài đoạn thẳng AB = " + segmentAB);
	}

	public static int[] inputCoordinates(Scanner scan) {
		int[] point = new int[2];
		System.out.print("x = ");
		point[0] = Integer.parseInt(scan.nextLine());
		System.out.print("y = ");
		point[1] = Integer.parseInt(scan.nextLine());
		return point;
	}

	public static float calculateSegment(int[] pointA, int[] pointB) {
		float segmentAB;
		segmentAB = (float) Math.sqrt(Math.pow(pointB[0] - pointA[0], 2) + Math.pow(pointB[1] - pointA[1], 2));
		return segmentAB;

	}
}
