package javaPgrm;

//import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetEmp {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
		
		TreeSet<Emp>ts=new TreeSet<Emp>(Emp.sortById);
		ts.add(new Emp(10,"dpk",400000));
		ts.add(new Emp(2, "kush",450000));
		ts.add(new Emp(3, "seema", 505000));
		ts.add(new Emp(4, "dipa", 500000));
		ts.add(new Emp(9, "jhaji", 500100));

		System.out.println(ts);
	}

}
