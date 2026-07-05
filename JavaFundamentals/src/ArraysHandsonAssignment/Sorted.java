package ArraysHandsonAssignment;

import java.util.Arrays;

public class Sorted {
	public static void main(String[] args) {
		int[] arr= {35,39,50,49,2,3};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
