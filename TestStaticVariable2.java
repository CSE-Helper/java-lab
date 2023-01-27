class Counter2{  
	  
	static int count;
	Counter2(){  
		count++;//incrementing the value of static variable  
		System.out.println(count);  
	}  
}


public class TestStaticVariable2 {
	public static void main(String[] args) {
		Counter2 c1=new Counter2();  
		Counter2 c2=new Counter2();  
		Counter2 c3=new Counter2();  
	}
}
