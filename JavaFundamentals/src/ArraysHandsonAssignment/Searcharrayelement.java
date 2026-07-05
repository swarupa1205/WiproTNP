package ArraysHandsonAssignment;

public class Searcharrayelement {
	public static void main(String[] args) {
		int[] arr= {10,20,38,35,5};
		int k=35;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	}
}
