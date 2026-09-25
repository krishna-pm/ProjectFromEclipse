package dataoutputstreampack;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

	public static void main(String[] args) throws IOException {


		FileOutputStream file = new FileOutputStream("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\test.txt");
		DataOutputStream data = new DataOutputStream(file);
		
		data.writeInt(65);  // binary representation of A
		data.flush();
		data.close();
		
		System.out.println("Success");
		
		
	}

}
