package LogicBuildingPratice2;

import java.util.Scanner;

public class DicimalConverstion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] digit=new int[32];
		int i=0;
		while(n!=0) {
			digit[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(digit[j]);
		}
	}
}
