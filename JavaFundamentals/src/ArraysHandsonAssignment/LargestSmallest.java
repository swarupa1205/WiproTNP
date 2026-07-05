package ArraysHandsonAssignment;
import java.util.Arrays;
public class LargestSmallest {
	public static void main(String[] args) {
		int[] arr = {10, 5, 80, 30, 2, 50};

        Arrays.sort(arr);

        System.out.println("Smallest two numbers:");
        System.out.println(arr[0] + " " + arr[1]);

        System.out.println("Largest two numbers:");
        System.out.println(arr[arr.length - 2] + " " + arr[arr.length - 1]);
	}
}
