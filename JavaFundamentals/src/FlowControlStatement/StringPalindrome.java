package FlowControlStatement;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}
