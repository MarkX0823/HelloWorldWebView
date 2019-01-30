package com.markx0823dev.helloworldwebview;

import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class MyMathAndroidTest {

    @Test
    public void add() {
        // arrange
        int first = 1;
        int second = 2;
        int expect = 3;
        MyMath myMath = new MyMath();

        // act
        int actual = myMath.add(first, second);

        // assert
        assertEquals(expect, actual);
    }

    @Test
    public void multiple() {
        // arrange
        int first = 3;
        int second = 5;
        int expect =15;
        MyMath myMath = new MyMath();

        // act
        int actual = myMath.multiple(first, second);

        // assert
        assertEquals(expect, actual);
    }
}