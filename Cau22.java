import java.util.Scanner;

/*
 * Mục đích: Tim sub string palindromic có độ dài dài nhất.
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 13/12/2021
 * Version: 1.0
 * */
public class Cau22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String chain = inputChain(scan);
		longestPalindromicChain(chain);
	}

	public static String inputChain(Scanner scan) {
		System.out.print("Nhập chuỗi: ");
		String chain = scan.nextLine();
		return chain;
	}
	static void longestPalindromicChain(String chain) {
	    int maxLength = 1;
	    int start = 0;
	    for (int i = 0; i < chain.length(); i++) {
	        for (int j = i; j < chain.length(); j++) {
	            boolean flag = true;
	            for (int k = 0; k < (j - i + 1) / 2; k++) {
	            	if (chain.charAt(i + k) != chain.charAt(j - k))
	            		flag = false;            	
	            }
	            if (flag && (j - i + 1) > maxLength) {
	                start = i;
	                maxLength = j - i + 1;
	            }
	        }
	    }
	    if (maxLength == 1) {
	    	System.out.println("Chuỗi không có chuỗi palindromic.");
	    }else {
	    	System.out.print("Chuỗi palindromic dài nhất là: ");
	    	printPalindromicChain(chain, start, start + maxLength - 1);
	    	System.out.println("Độ dài: " + maxLength);
	    }
	}	 
	static void printPalindromicChain(String chain, int start, int end) {
	    for (int i = start; i <= end; ++i) {
	    	System.out.print(chain.charAt(i));
	    }
	    System.out.println("\t");
	}
} 
	// Driver Code
	 
