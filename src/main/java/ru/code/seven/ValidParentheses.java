package ru.code.seven;

public class ValidParentheses {
    public static boolean validParentheses(String parenStr) {
        while (parenStr.contains("()")) {
            parenStr = parenStr.replace("()", "");
        }
        return parenStr.equals("");
    }
}
