package coll04;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		//hashMap 객체 생성 key의 데이터 타입은 String
		//value의 데이터 타입도 String
		HashMap<String, String> dic = new HashMap<String, String>();

		//3개의 (key, value)쌍을 dic객체에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("찾고 싶은 단어를 입력하세요 : ");
			String eng = scan.next();		//키보드로 부터 실제로 문자열을 입력
			//if (eng == "exit") {		//문자열의 주소값을 비교한다.
			if(eng.equals("exit")) {		
				//eng문자열 값고 "exit"의 문자열을 비교하여 같으면 true를 반환한다.
				System.out.println("종료합니다");
				break;	//while반복문을 빠져나간다
			}
			String kor = dic.get(eng);
			if (kor == null)
				System.out.println(eng + "는 없는 단어입니다.");
			else
				System.out.println(kor);
		}
	}

}
