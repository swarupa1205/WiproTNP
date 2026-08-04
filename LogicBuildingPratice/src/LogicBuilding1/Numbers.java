package LogicBuilding1;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nonnegitive=0;
		int negitive=0;
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			int n=sc.nextInt();
			if(n<0) {
				negitive++;
			}else {
				nonnegitive++;
			}
		}
		System.out.println(negitive);
		System.out.println(nonnegitive);
	}
}
