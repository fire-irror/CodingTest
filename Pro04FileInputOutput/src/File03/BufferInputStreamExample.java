package File03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputStreamExample {

   public static void main(String[] args) throws Exception {
      // O Auto-generated method stub
      long start=0;
      long end=0;
      FileInputStream fis1=new FileInputStream("./src/File03/forest.jpg");
      start=System.currentTimeMillis();
      while(fis1.read()!=-1) {}
      end=System.currentTimeMillis();
      System.out.println("버퍼를 사용하지 않았을 때 : "+(end-start)+"ms");
      fis1.close();
      
      FileInputStream fis2=new FileInputStream("./src/File03/forest.jpg");
      //상대경로          ./는 현재  프로젝트
      BufferedInputStream bis=new BufferedInputStream(fis2);
      start=System.currentTimeMillis();
      while(bis.read()!=-1) {}
      end=System.currentTimeMillis();
      System.out.println("버퍼를 사용했을때 : "+(end-start)+"ms");
      bis.close();
      fis2.close();
   }

}