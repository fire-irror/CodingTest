package file04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("./src/File03/img.png");
		File dest = new File("./src/File03/blockcopyimg.png");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10];	//1024는 1kb*10 ---> 10kb의용량(버퍼)
			while(true) {
				int n = fi.read(buf);	//fi가 가리키는 파일에서 데이터를 읽어서 
//				10kb가 buf에 저장하고, 그 길이 값을 n에 저장한다.
				fo.write(buf,0,n);	//buf임시기억공간에 저장되어 있는 데이터에서
				//0번째 부터 시작하여 n갯수 만큼을 fo가 가리키는 파일("blockcopyimg.png)에 출력한다
				System.out.println("n="+n+",buf.length"+buf.length+"\n");
				if(n<buf.length)
					break;
			}fo.close();
			fi.close();			
			System.out.println(src.getPath()+"를"+dest.getParent()+"로 복사함");
			}catch(IOException e) {
				System.out.println("파일 오류");
		}
	}

}
