package LogicBuildingPratice5;

import java.util.Scanner;

public class Positionofx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				System.out.println("position: "+(i+1));
				found=true;
				break;
			}
		}
		 if (!found) {
	            System.out.println("Element not found");
	      }
	}
}
