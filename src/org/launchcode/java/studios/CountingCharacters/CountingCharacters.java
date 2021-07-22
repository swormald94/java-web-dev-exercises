package org.launchcode.java.studios.CountingCharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String inputStr = "Java is fun to learn!";
        char[] charInString = inputStr.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char letter : charInString) {
            if (charCount.containsKey(letter)) {
                charCount.put(letter, charCount.get(letter) + 1);
            } else {
                charCount.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> printChar : charCount.entrySet()) {
            System.out.println(printChar.getKey() + ": " + printChar.getValue());
        }
    }
}
