package noah;

import java.util.Scanner;

public class UpGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int Max = 0; // 최고점
		int count = 0; // 순번
		int grade = 0; // 평점
		String list[] = {"순번","점수1","점수2","점수3","최고점","평점"};

		System.out.print("학생수 입력 : ");
		int Scon = scan.nextInt(); // 학생수

		int score[][] = new int[Scon][3];

		for (int i = 0; i < Scon; i++) {
			for (int j = 0; j < score[i].length; j++) {

				System.out.print("점수" + (j + 1) + "입력 : ");

				score[i][j] = scan.nextInt();

				if (score[i][j] < 0 || score[i][j] > 100) {
					System.out.print("다시 입력하세요==>");
					System.out.print("A점수" + (j + 1) + "입력 : ");
					score[i][j] = scan.nextInt();
				}
			}
			System.out.println("");

		}

		System.out.println("============================================");
		for(int i=0; i<list.length; i++){
			System.out.print(list[i]+"\t");
		}
		System.out.println("");
		System.out.println("============================================");

		for (int i = 0; i < Scon; i++) {
			count++;
			System.out.print(count);
			for (int j = 0; j < 3; j++) {

				System.out.printf("%8d", score[i][j]);

				if (Max < score[i][j]) {
					Max = score[i][j];
				}
			}

			System.out.printf("%10d", Max);
			grade = Max / 10;
			switch (grade) {

			case 10, 9:
				System.out.printf("\t  5");
				break;

			case 8:
				System.out.println("\t  4");
				break;

			case 7:
				System.out.println("\t  3");
				break;

			case 6:
				System.out.println("\t  2");
				break;

			default:
				System.out.println("\t  1");
				break;
			}
			System.out.println("");
		}
		System.out.println("");
	}
}