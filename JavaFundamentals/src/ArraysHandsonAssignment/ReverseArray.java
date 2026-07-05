package ArraysHandsonAssignment;

public class ReverseArray {
	public static void main(String[] args) {
		if(args.length<4&&args.length%2==0) {
			 System.out.println("Please enter "+args.length+" integer numbers");
	         return;
		}
		int[][] arr=new int[2][2];
		int k=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
			arr[i][j]=Integer.parseInt(args[k++]);
			}
		}
		System.out.println("The given arr is: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=1;i>=0;i--) {
			for(int j=1;j>=0;j--) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
