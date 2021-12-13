import java.util.Scanner;

/*
 * Mục đích: Cho máy tạo 1 số ngẫu nhiên từ 1-1000. Người dùng sẽ đoán và nhập, nếu đúng với kết quả máy
 * game sẽ dừng. Ngược lại máy sẽ báo bạn cần nhập số lớn hơn hoặc nhỏ hơn số bí mật
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 13/12/2021
 * Version: 1.0
 * */
public class Cau17 {
	final static byte MIN = 1;
	final static short MAX = 1000;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Trò chơi đoán số bí mật");
		startGame(scan);	
	}

	public static void startGame(Scanner scan) {
		System.out.println("Máy đã tạo ra một con số bí mật!");
		short random = (short) (Math.random() * (MAX - MIN + 1) + MIN);
		boolean bingo = false;
		short num;
		short count = 0;
		while (!bingo) {
			num = inputNum(scan);
			if (num!= random) {
				printHint(random, num);
				count++;
			}else {
				count++;
				bingo = true;
			}
		}
		System.out.println("Bingo! Con số bí mật là: " + random);
		System.out.println("Số lần bạn đoán: " + count);
	}
	public static short inputNum(Scanner scan) {
		System.out.print("Mời bạn đoán: ");
		short num = Short.parseShort(scan.nextLine());
		while(num <MIN || num > MAX) {
			System.out.print("Số bí mật chỉ từ 1-1000 thôi...");
			System.out.println("Nhập lại đi!");
			num = Short.parseShort(scan.nextLine());
		}
		return num;
	}
	
	public static void printHint(short random, short num) {
		if (num > random) {
			System.out.println("Nhỏ hơn nữa!");
		}
		if(num < random) {
			System.out.println("Lớn hơn nữa!");
		}
	}
}
