package playGameQus;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		int ct=0,l=0,i=1,j=1;
		while(l<n) {
		j=1;
		ct=0;
		while(j<=i) {
			if(i%j==0) 
			ct++;
			j++;
		}
		if(ct==2) {
			System.out.print(i+" ");
			l++;
		}
		i++;
		sc.close();
		}

	}

}
