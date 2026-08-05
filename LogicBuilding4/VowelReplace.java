package LogicBuilding4;

import java.util.Scanner;

public class VowelReplace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String result="";
		boolean found=false;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				result+='z';
				found=true;
			}else {
				result+=ch;
			}
		}
		if(found) {
			System.out.println(result);
		}else {
			System.out.println(str);
		}
		
	}
}
