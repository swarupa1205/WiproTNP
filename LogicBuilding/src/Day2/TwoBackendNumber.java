package Day2;

import java.util.Scanner;

public class TwoBackendNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=0;i-=2) {
			System.out.println(i);
		}
	}
}
