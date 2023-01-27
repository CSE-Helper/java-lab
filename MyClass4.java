abstract class AbstractClass { 
  int x = 10; // Data member. 
  AbstractClass(){ 
    System.out.println("AbstractClass constructor"); 
  } 
final void m1(){ 
   System.out.println("Final method"); 
 } 
void m2(){ 
   System.out.println("Instance method"); 
 } 
static void m3(){ 
   System.out.println("Static method"); 
 } 
  abstract void msg(); 
 } 
public class MyClass4 extends AbstractClass { 
	MyClass4(){ 
     System.out.println("MyClass4 class constructor"); 
   } 
 void msg(){ 
    System.out.println("Hello Java"); 
 } 
public static void main(String[] args) { 
	MyClass4 t = new MyClass4(); 
    t.msg(); 
    t.m1(); 
    t.m2(); 
    m3(); 
   System.out.println("x = " +t.x); 
  } 
}