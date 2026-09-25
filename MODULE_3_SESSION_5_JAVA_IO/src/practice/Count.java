package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count {

    public static void main(String[] args) {

        int characters = 0;
        int words = 0;
        int lines = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\sample.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();
                String[] wordArray = line.split("\\s+");
                words += wordArray.length;
            }

            System.out.println("Number of Lines : " + lines);
            System.out.println("Number of Words : " + words);
            System.out.println("Number of Characters : " + characters);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}