package Day2;

import java.util.Scanner;

public class sumEvenorodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		if(c%2==0) {
			System.out.println("Sum is even");
		}else {
			System.out.println("Sum is odd");
		}
	}
}
