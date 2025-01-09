package com.learn;

import java.util.Map;
import java.util.Stack;

/**
 * @author anthonylee
 */
public class BraceChecker {
    public boolean isValid(String braces) {
        Map<Character, Character> map = Map.of(')', '(', ']', '[', '}', '{');
        Stack<Character> stack = new Stack<>();

        for (char c : braces.toCharArray()) {
            if (map.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker();
        System.out.println(braceChecker.isValid("()")); // true
        System.out.println(braceChecker.isValid("()[]{}")); // true
        System.out.println(braceChecker.isValid("(]")); // false
        System.out.println(braceChecker.isValid("([)]")); // false
        System.out.println(braceChecker.isValid("{[]}")); // true
    }
}
