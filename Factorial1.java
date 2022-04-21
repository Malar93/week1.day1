package week1.day1;

public class Factorial1 {
	public static void main (String [] args) {
		//factorial of 5! = 5*4*3*2*1//
		int Number = 5, fact = 1;
		for (int i=1; i<=Number; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of 5 is :" +fact);
		
		}
	}


