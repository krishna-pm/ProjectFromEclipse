package practice;

public class CharArrayLength {

    public static void main(String[] args) {

        char[] letters = new char[10];

        int length = 0;

        while (letters[length] != '\u0000') {
            length++;
        }

        System.out.println("Length = " + length);

        letters[0] = 'J';
        letters[1] = 'A';
        letters[2] = 'V';
        letters[3] = 'A';

        length = 0;

        while (letters[length] != '\u0000') {
            length++;
        }

        System.out.println("Length = " + length);
    }
}