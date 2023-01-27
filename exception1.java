
public class exception1 {

	public static void main(String[] args) {
		 
		try {
			int data=100/10; 
			String s1="Hai";
			System.out.println(s1.length());
			String s2="123";
			int i=Integer.parseInt(s2); 
			int a[]=new int[5];
			a[10]=50;

		}
		
	
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Hello");

		
		 
		 
		 
		 //  
		 ////NullPointerException  
		 //String s2="abc";  
		 //int i=Integer.parseInt(s2);//NumberFormatException 
		 //int a[]=new int[5];  
		 //a[10]=50; //ArrayIndexOutOfBoundsException

	}

}
