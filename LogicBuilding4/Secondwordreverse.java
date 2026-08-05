package LogicBuilding4;

import java.util.Scanner;

public class Secondwordreverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String result="";
		int n=str2.length()-1;
		for(int i=n;i>=0;i--) {
			char ch=str2.charAt(i);
			result+=ch;
		}
		System.out.println(str1+result);
	}
}
