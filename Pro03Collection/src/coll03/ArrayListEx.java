package coll03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {			
		ArrayList<String> a = new ArrayList<String>();
		
		//키보드로 부터 데이터를 입력받기 위해서 객체 생성
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println("이름을 입력하시오>>");
			String s = scan.next();		//키보드로 부터 문자열을 입력받는다. 
			a.add(s);	//a객체의 데이터 저장
		}
		for(int i=0; i<4; i++) {
			String name = a.get(i);		//0번째 부터 시작하여 데이터를 가져와서 name에 저장 
			System.out.print(name + "  ");
		}
		//각 요소에 저장되어있는 데이터들의 길이 값을 가지고 
		//그 길이의 최대값에 해당되는 인덱스를 구하는 알고리즘이다.
		int longstindex = 0;
		for(int k=0; k<a.size();k++) {
			if(a.get(longstindex).length() < (a.get(k).length())) {		
				longstindex=k;
			}
		}
		System.out.println("가장 긴 이름은 : "+a.get(longstindex));
	}

}
