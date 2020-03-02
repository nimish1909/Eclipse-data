package arryPgrm;

public class A5 {

	public static void main(String[] args) {
		String str="Deepak Tiwari";
		String s2="";
		for (int i =0; i < str.length()-1; i++) {
		for (int j = 0; j < str.length(); j++) {
			
			char s1 = str.charAt(0);
			     s2 = str.substring(1);
			     s2=s2+s1;
		      }
			System.out.println(s2);
		  }
			
	    }
    }

