package datainputstreampack;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {

	public static void main(String[] args) {

		int rollNo=0;
		String name="";
		float marks=0.0f;
		double fees=0.0;
		
		System.out.println("input rollno, name, marks and fees...");
		
		try(DataInputStream dis = new DataInputStream(System.in)){
			
//			rollNo=dis.readInt();
//			name=dis.readLine();
//			marks=dis.readFloat();
//			fees=dis.readDouble();            unexpected output is getting using this code
			
			//-------------another way -------------------
			
			rollNo=Integer.parseInt(dis.readLine());
			name=dis.readLine();
			marks=Float.parseFloat(dis.readLine());
			fees=Double.parseDouble(dis.readLine());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(fees);
		

	}

}
