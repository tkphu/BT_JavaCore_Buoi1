import java.util.Scanner;
public class Cau8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		String mainWord = "";
		String specialCharactersString = " !@#$%&*()'+,-./:;<=>?[]^_`{|}";
		word = inputWord(scan);
		mainWord += toUpperCase(word, 0);
		for (int i = 1; i < word.length(); i++) {
			if (isSpecialCharacter(word.charAt(i-1), specialCharactersString)) {
				mainWord += toUpperCase(word, i);
			}else {
				mainWord += word.charAt(i);
			}
		}
		System.out.println(mainWord);
	}

	public static String inputWord(Scanner scan) {
		System.out.print("Mời nhập chuỗi: ");
		String word = scan.nextLine();
		return word;
	}

	public static String toUpperCase(String word, int i) {
		String letters = "";
		letters += word.charAt(i);
		letters = letters.toUpperCase();
		return letters;
	}
	
	public static boolean isSpecialCharacter(char word, String specialCharacterString) {
		String word2 ="";
		word2 += word;
		if (specialCharacterString.contains(word2)) {
			return true;
		}
		return false;
	}
}
