package javaPgrm;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashsetlist {

	public static void main(String[] args) {
	HashSet<Object>hs=new HashSet<Object>();
	hs.add(133);
	hs.add("dpk");
	hs.add("data");

	ArrayList<Object>ar=new ArrayList<Object>(hs);
//	for (Object object : ar) {
//		System.out.println(object);
//	} 

	for (int i = 0; i < ar.size(); i++) {
		System.out.println(ar);
	}
	

	}

}
