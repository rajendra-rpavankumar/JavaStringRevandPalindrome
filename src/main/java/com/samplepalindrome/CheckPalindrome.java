package com.samplepalindrome;

import com.samplestringrev.StringReverse;

/**
 * Created by Pavan Kumar on 26/04/2017.
 */
public class CheckPalindrome {
    public boolean IsPalindrome(String input) {
        StringReverse reverse = new StringReverse();
        return input.equals(reverse.reverse(input));
    }
}
