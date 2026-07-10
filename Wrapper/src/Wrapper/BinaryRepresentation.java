package Wrapper;

import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to 255): ");
        int num = sc.nextInt();

        // Convert integer to binary string
        String binary = Integer.toBinaryString(num);

        // Add leading zeros to make it 8 digits
        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println("Binary Representation: " + binary);

        sc.close();
    }
}