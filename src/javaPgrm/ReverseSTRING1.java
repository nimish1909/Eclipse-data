package javaPgrm;

import java.util.Scanner;

public class ReverseSTRING1 {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = SC.nextLine();
		SC.close();
		char[] ch=st.toCharArray();
		

		for (int i=ch.length-1;i>=0;i--) 
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		
		String s=ReverseSTRING1.reverseString(st);
		System.out.println(s);

	}
	
	public static String reverseString(String st)
	{		
		char[] ch=st.toCharArray();
		String s="";
		for (int i=ch.length-1;i>=0;i--) 
		{
			s=s+ch[i];
		}
		return s;
	}

}
