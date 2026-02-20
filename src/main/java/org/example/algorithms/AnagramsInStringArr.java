package org.example.algorithms;

import java.util.HashMap;

public class AnagramsInStringArr {

    public static void main(String[] args) {
        String txt = "forxxorflkjrodiurof";
        String pat = "for";

        slidingwindow(txt, pat);
    }

    public static void slidingwindow(String txt, String pat) {
        int countAna = 0;
        int tl = txt.length();
        int pl = pat.length();

        HashMap<Character, Integer> patwindow = new HashMap<>();
        for (int j = 0; j < pat.length(); j++) {
            patwindow.put(pat.charAt(j), patwindow.getOrDefault(pat.charAt(j), 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        // ✅ Build the first window
        for (int i = 0; i < pl; i++) {
            char c = txt.charAt(i);
            if (patwindow.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
            }
        }

        if (window.equals(patwindow)) {
            countAna++;
        }

        // ✅ Slide the window
        for (int end = 1; end <= tl - pl; end++) {
            char left = txt.charAt(end - 1);
            if (window.containsKey(left)) {
                window.put(left, window.get(left) - 1);
                if (window.get(left) == 0) {
                    window.remove(left);
                }
            }

            char right = txt.charAt(end + pl - 1);
            if (patwindow.containsKey(right)) {
                window.put(right, window.getOrDefault(right, 0) + 1);
            }

            if (window.equals(patwindow)) {
                countAna++;
            }
        }

        System.out.println(countAna);
    }
}
