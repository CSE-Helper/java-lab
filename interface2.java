interface iphone{
	void camera();
	void speaker();
	void os();
	void basicapps();
}

interface nokia{
	void camera();
	void speaker();
	void os();
	void snakegame();
}

class smartphone implements iphone{
	public void camera() {
		System.out.println("iphone camera");
	}
	public void speaker() {
		System.out.println("iphone speaker");
	}
	public void os() {
		System.out.println("iphone os");
	}
	public void basicapps() {
		System.out.println("iphone apps");
	}
	public void xcode() {
		System.out.println("iphone xcode");
	}
}
abstract class phone implements nokia{
	abstract void messageapp();
}

class newphone extends phone implements iphone{

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speaker() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void os() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void snakegame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void messageapp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void basicapps() {
		// TODO Auto-generated method stub
		
	}
	
}

class chinesephone implements iphone, nokia{

	@Override
	public void snakegame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speaker() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void os() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void basicapps() {
		// TODO Auto-generated method stub
		
	}
	
}
public class interface2 {
	public static void main(String a[]) {
		
	}
}
