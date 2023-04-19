package coll03;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>();
		int sum=0;
		
		v.add(5); 
		v.add(4); 
		v.add(-1); 
		v.add(2, 100); 
		
		//Iterator it객체 변수는 v객체변수의 iterator()메소드에 의해서 객체가 생성된 것이다
		//it는 v객체 데이터의 첫번째 요소를 가리키게 된다.
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {		
			//첫번째 요소에 데이터가 존재하면 true값을 반환한다.
			//두번째 요소에 데이터가 존재하면 true값을 반환한다.
			//...
			//it이 가리키는 위치에 데이터가 없으면 false값을 반환한다.
			
			int n = it.next();		//첫번째 데이터를 n에게 넘겨준 후에 v객체 데이터에 있는 그 다음 요소를 가리키게 된다.
			sum +=n;
			System.out.println(n+" ");
		}
		System.out.println("백터에 있는 정수의 합 : "+sum);
	}

}
