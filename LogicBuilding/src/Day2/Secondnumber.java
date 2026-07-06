package Day2;
import java.util.Scanner;
import java.lang.Math;


public class Secondnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int lastDigit = last(n);
        System.out.println(lastDigit);

        sc.close();
    }

    static int last(int n) {
    	int sum;
    	if(n>10) {
    		return -1;
    	}else {
         sum= Math.abs(n % 100);
         sum=sum/10;
         return sum;
    	}
    }
}