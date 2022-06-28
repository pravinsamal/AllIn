package otherproblems;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ");
		int n=sc.nextInt();
	int count =0;
		for (int a=1; a<=n; a++) {
			if (n%a==0) {
				count =count+1;
			}
		
				
		}
		if(count==2)
			System.out.println("prime num");
		else
			System.out.println("not prime");
	
	}
}
