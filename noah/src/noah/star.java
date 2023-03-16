package noah;

import java.util.Arrays;

class star_Sol {
	public int[] star_sol(String[] star_size) {

		int[] star_count = new int[10];
		for (int i = 0; i < star_size.length; i++) {
			if (star_size[i].equals("엔시티")) {
				star_count[0]++;
			} else if (star_size[i].equals("HOT")) {
				star_count[1]++;
			} else if (star_size[i].equals("엑소")) {
				star_count[2]++;
			} else if (star_size[i].equals("르세라핌")) {
				star_count[3]++;
			} else if (star_size[i].equals("에스파")) {
				star_count[4]++;
			} else if (star_size[i].equals("레드벨벳")) {
				star_count[5]++;
			} else if (star_size[i].equals("카라")) {
				star_count[6]++;
			} else if (star_size[i].equals("트와이스")) {
				star_count[7]++;
			} else if (star_size[i].equals("뉴진스")) {
				star_count[8]++;
			}
		}
		return star_count;
	}
}

public class star {

	public static void main(String[] args) {
		star_Sol sol = new star_Sol();
		String[] star_size = { "엔시티", "엔시티", "에스파", "르세라핌", "에스파", "레드벨벳", "레드벨벳", "뉴진스", "뉴진스", "뉴진스" };
		int[] ret = sol.star_sol(star_size);
		System.out.println("Solution : return value of method is" + Arrays.toString(ret));
	}
}
