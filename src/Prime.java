

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to check prime or not :- ");
		int num = scan.nextInt();
		int count=0;
		
		if(num>1) {
			
			for(int i=1;i<=num;i++) {
				
				if(num%i==0) {
					
					count++;
					
				}
				
			}
			
			if(count==2) {
				
				System.out.println("Prime Number");
			}
			else {
				
				System.out.println("Not a Prime Number");
		
			}
			
			
			
		}
		else {
			
			System.out.println("Number is not a prime number");
		}
		
	}
	
	

}
