class OfficeData { 
    void policy(){
        System.out.println("There are three policies");
    }
    final void financial(){
        System.out.println("Offic financial data");
    }
}
public class FinalMethod2 extends OfficeData{
    public void mainRecord(){
        System.out.println("All data record of office");
    }
    void policy(){
        System.out.println("Adding one more policy");
    }
    
    public static void main(String arg[]){
    	FinalMethod2 record = new FinalMethod2();
        record.mainRecord();
        record.policy();
    }
}