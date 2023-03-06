package noah;

import java.util.Scanner;

public class Average {
	public static void main(String args[]) {
		int a[]= new int [5];
		double avg=0;
		int sum=0;
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1)+"번째 수 : ");
			a[i]=scan.nextInt();
			
		}
				
		for(int i=0; i<a.length; i++) {
			
			sum+=a[i];
		}
		avg=sum/(a.length);
		System.out.println("===============");
		System.out.printf("평균: %.2f",avg);
	}

}

