class ParentClass{
	int num1;
	ParentClass(){
		System.out.println("\nInside the ParentClass default constructor");
		num1 = 10;
	}
	ParentClass(int value){
		System.out.println("\nInside the ParentClass parameterized constructor");
		num1 = value;
	}	
}

class ChildClass extends ParentClass{
	int num2;
	ChildClass(){
		super(100);
		System.out.println("\nInside the ChildClass constructor");
		num2 = 200;		
	}
}
public class Test {
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
	}
}
