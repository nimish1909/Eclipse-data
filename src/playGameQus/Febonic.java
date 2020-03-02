package playGameQus;

import java.util.Scanner;

public class Febonic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		for (int i =1; i <num;i++) {
			System.out.print(a+" ");
			int sum=a+b;
			a=b;
			b=sum;
		}
		sc.close();
	}

 }
