package javaPgrm;

import java.util.Scanner;

public class ReverseSentence 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String str=sc.nextLine();
		sc.close();
		
		String[] s = str.split("\\s");
		for (int i = s.length-1; i>=0; i--) 
		{
			System.out.print(s[i]+" ");
		}
	}

}
