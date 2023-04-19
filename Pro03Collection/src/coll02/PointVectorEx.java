package coll02;

import java.util.Vector;

public class PointVectorEx {
	public static void main(String args[]) {
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3));	//데이터가 삽입이 되는데 point() 생성자 의해서 값이 저장된다,
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);	//toString()메소드가 호출된다.
			//sysout(p.toString)); toString 메소드가 호출된다.
		}	
	}
}
