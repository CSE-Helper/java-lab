public class exception5 {
	public static void main(String[] args) {
		int num = 1;
		 for(num = 1; num <= 10; num++){
		try
		{
		 if(num == 5)
		   throw new ArithmeticException("ArithmeticException");
		 else if(num < 2)
		   throw new RuntimeException("RuntimeException");
		 else if(num > 9)
		   throw new NullPointerException("NullPointerException");	
		}
		catch(Exception e)
		{
		  System.out.println("Caught an exception");
		  System.out.println(e.getMessage());
		 }
		}
	}

}
