import java.util.Scanner;
public class GetInputFromUser {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		int s2 = in.nextInt();
		float s3 = in.nextFloat();
		double s4 = in.nextDouble();
		byte s5 = in.nextByte();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		

	}

}
