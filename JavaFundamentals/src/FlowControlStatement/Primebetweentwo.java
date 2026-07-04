package FlowControlStatement;

public class Primebetweentwo {
	public static void main(String[] args) {
		int start=Integer.parseInt(args[0]);
		int end=Integer.parseInt(args[1]);
		for(int n=start;n<=end;n++) {
			if(n<=1) 
				continue;
			boolean isPrime=true;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.printf(n+" is Prime. ");
			}
		}
	}
}
