package javaPgrm;

import java.util.Scanner;

public class CountNo {
	static int a=9;
	static String s="";
public static void count(int i) {
	if(i<=a) {
		System.out.println(s+i);   
	}
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int count1 = sc.nextInt();
		count(count1);
		 sc.close();
		}
       
	}


