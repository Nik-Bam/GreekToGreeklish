package com.paidaki.Greeklish;

import java.util.Set;

public class Parser {

    private Parser() {
    }

    public static StringBuilder parse(String input) {
        input = Words.purgeGreekWord(input);
        Set<Word> words = Words.extractWords(input);
        StringBuilder strB = new StringBuilder();

        for (Word w : words) {
            int[] indexes = new int[w.getSize()];
            StringBuilder strTemp;
            boolean done = false;
            int nextToChange = indexes.length - 1;

            while (!done) {
                strTemp = new StringBuilder();
                for(int i = 0; i < w.getSize(); i++) {
                    Letter current = w.getLetters().get(i);
                    try {
                        strTemp.append(current.getEnglish().get(indexes[i] % current.getEnglish().size()));
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.exit(1);
                    }
                }

                strB.append(Words.upperComb(strTemp.toString()));

                for (int j = indexes.length - 1; j >= 0; j--) {
                    if (j == nextToChange) {
                        indexes[j]++;
                        if (indexes[j] >= w.getLetters().get(j).getEnglish().size()) {
                            indexes[j] = 0;
                            nextToChange = j - 1;
                            if (nextToChange < 0) {
                                done = true;
                                break;
                            }
                        } else {
                            nextToChange = indexes.length - 1;
                            break;
                        }
                    }
                }
            }
        }
        return strB;
    }

}
