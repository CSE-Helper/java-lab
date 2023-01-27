class MyTest{
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void sub(int a, int b) {
		System.out.println(a+b);
	}
}
public class MyClass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTest obj = new MyTest();
		obj.add(10, 20);
		obj.sub(10, 20);
		MyTest obj2 = new MyTest();
		obj2.add(100, 20);
		obj2.sub(100, 20);
	}

}
