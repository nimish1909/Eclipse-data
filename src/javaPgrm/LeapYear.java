package javaPgrm;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	  Scanner cs=new Scanner(System.in);
	  System.out.println("enter the Year");
	  int num = cs.nextInt();
	  boolean leap = false;
	  if(num%4==0) {
		  if(num%100==0) {
			  if(num%400==0) {
				  leap=true;
			  }
			  else
				  leap=false;
		  }
		  else
			  leap=true;
	  }
	  else
		  leap=false;
	  if(leap) {
			System.out.println(num+" is a leap year");
		}
	  else
		  System.out.println(num+"is not a leap year");
	}
	
}
