package com.samplestringrev;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Pavan Kumar on 26/04/2017.
 */
public class StringReverseTest {
    StringReverse stringReverse;

    @Before
    public void setUp() throws Exception {
        stringReverse = new StringReverse();
    }

    @Test
    public void reversetest1() throws Exception {
        Assert.assertEquals("tset", stringReverse.reverse("test"));
    }

    @Test
    public void reversetest2() throws Exception {
        Assert.assertEquals("tac", stringReverse.reverse("cat"));
    }


}