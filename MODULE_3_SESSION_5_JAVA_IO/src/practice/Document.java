package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Document {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
       
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\sample.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.replaceAll("[.,;:\"']","");

                line = line.toLowerCase();

                String[] words = line.split("\\s+");

                for (String word : words) {

                    if (!word.isEmpty()) {
                        if (!list.contains(word)) {
                            list.add(word);
                        }
                    }
                }
            }

            Collections.sort(list);

            System.out.println("Words in Sorted Order:");

            for (String word : list) {
                System.out.println(word);
            }

            System.out.println("Total Words : " + list.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
