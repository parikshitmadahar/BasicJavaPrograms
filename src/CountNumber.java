

import java.util.Scanner;

public class CountNumber {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		
		int num = scan.nextInt();
		int count = 0;
		
		while(num!=0) {
			
			num = num/10;
			count++;
			
		}
		
		System.out.println(count);
		
	}

}
