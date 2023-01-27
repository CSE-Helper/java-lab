class ArithmeticOperation{
	int a, b;
	public ArithmeticOperation() {
		System.out.println("I am Default");
	}
	
	public int add() {
		return a+b;
	}
	public int sub() {
		return a-b;
	}
	public int mul() {
		return a*b;
	}
	public int div() {
		return a/b;
	}
}

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperation obj = new ArithmeticOperation();

		int result = obj.add();
		System.out.println(result);
		result = obj.sub();
		System.out.println(result);
		result = obj.mul();
		System.out.println(result);
		result = obj.div();
		System.out.println(result);
	}
}
