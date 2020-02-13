package javaPgrm;

import java.util.Scanner;

public class RemoveChar {
	
	public static String removeChar(String str, char ch) {
		if(str==null);
		
		return str.replaceAll(Character.toString(ch),"");
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.print("Enter the Char to Remove");
		char chr=sc.next().charAt(0);
		sc.close();
		String removed = removeChar(str,chr);
        System.out.println(removed);

	}

}
