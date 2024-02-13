package ru.code.seven;

public class ValidParentheses {
    public static boolean validParentheses(String parenStr) {
        int parentCounter = 0;
        for (int i = 0; i < parenStr.length(); i++) {
            if (parenStr.charAt(i) == '(') {
                parentCounter++;
            } else {
                parentCounter--;
            }
            if (parentCounter < 0) {
                return false;
            }
        }
        return parentCounter == 0;
    }
}
