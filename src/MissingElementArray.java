

public class MissingElementArray {
	
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,5,6,7,8};
		int sumArray=0;
		int sumNormal=0;
		
		for(int i=0;i<a.length;i++) {
			
			sumArray= sumArray+a[i];	
		}
		
		System.out.println(sumArray);
		
		int len= a.length;
		for(int i=a[0]; i<a[len-1];i++) {
			
			sumNormal= sumNormal+i;	
		}
		
		System.out.println(sumNormal);
	}

}
