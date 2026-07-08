package Day2Day3Day4;
import java.util.Scanner;
public class Functionodd {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		odd(n);
	}
	static void odd(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
