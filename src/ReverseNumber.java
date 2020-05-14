

public class ReverseNumber {

	public static void main(String[] args) {
	
		int num = 1001;
		int orgNum = num;
		int rev = 0, rem;
		
		while(num!=0) {
			
			rem=num%10;
			
			rev = rev*10+rem;
			
			num = num/10;
			
		}
		
		System.out.println(rev);	
		
		
		if(orgNum==rev) {
			
			System.out.println("number is palindrome");
		}
		else {
			
			System.out.println("number is not palindrome");
		}
		
////		StringBuffer sb = new StringBuffer(String.valueOf(num));
////		
////		StringBuffer rev = sb.reverse();
////		
////		System.out.println(rev);
//		
//		
//		
//		StringBuilder sb = new StringBuilder(String.valueOf(num));
//		StringBuilder rev = sb.reverse();
//		
//		System.out.println(rev);
		
	}
	
	

}
