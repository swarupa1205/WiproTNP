package Day2Day3Day4;

import java.util.Scanner;

public class Evenfunction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		even(n);
	}
	static void even(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
