package arryPgrm;

import java.util.Arrays;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array");
		for (int j = 0; j < a.length; j++) {
			a[j]=sc.nextInt();	
		}
		 int tmp=0;
		for (int i = 0; i < a.length-1; i++) {
	        for (int j = i+1; j < a.length; j++) {
	            if (a[i] >a[j]) //sort in ascending order
	            	{
	                tmp = a[i];
	                a[i] = a[j];
	                a[j] = tmp;
	            }  
	        }
		}
		String sort = Arrays.toString(a);
	      System.out.println(sort);
		System.out.print(a[0]);
		sc.close();
	}
	
}
