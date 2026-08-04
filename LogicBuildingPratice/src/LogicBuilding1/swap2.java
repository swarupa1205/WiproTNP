package LogicBuilding1;

import java.util.Scanner;

public class swap2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int temp=a;
		a=b;
		b=c;
		c=temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
