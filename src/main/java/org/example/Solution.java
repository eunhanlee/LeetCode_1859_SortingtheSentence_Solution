package org.example;

public class Solution {

    /**
     * Sorts the words in the input sentence based on the numeric value at the end of each word.
     *
     * not needed-Empty input
     * not needed-Input with repeated numeric values
     *
     * @param s The input sentence to be sorted.
     * @return The sorted sentence.
     */
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splitedStr = s.split(" ");
        String[] splitedSentence = new String[splitedStr.length];

        for (String val : splitedStr) {
            int lastIndex = val.charAt(val.length() - 1) - '1';
            splitedSentence[lastIndex] = val.substring(0, val.length() - 1);
        }

        for (String val : splitedSentence) {
            sb.append(val);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
