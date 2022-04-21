package week1.day1;

public class Fibonacci {
	public static void main(String [] args) {
	
	int n=8;
	int f =0; int s= 1; 
	
	System.out.println(f);
	System.out.println(s);
	
	for (int i=3; i<=n; i++) {
		int t = f+s;
		System.out.println(t);
		f=s;
		s=t;
	}

	}

}
