package com.paidaki.Greeklish;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Words {

    private Words() {
    }

    public static String purgeGreekWord(String word) {
        String purgedStr = word.toLowerCase();

        purgedStr = purgedStr.replaceAll("ά", "α");
        purgedStr = purgedStr.replaceAll("έ", "ε");
        purgedStr = purgedStr.replaceAll("ή", "η");
        purgedStr = purgedStr.replaceAll("ί", "ι");
        purgedStr = purgedStr.replaceAll("ϊ", "ι");
        purgedStr = purgedStr.replaceAll("ΐ", "ι");
        purgedStr = purgedStr.replaceAll("ό", "ο");
        purgedStr = purgedStr.replaceAll("ύ", "υ");
        purgedStr = purgedStr.replaceAll("ϋ", "υ");
        purgedStr = purgedStr.replaceAll("ΰ", "υ");
        purgedStr = purgedStr.replaceAll("ώ", "ω");
        purgedStr = purgedStr.replaceAll("ς", "σ");

        return purgedStr;
    }

    public static StringBuilder upperComb(String word) {
        StringBuilder strB = new StringBuilder();
        Set<String> tempSet = new HashSet<>();

        word = word.toLowerCase();
        int combinations = 1 << word.length();

        for (int i = 0; i < combinations; i++) {
            char[] result = word.toCharArray();

            for (int j = 0; j < word.length(); j++) {
                if (((i >> j) & 1) == 1 ) {
                    result[j] = Character.toUpperCase(word.charAt(j));
                }
            }
            tempSet.add(new String(result));
        }
        for (String s : tempSet) {
            strB.append(s);
            strB.append("\n");
        }
        return strB;
    }

    public static Set<Word> extractWords(String word) {
        Set<Word> tempSet = new HashSet<>();

        word = word.toLowerCase();
        char[] wordChars = word.toCharArray();
        List<Integer> indexes = new ArrayList<>();
        int combinations, found = 0;

        for(int i = 1; i < word.length(); i++) {
            String str = Character.toString(wordChars[i - 1]);
            str += Character.toString(wordChars[i]);

            if (Letters.getLetter(str) != null) {
                found++;
                indexes.add(i - 1);
            }
        }

        combinations = 1 << found;

        for(int i = 0; i < combinations; i++) {
            List<String> str = new ArrayList<>();
            int index = 0;

            for(int j = 0; j < indexes.size(); j++) {
                if (((i >> j) & 1) == 1) {
                    for(int k = index; k < indexes.get(j); k++) {
                        str.add(Character.toString(wordChars[k]));
                    }
                    String temp = Character.toString(wordChars[indexes.get(j)]);
                    temp += Character.toString(wordChars[indexes.get(j) + 1]);
                    index = indexes.get(j) + 2;
                    Letter letter = Letters.getLetter(temp);
                    if (letter != null) {
                        str.add(letter.getGreek());
                    }
                }
            }
            for(int k = index; k < wordChars.length; k++) {
                str.add(Character.toString(wordChars[k]));
            }
            if (!str.isEmpty()) {
                tempSet.add(new Word(str.toArray(new String[str.size()])));
            }
        }
        return tempSet;
    }

}
