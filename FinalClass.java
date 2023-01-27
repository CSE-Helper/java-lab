class ParentClass1 {
    void showData() {
        System.out.println("This is a method of final Parent class");
    }
}

//It will throw compilation error
class ChildClass1 extends ParentClass1 {
    void showData() {
        System.out.println("This is a method of Child class");
    }
}
class FinalClass{
    public static void main(String arg[]){
        ChildClass1 obj = new ChildClass1();
        obj.showData();
    }
}