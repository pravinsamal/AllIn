package demo;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		
		int[] a=new int[10];
		
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<a.length; i++  ) {
			System.out.println("enter number");
			a[i]=sc.nextInt();
		}
		for (int j=0; j<a.length; j++) {
			System.out.print(a[j]);
		}
	
			
		
	}
}
