package ExceptionHandling;

import java.util.Scanner;

class NegativeMarksException extends Exception {
    public NegativeMarksException(String msg) {
        super(msg);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String msg) {
        super(msg);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name:");
                String name = sc.nextLine();

                int total = 0;

                for (int j = 1; j <= 3; j++) {
                    System.out.println("Enter marks in subject " + j + ":");

                    int marks = Integer.parseInt(sc.nextLine());

                    if (marks < 0)
                        throw new NegativeMarksException("Negative values are not allowed");

                    if (marks > 100)
                        throw new OutOfRangeException("Marks should be between 0 and 100");

                    total += marks;
                }

                double avg = total / 3.0;

                System.out.println("Average marks of " + name + " = " + avg);
            }

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        } catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}