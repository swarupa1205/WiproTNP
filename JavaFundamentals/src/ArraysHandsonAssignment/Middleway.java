package ArraysHandsonAssignment;

public class Middleway {
	public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] result = new int[2];

        result[0] = a[1];
        result[1] = b[1];

        System.out.println(result[0] + " " + result[1]);

	}
}
