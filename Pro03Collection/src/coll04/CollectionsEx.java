package coll04;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {

	static void printList(LinkedList<String> l) {	//l=myList
		Iterator<String> iterator = l.iterator();	//순차적으로 접근하기 위함
		while (iterator.hasNext()) {				//iterator가 가리키는 곳에 데이터가 존재하면 true
			String e = iterator.next();
			String separator;
			if (iterator.hasNext())
				separator = "=>";
			else
				separator = "\n";
			System.out.print(e + separator);

		}
	}

	public static void main(String args[]) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		printList(myList);

		myList.add(0, "터미네이터");
		myList.add(2, "아바타");

		printList(myList);

		Collections.sort(myList);	//오름차순 정렬(ascending sort)
		printList(myList);

		Collections.reverse(myList);	//myList에 들어있는 데이터들이 역순으로 정렬된다.
		printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타") + 1;
		System.out.println("아바타는 " + index + "번째 요소입니다");
	}

}
