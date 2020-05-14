

public class SumArray {
	
	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,7,9,18,16};
		int sum=0;
		
//		for(int i=0;i<a.length;i++) {
//			
//			sum = sum +a[i];	
//			
//		}
		
		//Enhanced For loop
		for(int value:a) {
			
			
			sum = sum + value;
		}
		
		System.out.println(sum);
	}

}
