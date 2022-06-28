package demo;

public class fact {
	public static void main(String[] args) {
	int a=	scanner.input(0);
	int fact=1;
	for (int n=1; n<=a; n+=1) {
		fact=fact *n;
	}
	System.out.println(fact);
	}

}
