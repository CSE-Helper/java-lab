import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		int[] arr = new int[num];
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = in.nextInt();
			if(arr[i]%2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
		
		

	}

}
