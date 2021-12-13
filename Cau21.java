import java.util.Scanner;

/*
 * Mục đích:  Cho 2 con kangaroo ở tren cùng 1 đường, vị trí dương. Cho x1, x2 lần lượt là địa
chỉ của kan1 và kan2; v1, v2 lần lượt là vận tốc của kan1 và kan 2.
Điều kiện: 0 <= x1 < x2 < 10000; 1 <= v1, v2 <= 10000
Sau 1 lần nhảy, vị trí 2 con kan sẽ tăng thêm bằng đúng vận tốc của từng con
Hỏi là 2 con kan có gặp nhau được hay không. Các số x1, x2, v1, v2 được nhập từ
bàn phím
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 13/12/2021
 * Version: 1.0
 * */
public class Cau21 {
	final static short MIN_POSITION = 0;
	final static short MAX_POSITION = 10000;
	final static short MIN_SPEED = 1;
	final static short MAX_SPEED = 10000;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vị trí kan1: ");
		int posX1 = inputPositionX(scan);
		System.out.print("Nhập vị trí kan2: ");
		int posX2 = inputPositionX(scan);
		System.out.print("Nhập vận tốc kan1: ");
		int speedV1 = inputSpeedV(scan);
		System.out.print("Nhập vận tốc kan2: ");
		int speedV2 = inputSpeedV(scan);
		if (isMeet(posX1, posX2, speedV1, speedV2)) {
			if (posX1==posX2 && speedV1 == speedV2) {
				System.out.println("Kan1 và kan2 đã gặp nhau ở nơi bắt đầu và cùng nhảy cạnh bên nhau đến nơi cuối cùng");
			}else {
				if (isMeetInMinMaxPos(posX1, posX2, speedV1, speedV2)) {
				}else {
					System.out.println("Kan1 và kan2 không gặp nhau được do điều kiện quãng đường, sẽ gặp nếu quãng đường đủ xa");
				}			
			}
		} else {
			System.out.println("Kan1 và kan2 sẽ không bao giờ gặp đc dù nhảy mãi mãi.");
		}

	}

	public static int inputPositionX(Scanner scan) {
		int pos = Integer.parseInt(scan.nextLine());
		while (pos < MIN_POSITION || pos >= MAX_POSITION) {
			System.out.print("Nhập lại vị trí từ " + MIN_POSITION + " đến " + MAX_POSITION + ":");
			pos = Integer.parseInt(scan.nextLine());
		}
		return pos;
	}

	public static int inputSpeedV(Scanner scan) {
		int speed = Integer.parseInt(scan.nextLine());
		while (speed < MIN_SPEED || speed >= MAX_SPEED) {
			System.out.print("Nhập lại vận tốc từ " + MIN_SPEED + " đến " + MAX_SPEED + ":");
			speed = Integer.parseInt(scan.nextLine());
		}
		return speed;
	}

	public static boolean isMeetInMinMaxPos(int posX1, int posX2, int speedV1, int speedV2) {
		boolean kan1IsFirst = kan1IsFirst(posX1, posX2);
		int count = 0;
		if (kan1IsFirst) {
			for (; posX1 < MAX_POSITION || posX2 < MAX_POSITION; posX1 += speedV1, posX2 += speedV2, count++) {
				if (posX1 <= posX2) {
					System.out.println("Kan2 đã đuổi kịp và gặp kan1 ở lần nhảy thứ " + count);
					return true;
				}
			}
		} else {
			for (; posX1 < MAX_POSITION || posX2 < MAX_POSITION; posX1 += speedV1, posX2 += speedV2, count++) {
				if (posX1 >= posX2) {
					System.out.println("Kan1 đã đuổi kịp và gặp kan2 ở lần nhảy thứ " + count);
					return true;
				}
			}
		}
		return false;

	}

	public static boolean kan1IsFirst(int posX1, int posX2) {
		if (posX1 > posX2) {
			return true;
		}
		return false;
	}

	public static boolean isMeet(int posX1, int posX2, int speedV1, int speedV2) {
		if (posX1 > posX2) {
			if (speedV1 >= speedV2) {
				return false;
			}
		} else if (posX1 < posX2) {
			if (speedV1 <= speedV2) {
				return false;
			}
		}
		return true;
	}
}
