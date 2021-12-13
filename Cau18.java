import java.util.Scanner;

/*
 * Mục đích: Tính và in ra số năm ít nhất anh X phải đợi kể từ năm gởi tiền
 * Giả sử lãi suất tiết kiêm không đổi, anh X không rút bớt tiền và cũng không gởi thêm tiền
 * trong thời gian chờ đợi.
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 13/12/2021
 * Version: 2.0
 * */
public class Cau18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("***********Chương trình tính tiền gửi tiết kiệm***********");
		long deposit = inputDeposit(scan);
		long desire = inputDesire(scan);
		float interest = inputInterest(scan);
		int waitTime = calculateWaitTime(deposit, desire, interest);
		printResult(deposit, desire, interest, waitTime);
	}

	public static long inputDeposit(Scanner scan) {
		System.out.print("Nhập số tiền gửi (Đồng): ");
		long deposit = Long.parseLong(scan.nextLine());
		while (deposit <= 0) {
			System.out.println("Vui lòng nhập số tiền hợp lệ ( lớn hơn 0 )...");
			deposit = Long.parseLong(scan.nextLine());
		}
		return deposit;
	}

	public static float inputInterest(Scanner scan) {
		System.out.print("Nhập tiền lãi (%) : ");
		float interest = Float.parseFloat(scan.nextLine());
		return interest;
	}

	public static long inputDesire(Scanner scan) {
		System.out.print("Nhập số tiền muốn có trong tương lai (Đồng): ");
		long desire = Long.parseLong(scan.nextLine());
		return desire;
	}

	public static int calculateWaitTime(long deposit, long desire, float interest) {
		int waitTime = 0;
		float interestRate = interest / 100;
		while (deposit < desire) {
			deposit += deposit * interestRate;
			waitTime++;
			System.out.println("Năm thứ " + waitTime + " Được " + deposit + " Đồng");
		}
		return waitTime;
	}

	public static void printResult(long deposit, long desire, float interest, int waitTime) {
		System.out.println("Số tiền gửi: " + deposit + " Đồng");
		System.out.println("Số tiền mong muốn: " + desire + " Đồng");
		System.out.println("Tiền lãi: " + interest + "%");
		System.out.println("Số năm phải đợi là: " + waitTime + " Năm");
	}

}
