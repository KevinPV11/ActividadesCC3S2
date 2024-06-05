package org.example;

public class HintGenerator {
    public static String generateHint(String word) {
        StringBuilder hint = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            hint.append("_ ");
        }
        return hint.toString().trim();
    }
}




