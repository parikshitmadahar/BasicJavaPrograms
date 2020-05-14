

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		String name = "Krsna";

//		for(int i=name.length();i>0;i--) {
//			
//			char c= name.charAt(i-1);
//			
//			rev = rev+c;
//			
//			
//		}
//
//		System.out.println(rev);
		
//		StringBuilder sb = new StringBuilder(name);
//		
//		StringBuilder rev = sb.reverse();
//		
//		System.out.println(rev);
		
		
//		StringBuffer sb = new StringBuffer(name);
//		
//		StringBuffer rev = sb.reverse();
//		
//		System.out.println(rev);
		
		String rev="";
		char a[] = name.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) {
			
			rev = rev + a[i];
			
			
			
		}
		System.out.println(rev);
		
 }
		
		
		

}
