package LogicBuildingPratice3;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] marks=new int[30];
		int[] count=new int[101];
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
			if(marks[i]>=0 && marks[i]<=100) {
				count[marks[i]]++;
			}else {
				System.out.println("Invalid marks");
				i--;
			}
		}
		for(int i=0;i<=100;i++) {
			if(count[i]!=0) {
				System.out.println(i+"\t"+count[i]);
			}
		}
	}
}
