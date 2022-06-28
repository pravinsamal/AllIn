package otherproblems;
import java.util.Scanner;
public class Prime1toN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter num");
		int n=sc.nextInt();
		int count;
		for(int i=1; i<=n; i++) {
			count=0;
		for(int a=1; a<=i; a++) {
			if(i%a==0) {
				count=count+1;
	}
		}
		if(count==2)        
			System.out.println(i);
				}
		}
}
