

public class Fibonacci {

	public static void main(String[] args) {

		int num1=0;
		int num2=1;
		int n=0;
		
		while(n<10) {
			
			int num3= num1+num2;
			System.out.print(num1 + " ");
			num1=num2;
			num2=num3;
		
			n++;
		}
		
		
		

	}

}
