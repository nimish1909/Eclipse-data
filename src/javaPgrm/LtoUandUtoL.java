package javaPgrm;

import java.util.Scanner;

public class LtoUandUtoL {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the char");
		String str=sc.nextLine();
		sc.close();
		char[] ch=str.toCharArray();
		String s="";
		for (char c : ch) 
		{
			if(c>='a'&&c<='z')
			{
				s=s+(char) (c-32);
			}
			else if(c>='A'&&c<='Z')
			{
				s=s+(char) (c+32);
			}
			else {
				s=s+c;
			}
//			else {
//				s=s+(char) (c+32);
//			}
//			
		}
		System.out.println(s);
	}
	
}
