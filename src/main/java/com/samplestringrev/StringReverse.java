package com.samplestringrev;

/**
 * Created by Pavan Kumar on 26/04/2017.
 */
public class StringReverse {
    public String reverse(String input) {
        char[] inputarr = input.toCharArray();
        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
            char temp = inputarr[i];
            inputarr[i] = inputarr[j];
            inputarr[j] = temp;
        }
        return new String(inputarr);
    }
}
