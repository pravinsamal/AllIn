package otherproblems;

import java.util.Scanner;

public class ProductOfNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter number");
		int n=sc.nextInt();
		int p=n;
		int pro=1;
		for(; n>0;n= n/10) {
			pro=pro*n%10;
			
		}
		System.out.println(pro);
		
	}

}
