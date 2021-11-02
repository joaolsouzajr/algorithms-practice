package jlsj.algopract.hr;

import java.util.*;

public class BalancedBrackets {

    public String isBalanced(String s) {
        boolean isBalanced = true;

        Deque<Character> deque = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty()
                        && ((deque.peekFirst() == '{' && ch == '}')
                        || (deque.peekFirst() == '[' && ch == ']')
                        || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                } else {
                    isBalanced = false;
                }
            }
        }
        return isBalanced ? "YES" : "NO";
    }
}
