package javaPgrm;

import java.util.Scanner;

public class Arrydata {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		  int str = sc.nextInt();
		int arr[]= {1,5,8};
		String number="";
		for (int i = 0; i < arr.length; i++) {
			number=number+arr[i];
		    }
		//System.out.print(number);	
     int num=Integer.parseInt(number);
     int total = num+str;
     System.out.println(total);
   String cString=""+total;
   String[] starr = cString.split("");
   int b[]=new int[starr.length];
     for (int i = 0; i < b.length; i++) {
		b[i] = Integer.parseInt(starr[i]);
		System.out.print(b[i]);
	}
     sc.close();
	}

}

