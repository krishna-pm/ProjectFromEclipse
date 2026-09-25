package characterstreampack;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

	public static void main(String[] args) throws IOException{
		
		int charData;
		
		try (
			FileReader fr = new FileReader("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\charstreaminput.txt");
			FileWriter fw = new FileWriter("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\charstreamoutput.txt");){
			
			while((charData=fr.read())!=-1) {
				fw.write(charData);
			}
			System.out.println("Text copied successfully");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	

}
