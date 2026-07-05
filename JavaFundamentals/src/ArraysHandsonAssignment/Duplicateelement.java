package ArraysHandsonAssignment;

public class Duplicateelement {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,10};
		for(int i=0;i<arr.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				System.out.println(arr[i]+"");
			}
		}
	}
}
