package file01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Scanner 객체변수 생성 ---키보드로 부터 데이터를 입력받기 위함
		FileWriter fout = null;
		// fout 출력 파일 객체변수 선언
		int c;

		try {
			fout = new FileWriter("c://Temp//text.txt");
			//fout는 "test.txt"파일을 가리키는 파일 객체 변수
			while (true) {	//무한 반복
				String line = scan.nextLine();	//키보드로 부터 줄 단위로 데이터를 입력
				if (line.length() == 0)
					break;	//콘솔창에서 데이터를 입력하지 않고 엔터키를 누르면 line.length() = 0
							//그래서 break문장을 만나면 while문을 빠져나감
				fout.write(line, 0, line.length());
				//fout이 가리키는 "text.txt"파일에 line의 0번째 데이터부터 입력된 데이터의 길이 만큼을 저장한다.
				fout.write("\r\n", 0, 2);	//fout이 가리키는 "text.txt"파일에 줄을 바꾸고 커서를 맨 앞으로 이동
				
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}scan.close();
	}
}
