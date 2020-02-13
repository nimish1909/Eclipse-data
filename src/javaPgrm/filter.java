package javaPgrm;

import java.util.Comparator;


public class filter{

	public filter(String sortByName1,String sortById1,String sortBySalary1 ) {
	 new Comparator<Emp>() {
			
			 @Override
				public int compare(Emp o1,Emp o2) {
					return o1.getName().compareTo(o2.getName());
					//return o1.getId()-o2.getId();
				}
		 };
	new Comparator<Emp>() {
		   public int compare(Emp o1,Emp o2) {
			return o1.getId()-o2.getId();
		  }
		 };
	new Comparator<Emp>() {
			   public int compare(Emp o1,Emp o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			  }
			 };
		
	}

}
