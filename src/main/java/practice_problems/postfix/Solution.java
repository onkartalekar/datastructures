package practice_problems.postfix;

import java.util.Stack;

public class Solution {

    public static void main(String... args) throws InvalidExpression {
        String expr = "3 1 1 + /";
        double result = evalRPN(expr);
        // print result
        System.out.println(result);
    }

    static double evalRPN(String expr) throws InvalidExpression {
        double result = 0d;
        Stack<Double> stack = new Stack<>();

        if (expr == null || expr == "") {
            return result;
        }
        String str = "";
        double opOne, opTwo, temp;
        for (char c : expr.toCharArray()) {
            if (c == '+' || c == '*') {
                if (!stack.isEmpty()) {
                    opOne = stack.pop();
                } else {
                    throw new InvalidExpression();
                }
                if (!stack.isEmpty()) {
                    opTwo = stack.pop();
                } else {
                    throw new InvalidExpression();
                }

                temp = c == '+' ? opOne + opTwo : opOne * opTwo;
                stack.push(temp);
            } else if (c == '-' || c == '/') {
                if (!stack.isEmpty()) {
                    opOne = stack.pop();
                } else {
                    throw new InvalidExpression();
                }
                if (!stack.isEmpty()) {
                    opTwo = stack.pop();
                } else {
                    throw new InvalidExpression();
                }
                temp = c == '-' ? opTwo - opOne : opTwo / opOne;
                stack.push(temp);
            } else {
                // extract operands
                if (c == ' ' && str != "") {
                    stack.push(Double.valueOf(str));
                    str = "";
                } else {
                    str += c;
                }
            }
        }

        result = stack.pop();

        if (!stack.isEmpty()) {
            throw new InvalidExpression();
        }


        return result;

    }

}