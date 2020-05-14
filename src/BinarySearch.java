

public class BinarySearch {
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		int key=2;
		
		int l=0;
		int h=a.length-1;
		boolean flag = false;
		
		while(l<=h) {
			
			int m = (l+h)/2;
			
			if(key==a[m]) {
				
				System.out.println("Element Found");
				flag=true;
				break;
			}
			
			if(key>a[m]) {

				l=m+1;
			}
			
			if(key<a[m]) {
				
				h=m-1;
			}
			
			
		}
		
		
		if(flag==false) {
			
			System.out.println("Element not found");
			
		}
		
	}

}
