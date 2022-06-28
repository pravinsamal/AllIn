package demo;

public class sumOfDigit {
	public static void main(String[] args) {
		int a=scanner.input(0);
		int sum=0;
		for (; a>0; a=a/10) {
			
			
			sum=sum+a%10;
			if (sum%2==0) {
				
			}
			
		}
		System.out.println(sum);
	}

}
