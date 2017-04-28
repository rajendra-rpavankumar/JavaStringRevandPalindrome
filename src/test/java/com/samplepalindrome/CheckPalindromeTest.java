package com.samplepalindrome;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Pavan Kumar on 26/04/2017.
 */
public class CheckPalindromeTest {
    CheckPalindrome palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome = new CheckPalindrome();
    }

    @Test
    public void isPalindrome() throws Exception {
        Assert.assertTrue(palindrome.IsPalindrome("madam"));
    }

    @Test
    public void isNotPalindrome() throws Exception {
        Assert.assertFalse(palindrome.IsPalindrome("cat"));
    }

    @Test
    public void isPalindrome1() throws Exception {
        Assert.assertTrue(palindrome.IsPalindrome("racecar"));
    }
}