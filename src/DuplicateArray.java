

import java.util.HashSet;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int a[] = {5,1,9,3,9,6};
		
//		boolean flag = false;
//		
//		for(int i=0;i<a.length;i++) {
//
//			
//			for( int j=i+1; j<a.length;j++) {
//				
//				if(a[i]==a[j]) {
//					
//					System.out.println(a[i] + "is duplicate");
//					flag=true;
//				}
//	
//			}
//	
//		}
//		
//		if(flag==false) {
//			
//			System.out.println("No duplicate element found");
//		}
		
		
		HashSet<Integer> hs = new HashSet();
		
//		for(int i=0;i< a.length;i++) {
		
		for(int l :a) {
			
			if(!hs.add(l)) {
				
				System.out.println(l + "is duplicate");
			}
			
		}
		
		
	}

}
