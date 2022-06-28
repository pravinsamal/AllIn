package demo;

public class fibonacci {
	public static void main(String[] args) {
		int n=scanner.input(0);
		
		int x=0; int y=1;
		int z=0;
		int term=1;
		while (term<=n) {

			System.out.println(z);
			x=y;
			y=z;
					z=x+y;
					term++;
		}
	}

}
