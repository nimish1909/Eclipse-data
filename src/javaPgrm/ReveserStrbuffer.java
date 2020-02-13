package javaPgrm;

import java.util.Scanner;

public class ReveserStrbuffer {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		StringBuffer str = new StringBuffer(st);
		StringBuffer rvs = str.reverse();
		sc.close();
		System.out.println(rvs);
	}

}
