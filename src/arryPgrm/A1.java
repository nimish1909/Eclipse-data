package arryPgrm;

import java.util.Arrays;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		int sum=0;
		int a[]= new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			}
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		sc.close();

	}

}
