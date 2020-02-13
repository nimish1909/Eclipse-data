package javaPgrm;

import java.util.HashMap;
import java.util.Scanner;

public class RepetedChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("Enter String");
	    String str = sc.nextLine();
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		char[]ch=str.toCharArray();
		for (char c : ch) {
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);
			}
			else {
				hs.put(c, 1);
			}
		
			}
		for (char c : ch) {
			if(hs.get(c)>1)
				System.out.print(c);	
			
		}
		

	}

}
