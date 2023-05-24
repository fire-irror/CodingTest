package file02;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputitStreamEx {

	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
			//fout 출력파일 객체변수는 "text.out"파일을 가리킨다.
			
			for(int i=0; i<b.length; i++) 
				fout.write(b[i]);	//파일(test.out)에 b[i]의 값을 바이너리(2진수)값으로 출력한다
				//text형식이 아님
				fout.close();
			}catch(IOException e) {
				System.out.println("c:\\Temp\\test.out에 저장할 수 없음");
				return;
			}
			System.out.println("c:\\Temp\\test.out을 저장햇습니다.");
			//test.out파일을 메모장에서 불러오면 데이터가 깨진 것 처럼 보인다.
	}

}
