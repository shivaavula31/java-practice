import java.util.Stack;
import java.util.Scanner;
public class InfixToPostfix {
    public static String convertToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postfixExpression.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression.append(stack.pop());
                }

                if (!stack.isEmpty() && stack.peek() != '(') {
                    throw new IllegalArgumentException("Invalid infix expression");
                }

                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfixExpression.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                throw new IllegalArgumentException("Invalid infix expression");
            }

            postfixExpression.append(stack.pop());
        }

        return postfixExpression.toString();
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        String infixExpression = "(A+B)*(C+D)";
        String postfixExpression = convertToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}
