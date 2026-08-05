package LogicBuildingPratice3;

import java.util.Scanner;

public class Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] marks=new int[30];
		int[] range=new int[10];
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
			if(marks[i]>=0&&marks[i]<=10) {
				range[0]++;
			}else if(marks[i]<=20) {
				range[1]++;
			}else if(marks[i]<=30) {
				range[2]++;
			}
			else if(marks[i]<=40) {
				range[3]++;
			}else if(marks[i]<=50) {
				range[4]++;
			}else if(marks[i]<=60) {
				range[5]++;
			}else if(marks[i]<=70) {
				range[6]++;
			}else if(marks[i]<=80) {
				range[7]++;
			}else if(marks[i]<=90) {
				range[8]++;
			}else if(marks[i]<=100) {
				range[9]++;
			}
		}
		System.out.println("0-10   : " + range[0]);
        System.out.println("11-20  : " + range[1]);
        System.out.println("21-30  : " + range[2]);
        System.out.println("31-40  : " + range[3]);
        System.out.println("41-50  : " + range[4]);
        System.out.println("51-60  : " + range[5]);
        System.out.println("61-70  : " + range[6]);
        System.out.println("71-80  : " + range[7]);
        System.out.println("81-90  : " + range[8]);
        System.out.println("91-100 : " + range[9]);
	}
}
