package project;

import java.util.Vector;

public class VectorTEst {
	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>(7);
		v.add(5);
		v.add(4);
		v.add(-1);
		
		int n = v.size();
		System.out.println(n);
		
		int c = v.capacity();
		System.out.println(c);
		
		
		v.add(2,100);
		
		Integer obj = v.get(1); 	//인덱스 1번에 들어있는 값==4니까 4가 들어가있는거임
		System.out.println(obj);
		
		int i= obj.intValue();
		System.out.println(i);		//위에거랑 같은데 뜻이 다름
		
		v.remove(1);
		
		int last=v.lastElement();
		System.out.println(last);
		v.removeAllElements();
	}

}
