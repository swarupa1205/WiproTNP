package CollectAndGroup;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        TreeMap<Character, ArrayList<Integer>> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");

            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            map.putIfAbsent(symbol, new ArrayList<>());
            map.get(symbol).add(number);
        }

        System.out.println("Distinct Symbols are :");
        for (char ch : map.keySet()) {
            System.out.print(ch + " ");
        }
        System.out.println();

        for (char ch : map.keySet()) {

            System.out.println("Cards in " + ch + " Symbol");

            int sum = 0;

            for (int num : map.get(ch)) {
                System.out.println(ch + " " + num);
                sum += num;
            }

            System.out.println("Number of cards : " + map.get(ch).size());
            System.out.println("Sum of Numbers : " + sum);
        }
    }
}