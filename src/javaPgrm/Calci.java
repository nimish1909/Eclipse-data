package javaPgrm;

public class Calci {

	public static void main(String[] args) {
		Calculator cl=new Calculator() {
			
			@Override
			public void sub(int a, int b) {
				System.out.println(a-b);		
			}
			
			@Override
			public void mul(int a, int b) {
				System.out.println(a*b);
				
			}
			
			@Override
			public void div(int a, int b) {
				System.out.println(a/b);
				
			}
			
			@Override
			public void add(int a, int b) {
				System.out.println(a+b);
				
			}
		};
		
		cl.add(10, 20);
		cl.sub(30, 10);
		cl.mul(10, 5);
		cl.div(50, 5);

	}

}
