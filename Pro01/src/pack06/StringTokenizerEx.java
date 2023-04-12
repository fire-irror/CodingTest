package pack06;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		//구분자는 "/"로 설정했고 토큰들은 "홍길동, 장화, 홍련, 콩쥐 팥쥐"
		//st는 첫번째 토큰을 가리킨다. 
		
		while(st.hasMoreTokens())	//값을 출력해주고 그다음 자동적으로 point가 증가한다. 
			//st가 가리키는 곳에 토큰이 존재하면 true를 반환
			System.out.println(st.nextToken());
		//st.nextToken()는 st가 가리키는 곳의 토큰을 출력한 후네
		//st는 다음 토큰을 가리키게 된다. 
	}

}
