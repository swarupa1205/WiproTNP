package FlowControlStatement;

public class Sumofalldigits {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum+=digit;
			n=n/10;
		}
		System.out.println(sum);
	}
}
