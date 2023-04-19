package noah;
import java.util.Scanner;

public class Bmax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		int arr[]=new int[a];
		int max=0;
		int n=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(max > arr[i]) {
				max = arr[i];
				n++;
			}
		}
		System.out.print(max+","+n);

	}

}
