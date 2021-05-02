package testclass.done;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        // hollow
        testHollow(true, new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1});
        testHollow(true, new int[]{1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1});

        // not hollow
        testHollow(false, new int[]{1, 1, 0, 0, 1, 1});
        testHollow(false, new int[]{1, 0, 1, 0, 0, 0, 1, 1, 1});
        testHollow(false, new int[]{1, 1, 1, 0, 0, 0, 1, 1, 0});
        testHollow(false, new int[]{1, 1, 0, 0, 0, 1, 1});
        testHollow(false, new int[]{0, 0, 0, 1, 1, 1, 1, 1, 1});

        // test with real numbers
        testHollow(true, new int[]{-55, 28, 53, 24, 0, 0, 0, 0, 47, -85, 46, 79});

        System.out.println("Your code works!");
    }

    private static void testHollow(boolean expectation, int[] sampleArray) throws Exception {
        if (expectation != isHollow(sampleArray)) {
            throw new Exception("Your code does not work.");
        }
    }

    private static boolean isHollow(int[] sampleArray) {
  /*
    An array is considered hollow when it contains n zeros in the middle
    that are both preceded and followed by n non-zero numbers; n must be
    greater than or equal to 3. 
       
    Implement the isHollow function so that it returns true for arrays that 
    are hollow, otherwise return false.
  */

        int moun1 = 0;
        int holl = 0;
        int moun2 = 0;

        //10110011
        for (int a : sampleArray) {

            if (a == 0) {
                if (moun1 > 2) {
                    holl++;//0
                } else {
                    if (moun2>0){
                        moun2=0;
                    }
                    moun1 = 0;
                }
            } else {
                if (holl == 0) {
                    moun1++;//0
                } else {
                    moun2++;//3
                }
            }

            if (moun1 > 2 && (moun1 == holl && holl == moun2)) {
                return true;
            }

        }


        return false;
    }
}