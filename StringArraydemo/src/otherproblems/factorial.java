package otherproblems;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter num");
		int n=sc.nextInt();
		int fact=1;
		for (; n>0; n=n-1) {
			fact=fact*n;
		}
		System.out.println(fact);
	}

}