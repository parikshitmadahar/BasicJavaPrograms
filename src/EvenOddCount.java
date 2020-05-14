

import java.util.ArrayList;
import java.util.List;

public class EvenOddCount {
	
	public static void main(String[] args) {
		
		
		int a[]= {5,4,6,7,81,98,9,17,90};
		
		int evenNumbers=0, oddNumbers=0;
		
		List<Integer> evens = new ArrayList();
		List<Integer> odds = new ArrayList();
		
		
		for(int value:a) {
			
			if(value%2==0) {
				
				evenNumbers++;	
				evens.add(value);
			}
			else {
				
				oddNumbers++;
				
				odds.add(value);
			}
		}
		
		System.out.println("Even numbers are:- " + evenNumbers +" & odd numbers are " + oddNumbers);
		System.out.println("Even numbers in an array are" + evens);
		System.out.println("Odd numbers in an array are" + odds);
		
	}

}
