package com.paidaki.Greeklish;

import java.util.ArrayList;
import java.util.List;

public class Word {

    private List<Letter> letters;
    private int size;

    public Word(String input) {
        this.letters = new ArrayList<>();

        for (char c : input.toCharArray()) {
            letters.add(Letters.getLetter(Character.toString(c)));
        }

        this.size = letters.size();
    }

    public Word(String... inputChar) {
        this.letters = new ArrayList<>();

        for (String s : inputChar) {
            letters.add(Letters.getLetter(s));
        }

        this.size = letters.size();
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder();
        for (Letter l : letters) {
            strB.append(l.getGreek());
        }
        return strB.toString();
    }

}
