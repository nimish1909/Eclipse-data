package playGameQus;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array");
		for (int i = 0; i < a.length; i++) {
			if (a[i]>=0) {
			a[i]=sc.nextInt();	
			   }
		     }
			for (int j = 0; j < a.length-1; j++) {
				for (int j2 = j+1; j2 < a.length; j2++) {
					if ((a[j]+a[j2])%2==0) {
						System.out.println("["+a[j]+" "+a[j2]+"]");
						
					}
//					else if((a[j]+a[j2])%2==1) {
//						System.out.print("["+a[j]+" "+a[j2]+"]");
//					}
				}
			}
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if ((a[i]+a[j])%2==1) {
						System.out.print("["+a[i]+" "+a[j]+"]");
						
					}
				}
			}
			sc.close();
			
		}
		

	}
