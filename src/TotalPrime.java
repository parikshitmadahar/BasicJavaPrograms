

import java.util.Scanner;

public class TotalPrime {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int number=0;

		for(int i=1;i<=num;i++) {
			int count =0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					
					count++;						
				}
			}
			
			if(count==2) {
				
				number++;	
			}		
		}
		
		System.out.println(number);
		
		
	}

}
