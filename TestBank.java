abstract class Bank{    
	abstract int getRateOfInterest();    
}    
class ICICI extends Bank{

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 5;
	}    
	    
}    
class HDFC extends Bank{    
	int getRateOfInterest(){
		return 6;
	}    
}    
    
class TestBank{    
	public static void main(String args[]){    
		Bank b;  
		b=new ICICI();  
		System.out.println("Rate of Interest ICICI: "+b.getRateOfInterest()+" %");    
		
		b=new HDFC();  
		System.out.println("Rate of Interest HDFC : "+b.getRateOfInterest()+" %");    
	}
} 