package streams;

import java.io.*;
import java.util.*;

public class FileWordCount {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input file name");
        String inputFile = sc.nextLine();

        System.out.println("Enter output file name");
        String outputFile = sc.nextLine();

        BufferedReader br =
                new BufferedReader(
                        new FileReader("src/streams/" + inputFile));

        TreeMap<String, Integer> map = new TreeMap<>();

        String line;

        while ((line = br.readLine()) != null) {

            String words[] = line.split("\\s+");

            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        br.close();

        BufferedWriter bw =
                new BufferedWriter(
                        new FileWriter("src/streams/" + outputFile));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            bw.write(entry.getKey() + " : " + entry.getValue());
            bw.newLine();
        }

        bw.close();

        System.out.println("Word count written to " + outputFile);
    }
}