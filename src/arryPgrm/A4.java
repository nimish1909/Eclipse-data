package arryPgrm;

import java.util.Arrays;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
	int a[]=new int[6];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Arrays");
     for (int i = 0; i < a.length; i++) {
    	  a[i] =sc.nextInt();
	}
     /**
      * This Methods use for Sorting array
      */
     int temp=0;
     for (int i = 0; i < a.length-1; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j]) //sort in descending order
			{
		     temp=a[i];
		     a[i]=a[j];
		     a[j]=temp;
		  }
	    }
      }
     System.out.println(Arrays.toString(a));
     System.out.print(a[0]);
     sc.close();
	}
}

