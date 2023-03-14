package noah;
import java.util.Arrays;
/*티셔츠 사이즈는 총 6개, 사이즈 별로 티셔츠가 
몇 벌씩 필요한지 가장 작은 사이즈부터 순서대로 배열에 담아 return 하게 하라.*/
import java.util.Scanner;
class Solution{
	public int[] Solution(String[] shirtSize) {
		//
		int[] answer= {};
		return answer;
	}
}

public class Shirtsize {

	public static void main(String[] args) {
		Solution sol=new Solution();
		String[] shirtSize = {"XS","S","L","L","XL","S"};
		int[] ret = sol.Solution(shirtSize);
		System.out.println("Solution : return value of method is"+ Arrays.toString(ret));

	}

}
