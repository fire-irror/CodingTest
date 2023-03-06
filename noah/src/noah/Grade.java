package noah;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int score[][] = new int[3][2];
		double avg=0;
		double sum=0;
		int con=0;
	
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print((i+1) + "학년 " + (j+1) + "학기 점수 입력 :");
				score[i][j] = scan.nextInt();
				sum += score[i][j];
				con+=1;
				avg=sum/con;
			}
			
		}

		System.out.printf("평균 : %.2f ",avg);
	}

}

