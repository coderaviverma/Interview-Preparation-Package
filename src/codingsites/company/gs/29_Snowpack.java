package testclass.gs;/* Problem Name is &&& Snowpack &&& PLEASE DO NOT REMOVE THIS LINE. */

/*
** Instructions to candidate.
**  1) Given an array of non-negative integers representing the elevations
**     from the vertical cross section of a range of hills, determine how
**     many units of snow could be captured between the hills. 
**
**     See the example array and elevation map below.
**                                 ___
**             ___                |   |        ___
**            |   |        ___    |   |___    |   |
**         ___|   |    ___|   |   |   |   |   |   |
**     ___|___|___|___|___|___|___|___|___|___|___|___
**     {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0}
**                                 ___
**             ___                |   |        ___
**            |   | *   *  _*_  * |   |_*_  * |   |
**         ___|   | *  _*_|   | * |   |   | * |   |
**     ___|___|___|_*_|___|___|_*_|___|___|_*_|___|___
**     {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0}
**
**     Solution: In this example 13 units of snow (*) could be captured.
**  
**  2) Consider adding some additional tests in doTestsPass().
**  3) Implement computeSnowpack() correctly.
*/

import java.io.*;
import java.util.*;

class Solution
{
  /*
  **  Find the amount of snow that could be captured.
  */
  public static Integer computeSnowpack(Integer[] arr)
  {
	if(arr.length < 3) {
		return 0;
	}
  	int[] left = new int[arr.length];
	int[] right = new int[arr.length];

	left[0] = arr[0];
	for(int i =1; i < arr.length; i++) {
		left[i] = Math.max(arr[i], left[i-1]);
	}

	right[arr.length - 1] = arr[arr.length - 1];
	for(int i = arr.length - 2; i >= 0; i--) {
		right[i] = Math.max(arr[i], right[i+1]);
	}

	int snowCount = 0;
	for(int i = 0; i < arr.length; i++) {
		snowCount += Math.min(left[i], right[i]) - arr[i];
	}
	return snowCount;
  }

  /*
  **  Returns true if the tests pass. Otherwise, returns false;
  */
  public static boolean doTestsPass()
  {
  boolean result = true;
  result &= computeSnowpack(new Integer[]{0,1,3,0,1,2,0,4,2,0,3,0}) == 13;
  
  return result;
  }

  /*
  **  Execution entry point.
  */
  public static void main(String[] args)
  {
  if(doTestsPass())
  {
    System.out.println("All tests pass");
  }
  else
  {
    System.out.println("Tests fail.");
  }
  }
}