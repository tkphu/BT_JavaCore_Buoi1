import java.util.Scanner;

/*
 * Mục đích: In ra chuỗi theo thứ tự ngược lại của chuỗi nhập vào
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 12/12/2021
 * Version: 1.0
 * */
public class Cau6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		String reserveWord;
		System.out.println("Chương trình in ra chuỗi theo thứ tự ngược lại của chuỗi nhập vào.");
		word = inputWord(scan);
		reserveWord = reserveWord(word);
		System.out.println("Chuỗi đảo ngược: "+ reserveWord);
	}

	public static String inputWord(Scanner scan) {
		System.out.print("Mời nhập chuỗi: ");
		String word = scan.nextLine();
		return word;
	}
	public static String reserveWord(String word) {
		String reserveWord ="";
		for (int i = word.length() -1; i>=0;i--) {
			reserveWord += word.charAt(i);
		}
		return reserveWord;
	}
}
