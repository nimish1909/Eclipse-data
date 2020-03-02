package playGameQus;

public class Gpattern {
	public static void main(String[] args) {
		int n=5;
         for (int i = 0; i <n-1; i++) {
			for (int j = 1; j < n; j++) {
				if(i+j<=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print("");
				}	
			}
			System.out.println();
		}
	}

}
