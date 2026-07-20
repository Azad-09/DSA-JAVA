package org.example.leetCodeStack;


import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String words = "]";

        boolean res = solution(words);
        System.out.println(res);
    }

    public static boolean solution(String words){
        Stack<Character> stack = new Stack<>();

        for (char c : words.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if (!stack.isEmpty() && (c == ')' && stack.peek() == '(' || c == '}' && stack.peek() == '{' || c == ']' && stack.peek() == '[')) {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
