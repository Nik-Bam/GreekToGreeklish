package com.paidaki.Greeklish;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        StringBuilder strB = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("/input.txt")))) {

            String line = br.readLine();

            while (line != null) {
                strB.append(Parser.parse(line));
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.append(strB);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
