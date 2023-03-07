package noah;

import java.util.Scanner;

public class Forstatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요소 수를 입력하세요 : ");

		int n = scan.nextInt();
		double a[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]");
			a[i] = scan.nextDouble();
		}
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		avg = sum / n;

		System.out.println("요소의 합 :" + sum);
		System.out.print("요소의 평균 : " + avg);
	}

}
