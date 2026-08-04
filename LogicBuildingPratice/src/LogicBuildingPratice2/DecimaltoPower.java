package LogicBuildingPratice2;

import java.util.Scanner;

public class DecimaltoPower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int decimal=0;
		int power=0;
		while(n!=0) {
			int digit=n%10;
			decimal+=digit*Math.pow(2,power);
			power++;
			n=n/10;
			
		}
		System.out.println(decimal);
	}
}
