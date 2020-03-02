package arryPgrm;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String");
		String write = input.nextLine();
		StringBuffer a=new StringBuffer(write);
		System.out.println(a.reverse());
		input.close();
	}

}
