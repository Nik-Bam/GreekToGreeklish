package com.paidaki.Greeklish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Letter {

    private String greek;
    private List<String> english;

    public Letter(String greek, String... english) {
        this.greek = greek;
        this.english = new ArrayList<>();

        Collections.addAll(this.english, english);
    }

    public String getGreek() {
        return greek;
    }

    public List<String> getEnglish() {
        return english;
    }

    @Override
    public String toString() {
        return getGreek();
    }

}
