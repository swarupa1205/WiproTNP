package FlowControlStatement;

public class Pattern {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		if (args.length == 0) {
	        System.out.println("Please enter an interger numbers");
	        return;
	    }

		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
