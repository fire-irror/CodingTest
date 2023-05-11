package file01;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String args[]) {
		FileReader fin = null;
		//fin은 FileReader클래스를 가리키는 객체변수로 할당된 메모리는 없음 
		//파일에 관계되는 모든 프로그램은 try~catch문을 사용해야한다. 
		
		//try문장 안에 있는 것을 실행하다가 오류가 발생하면 catch문장으로 실행을 실행한다
		//만약 오류가 없다면 catch문장은 실행하지 않는다.
		try {
			fin = new FileReader("c:\\Windows\\system.ini");
			//fin 객체변수는 "system.ini"파일을 가리킨다.
			int c;
			
			while((c=fin.read()) !=-1) {	
				//fin이 가리키는 파일에서 한 문자씩 읽어서 c에 저장하고, -1은 파일에 끝을 의미한다.
				//fin객체 변수가 파일의 끝에 도달하면 -1의 값을 c에게 넘겨준다
				//그래서 true를 반환하면 파일의 끝가지 읽어서 화면에 출력한다. 
				System.out.print((char)c);
			}
			fin.close();	
			//파일을 닫아준다 더 이상 fin객체변수를 사용하지 않겠다라는 뜻
			//이 파일을 사용하지 않겠다.
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
