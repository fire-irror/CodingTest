// c:\\Temp\\test.txt파일을 이용해서 testout.txt로 복사하는 프로그램을 작성하시오
//FileReader 클래스와 FileWrite클래스를 사용해서 작성하시오
package file02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//c:\Temp\test.txt파일을 이용해서 testout.txt.로 복사하는 프로그램을 작성하시오
//FileReader 클래스와 FileWrite클래스를 사용해서 작성
public class FileCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      File src=new File("c:\\Temp\\test.txt");
//      File dest=new File("c:\\Temp\\testout.txt");
		String src = "c:\\Temp\\test.txt";
		String dest = "c:\\Temp\\testout.txt";
		int c;
		try {
			/*
			 * FileReader fr=new FileReader("c:\\Temp\\test.txt"); FileWriter fw=new
			 * FileWriter("c:\\Temp\\testout.txt");
			 */
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while ((c = fr.read()) != -1) {
				fw.write((char) c);
			}
			fr.close();
			fw.close();
			System.out.println("복사가 성공적임");
			// System.out.println(src.getPath()+"를"+dest.getPath()+"로 복사");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("복사오류");
		}

	}
}
