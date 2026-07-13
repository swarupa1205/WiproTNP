package streams;

import java.io.*;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        FileReader fr = new FileReader("src/streams/" + fileName);

        int count = 0;
        int c;

        while ((c = fr.read()) != -1) {
            if (Character.toLowerCase((char) c) == ch) {
                count++;
            }
        }

        fr.close();

        System.out.println("File '" + fileName + "' has " + count
                + " instances of letter '" + ch + "'.");
    }
}