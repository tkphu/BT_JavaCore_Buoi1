import java.util.Scanner;

/*
 * Mục đích: In ra độ dài chuỗi, in ra ký tự (char) tại một vị trí nhất định (index)
 * Kiểm tra xem chuỗi vừa nhập có chuỗi phụ "abcdef" hay không.
 * */
public class Cau15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String subChain = "abcdef";
		String word = inputWord(scan);
		printBusiness(scan, word, subChain);
	}

	public static String inputWord(Scanner scan) {
		System.out.print("Mời nhập chuỗi: ");
		String word = scan.nextLine();
		return word;
	}

	public static void printBusiness(Scanner scan,String word,String subChain) {
		System.out.println("Độ dài của chuỗi: " + word.length());
		printCharInIndex(scan, word);
		checkSubChain(word, subChain);

	}
	public static void printCharInIndex(Scanner scan, String word) {
		System.out.print("Nhập index: ");
		int index = Integer.parseInt(scan.nextLine());
		while (index <0 || index >word.length()-1) {
			System.out.println("Vui lòng nhập index hợp lệ... (từ 0 đến " +(word.length()-1) +")");
			index= Integer.parseInt(scan.nextLine());
		}
		System.out.println("Tại index = "+ index +", ký tự là: " + word.charAt(index));
	}
	
	public static void checkSubChain(String word, String subChain) {
		if (word.contains(subChain)) {
			System.out.println("Chuỗi vừa nhập có chứa chuỗi phụ " + subChain);
		}else {
			System.out.println("Chuỗi vừa nhập không có chứa chuỗi phụ");
		}
	}
}
