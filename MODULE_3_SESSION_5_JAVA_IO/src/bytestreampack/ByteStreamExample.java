package bytestreampack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int byteData;
		try {
			fis=new FileInputStream("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\input.txt");
			fos=new FileOutputStream("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\output.txt",true);
			
			//----------------------- append the data use true
			//fos=new FileOutputStream("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\output.txt",true);
		
			//------------------------ replace the content of file 
			//	fos=new FileOutputStream("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\output.txt");
			
			while((byteData=fis.read())!=-1) {
				fos.write(byteData);
			}
			System.out.println("File copied successfully");
		}
		catch(IOException e) {
			e.printStackTrace();
		}finally {
			fis.close();
			fos.close();
		}
		

	}

}
