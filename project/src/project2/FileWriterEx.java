package project2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	//키보드로 치면 친 값이 temp아래 test.txt라는 이름으로 저장된다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileWriter fout = null;
		
		int c;
		try {
			fout = new FileWriter("c:\\Temp\\test.txt");
			while(true) {
				String line = scan.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scan.close();

	}

}
