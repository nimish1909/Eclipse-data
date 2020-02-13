package javaPgrm;

public class BtoD {
	
		static int power(int num,int p) {
			int prod=1;
			while(p>0) {
				prod=prod*num;
				p--;
			}
			return prod;
		}
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		int num=1010;
		while(num>0) {
			int digit = num%10;
			sum=sum+digit*power(2,i);
		    
			num=num/10;
			i++;
		  }
		
		System.out.println(sum);

	}

}
