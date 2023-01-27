
public class Calculator {
	public int factorial(int num) {
		int i,fact=1;  
		int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }  
		return fact;
	}
	
	public int square(int num) {
		return num*num;
	}
}
