package otherproblems;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter"); 
		int n=sc.nextInt();
		int z=n;
		int rev=0;
		for(; n>0;n=n/10) {
			rev=(rev*10)+n%10;
		}
		System.out.println(rev);
		if(rev==z)
			System.out.println("number is palindrome");
		else
			System.out.println("not palindrome");
	}
}
