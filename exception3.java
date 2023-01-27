public class exception3 {    
    public static void validate(int age) { 
    	try {
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  }
    	catch(NullPointerException e) {
    		System.out.println("Inside validate: "+ e);
    	}
    }  
 
    public static void main(String args[]){  
        //calling the function  
    	try {
        validate(13);  
    	}
    	catch(NumberFormatException e) {
    		System.out.println("Inside Main: "+ e);
    	}
        System.out.println("rest of the code...");    
  }    
}    