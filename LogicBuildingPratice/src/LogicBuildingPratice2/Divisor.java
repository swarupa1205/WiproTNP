package LogicBuildingPratice2;

import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=1) {
			System.out.println("No divisor other than one");
		}
		if(n%2==0) {
			System.out.println("2");
		}
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(n);
	}
}
