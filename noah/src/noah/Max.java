package noah;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] a = new int[10];
		int Max=0;

		for (int i = 0; i < a.length; i++) {

			System.out.print((i + 1) + "번째 수 : ");
			a[i] = scan.nextInt();

			
			if (Max < a[i]) {
				Max=a[i];
			}
		}
		System.out.print("가장 큰 수 : " + Max);
	}

}
