class iphone10{
	private String color;
	iphone10(){
		System.out.println("iphone 10 was initialized");
	}
	iphone10(String color){
		this.color = color;
	}
	public void display() {
		System.out.println(this.color);
	}
}

class iphone11 extends iphone10{
	iphone11(){
		System.out.println("iphone 11 was initialized");
	}
	iphone11(String color){
		//super("blue");
		System.out.println("iphone 11 with color parameter");
	}
}

class program1{  
	public static void main(String args[]){  
		 iphone11 obj = new iphone11("blue"); 
		 obj.display();
	}
}  