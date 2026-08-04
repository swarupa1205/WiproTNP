package LogicBuilding1;

import java.util.Scanner;

public class MarkEvalution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			int marks=sc.nextInt();
			if(marks>=35) {
				count++;
			}	
		}
		System.out.println(count);

	}
}
