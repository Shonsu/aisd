package pl.shonsu.parentheses;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Parentheses {
    static boolean validParentheses(String text) {
        LinkedList<Character> stack = new LinkedList<>();
        Map<Character, Character> dict = new HashMap<>();
        dict.put('}', '{');
        dict.put(']', '[');
        dict.put(')', '(');
        for (char c : text.toCharArray()) {
            if (dict.containsValue(c)) {
                stack.add(c);
            } else if (dict.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.getLast().equals(dict.get(c))) {
                    stack.removeLast();
                }
            }
        }
        return stack.isEmpty();
    }
}
