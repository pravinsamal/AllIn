package demo;

public class reverse {
 public static void main(String[] args) {
	int n=scanner.input(0);
	int rev=0;
	int q=n;
	for (; n>0; n=n/10) {
		rev=(rev*10)+n%10;
	}
	System.out.println(rev);
	if (q==rev) {
		System.out.println("palindrome");
	}
	else
		System.out.println("not");
}

}
