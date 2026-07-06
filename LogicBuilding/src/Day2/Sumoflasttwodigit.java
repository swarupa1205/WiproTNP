package Day2;

import java.util.Scanner;

public class Sumoflasttwodigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=last(a);
		int d=last(b);
		System.out.println(c+d);
	}
	static int last(int n) {
        return Math.abs(n % 10);
    }
}
