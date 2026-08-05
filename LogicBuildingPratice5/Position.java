package LogicBuildingPratice5;

import java.util.Scanner;

public class Position {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int first=-1;
		int last=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==max) {
				if(first==-1) {
				first=i+1;}
				last=i+1;
			}
		}
		System.out.println(first+""+last);
	}
}
