

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int a[]= {2,43,4,5,6,9};
		
		int search_element=5;
		boolean flag = false;
		
		for(int i=0;i< a.length;i++) {
			
			if(a[i]==search_element) {
				
				System.out.println("Element Found");
				flag=true;
				break;
			}
			
			
		}
		
		if(flag==false) {
			
			System.out.println("Element not found");
		}
		
		
	}
	

}
