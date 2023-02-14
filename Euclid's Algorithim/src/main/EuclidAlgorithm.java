package main;
import java.util.Scanner;

public class EuclidAlgorithm {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	int a, b, gcd;
	int c, remainder;
	int greaterInt = 0, lesserInt =0;
	System.out.print("Enter First #: ");
	a = input.nextInt();
	
	System.out.print("Enter Second #: ");
	b = input.nextInt();
	
	
	if(a >= b){
		greaterInt = a;
		lesserInt = b; 
	} else if(b >= a) {
		greaterInt = b;
		lesserInt = a;
	}
	gcd = lesserInt;

	while(greaterInt % lesserInt != 0) {
		c = greaterInt/lesserInt;
		gcd = greaterInt % lesserInt;
		greaterInt = lesserInt;
		lesserInt = gcd;
		
	}
	System.out.print(gcd);
	}
}

