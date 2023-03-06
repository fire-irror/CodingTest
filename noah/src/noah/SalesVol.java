package noah;

import java.util.Scanner;

public class SalesVol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a[][] = new int[3][4];
		int Sum[] = new int[3];

		int add = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.print((2019 + i) + "년도 : ");

			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = scan.nextInt();
				Sum[i] += a[i][j];

			}
		}

		System.out.println("=================================================================================");
		System.out.print("             1사분기    2사분기   3사분기   4사분기   연간판매량   누적판매량\n");

		for (int i = 0; i < a.length; i++) {
			System.out.print((2019 + i) + "년도 : ");

			add += Sum[i];	//누적 판매량

			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%8d", a[i][j]);

			}
			System.out.print("\t" + Sum[i]);
			System.out.printf("\t  " + add);
			System.out.println("");

		}
	}
}