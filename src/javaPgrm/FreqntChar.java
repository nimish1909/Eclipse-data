package javaPgrm;

import java.util.HashMap;
import java.util.Scanner;

public class FreqntChar {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=SC.nextLine();
		SC.close();
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		char[] ch = st.toCharArray();
		System.out.println(st.length());
		System.out.println(ch.length);
//		int co=0;
//		for (char c1 : ch) 
//		{
//			co++;
//		}
//		System.out.println(co);
		
		
		for (char c : ch) {
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);
			}
			else {
				hs.put(c, 1);
			}
		}
		for (char c : ch) {
			if(hs.get(c)>1) {
				System.out.print(c);
			}
			
		}

	}

}
