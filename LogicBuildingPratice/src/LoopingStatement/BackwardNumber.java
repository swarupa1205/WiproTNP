package LoopingStatement;

import java.util.Scanner;

public class BackwardNumber {
	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=0;i--) {
			System.out.println(i);
		}
		
	}
}
