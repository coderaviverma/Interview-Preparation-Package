package testclass.done;

import java.util.Arrays;

public class InterviewTest {

    public static void main(String[] args) {
        int[] A = {21, 3, 17, 18, 13, 34, 35, 23};
        int X = 22;
        int n = A.length;
        Arrays.sort(A);

//        Arrays.stream(A).forEach(System.out::println);

        int start = 0;
        int end = n - 1;
        boolean isSumFound = false;


        while (start < end) {
            int sum = A[start] + A[end];
            if (sum == X) {
                isSumFound = true;
                break;
            } else if (sum > X) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println("Sum found - " + isSumFound);

    }
}
