package pack06;

public class AutoBoxingUnBoxingEX {
	public static void main(String agrs[]) {
		int n = 10;		//기본 정수형 데이터
		Integer intObject = n;	//자동 박싱(auto boxing) -- 기본데이터를 객체타입으로 변환해서 저장
		System.out.println("intObject ="+intObject);
		
		int m = intObject +10;	//객체타입 데이터 + 기본데이터==>기본데이터로 저장 
		System.out.println("m = "+m);
	}
}
