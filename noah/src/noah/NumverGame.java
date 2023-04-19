package noah;
import java.util.Scanner;
public class NumverGame {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("3 6 9 게임 시작");
		
		int a = scan.nextInt(); 
		int arr[]=new int [a];
		int index=0;
		
		
		for(int i=0; i<arr.length; i++) {
			a = scan.nextInt();
			arr[i]+=1;
			
			if(arr[i]%3==0) {
				System.out.println("짝");
			}
		}
	}

}
