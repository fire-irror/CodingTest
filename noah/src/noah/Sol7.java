package noah;

import java.util.Arrays;
import java.util.Comparator;

public class Sol7 {
	public static void main(String args[]) {
		
		//오름차순 정렬
		int arr[]= {10,9,132,4,894,35,68};
		Arrays.sort(arr);	
		System.out.println(Arrays.toString(arr));	//배열을 문자열로 변환하여 출력해야한다.
		
		
		//내림차순 정렬
		Integer brr[]= {619,98,1,68,4,65,9,6,98,65};
		Arrays.sort(brr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(brr));
		
	}

}