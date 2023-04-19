package coll01;

import java.util.Vector;

public class VectorEx {
	public static void printVector(Vector<Integer> v2) {
		for (int i = 0; i < v2.size(); i++) { // v.size()는 4
			int n = v2.get(i);
			System.out.println(n);

		}
	}

	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>();
		// 기본적인 용량은 10개를 만든다.
		// v는 백터 클래스의 객체변수로 데이터는 정수를 담는 것을
		// Vector()생성자에 의해서 10개의 기억공간이 만들어진다.

		v.add(5); // 인덱스 0번째 5가 삽입
		v.add(4); // 인덱스 1번째 4
		v.add(-1); // 인덱스 2번째 -2

		v.add(2, 100); // 인덱스 2번째 100이 삽입이 되고 나머지는 뒤로 이동된다.
		// 원래 2번째 이후의 모든 데이터는 자동으로 뒤로 이동한다.

		System.out.println("백터 내의 요소 객체의 수 : " + v.size());
		// 실제 데이터가 저장되어있는 데이터 개수

		System.out.println("백터의 현제 용량 : " + v.capacity());
		// 전체 용량

		//for (int i = 0; i < v.size(); i++) { // v.size()는 4
		//	int n = v.get(i);
		//	System.out.println(n);

		//}
		printVector(v);	//메소드가 호출되는데 파라미텉값은 v객체인데
		//v가 전달이 되는데... 받는 쪽도 같은 자료형이여야 한다.
	}

}
