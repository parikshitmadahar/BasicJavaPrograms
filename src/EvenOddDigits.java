

public class EvenOddDigits {
	
	public static void main(String[] args) {
		
		int num = 12346;
		int evenCount = 0, oddCount = 0;
		
		
		while(num>0) {
			
			int rem = num%10;
			
			if(rem%2==0) {
				
				evenCount++;
						
			}
			else {
				
				oddCount++;
			}
			
			num = num/10;
			
			
		}
		
		System.out.println("In given Number, Even Count is :" + evenCount + "and odd count is: " + oddCount);
		
		
	}

}
