package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class CheckedExceptionTest {
	
	void readFile() throws FileNotFoundException{
		
		File file = new File("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\s.txt");
		
		if(!file.exists()) {
			throw new FileNotFoundException("File not found");
		}
		
	}

	public static void main(String[] args) {

		CheckedExceptionTest checkedExceptionTest = new CheckedExceptionTest();
		
		try {
		checkedExceptionTest.readFile();
		}
		catch(NullPointerException | FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Checked Exception code completed");
		}

	}

}
