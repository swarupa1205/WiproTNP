package HandsonAssignment;

public class CommandLineArgument {
	public static void main(String args[]) {
        if (args.length == 1) {
            System.out.println("Welcome " + args[0]);
        } else {
            System.out.println("Please pass 1 argument");
        }
    }
}
