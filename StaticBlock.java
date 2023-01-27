class A2{  
  static{
	  System.out.println("static block is invoked");
	  }
  A2(){
	  System.out.println("Inside Constructor");
  }
 }

public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj = new A2();
	}

}
