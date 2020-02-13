package javaPgrm;

import java.util.Scanner;

public class ReversewordsInString 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String str=sc.nextLine();
		sc.close();
		
		String[] s = str.split("\\s");
		
		for (int i = 0; i < s.length; i++) 
		{
			//String st="";
			char[] ch=s[i].toCharArray();
			for (int j = s[i].length()-1; j >=0; j--) 
			{
				//st=st+ch[j];
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		
	}
}
