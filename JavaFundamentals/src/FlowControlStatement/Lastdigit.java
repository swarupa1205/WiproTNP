package FlowControlStatement;

public class Lastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a%10==b%10) {
			System.out.println("Ture");
		}else {
			System.out.println("False");
		}
	}

}
