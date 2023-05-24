package file04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import file02.FileOutputitStreamEx;

public class BinartCopyEx {

	public static void main(String[] args) {
		File src = new File("./src/File03/img.png");
		//src파일 객체를 생성하면 파일에 대한 정보를 얻을 수 있다.
		File dest = new File("./src/File03/copyimg.png");
		//String src = "파일";
		//String dest = "파일";
		int c;
		
		try {
			FileInputStream fi = new FileInputStream(src);
			//fi 입력객체는 src객체의 파일(img.png)를 가리킨다.
			FileOutputStream fo = new FileOutputStream(dest);
			// fo 출력객체는 dest객체의 파일(copyimg.png)를 가리킨다.
			
			while((c = fi.read())!=-1) {	//fi가 가리키는 파일에서 1바이트씩 읽어서
				fo.write((byte)c);			//fo가 가리키는 파일(copyimg.png)에 출력한다
			}
			fo.close();
			fi.close();
			System.out.println(src.getPath()+"를"+dest.getParent()+"로 복사함");
		}catch(IOException e) {
			System.out.println("파일 오류");
		}
		
	}

}
