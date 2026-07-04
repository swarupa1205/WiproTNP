package FlowControlStatement;

public class Characterchanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=args[0].charAt(0);
		if(ch>='a'&& ch<='z') {
			System.out.println(ch + "->" + Character.toUpperCase(ch));
		}else if(ch>='A' && ch<='Z') {
			System.out.println(ch + "->" + Character.toLowerCase(ch));
		}else {
			System.out.println("Invalid input");
		}
	}

}
