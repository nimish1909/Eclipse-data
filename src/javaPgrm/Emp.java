package javaPgrm;

import java.util.Comparator;

public class Emp {
	private int id;
	private String Name;
	private double Salary;

 public static Comparator<Emp> sortByName=new Comparator<Emp>() {
	
	 @Override
		public int compare(Emp o1,Emp o2) {
			return o1.getName().compareTo(o2.getName());
			//return o1.getId()-o2.getId();
		}
 };
 public static Comparator<Emp> sortById=new Comparator<Emp>() {
   public int compare(Emp o1,Emp o2) {
	return o1.getId()-o2.getId();
  }
 };
 public static Comparator<Emp> sortBySalary=new Comparator<Emp>() {
	   public int compare(Emp o1,Emp o2) {
		return (int) (o1.getSalary()-o2.getSalary());
	  }
	 };


	public Emp(int id, String name, double Salary) {
		this.id=id;
		this.Name=name;
		this.Salary=Salary;
}

	
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public double getSalary() {
		return Salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", Name=" + Name + ", Salary=" + Salary+ "]";
	}
   

}
