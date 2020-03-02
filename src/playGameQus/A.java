package playGameQus;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		int a[]=new int[6];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the arry");
		for (int i = 0; i < a.length; i++) {
			a[i]=input.nextInt();	
			}
         for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=' ';
				}
				else 
					break;
			}
         }
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
		}
	}

