

public class Largestamong3 {
	
	public static void main(String[] args) {
		
		int a=50; 
		int b=77;
		int c=35;
		
		
//		if(a>b && a>c) {
//			
//			System.out.println("a is largest");
//		}
//		
//		else if(b>c && b>a) {
//			
//			System.out.println("b is largest");
//		}
//		
//		else {
//			
//			System.out.println("c is largest");
//		}
		
		//Ternary Operator
		
		int large = a>b?a:b;
		
		int largest = large>c? large:c;
		
		
		System.out.println(largest);
		
		
		
		
		
	}

}
