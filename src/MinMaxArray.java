

public class MinMaxArray {
	
	public static void main(String[] args) {
		
		int a[] = {2,4,5,6,7,8,2,3,1};
		
		int min =a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(min>a[i]) {
				
				min=a[i];
			}
		}
		
		System.out.println("minimum value in an array is :" + min);
		
		
		int max = a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(max<a[i]) {
				
				max=a[i];
			}
		}
		System.out.println("maximum value in an array is :" + max);
		
	}


}
