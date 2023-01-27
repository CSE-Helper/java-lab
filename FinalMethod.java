class ParentClass2 {
    void showData() {
        System.out.println("This is a final method of Parent class");
    }
}

class ChildClass2 extends ParentClass2 {
    
    void showData(){
        System.out.println("This is a final method of Child class");
    }
}
class FinalMethod{
    public static void main(String arg[]){
        ParentClass2 obj = new ChildClass2();
        obj.showData();
    }
}