package week1.day1;

public class PrimeNumber {
	public static void main(String [] args) {
		int n=13;
		boolean prime = false;
		for (int i=2; i<n;)
		{
			if (n%i == 0)
				prime = true;
			break;
		}
		if(!prime)
		System.out.println(n + " is a Prime Number");
		
		else
			
			System.out.println(n + " is not a Prime Number");
	}
	

}
