package Day2;

import java.util.Scanner;

public class Greaternumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<b) {
			System.out.println(b+" is greater number");
		}else {
			System.out.println(a+" is greater number");
		}
	}
}
