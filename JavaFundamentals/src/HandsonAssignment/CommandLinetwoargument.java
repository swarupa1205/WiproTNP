package HandsonAssignment;

public class CommandLinetwoargument {
	public static void main(String[] args) {
		if (args.length == 2) {
			System.out.println(args[0] + " Technologies " + args[1]);
		} else {
			System.out.println("Please pass exactly 2 arguments");
		}
	}
}
