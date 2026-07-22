package programming;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        boolean valid = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } else {

                if (stack.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    valid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty())
            valid = false;

        if (valid)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}