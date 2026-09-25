package bufferedstreampack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamExample {

	public static void main(String[] args) {
		
		try(
				BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA_FULLSTACK_LUMINAR\\javaio.charstreaminput.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA_FULLSTACK_LUMINAR\\javaio.charstreamoutput.txt/"));){

			String line;
			
			while((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
			}
			
			System.out.println("Buffered copy completed");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
