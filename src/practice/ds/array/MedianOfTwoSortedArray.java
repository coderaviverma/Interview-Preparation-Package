package practice.ds.array;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7, 8};

//        bruteSolve(a, b);

        System.out.println(solve(a, b));
        ;
    }

    private static void bruteSolve(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int i = 0;

        int[] c = new int[m + n];

        for (; i < m; i++) {
            c[i] = a[i];
        }
        i = 0;
        for (int j = m; j < c.length; j++) {
            c[j] = b[i++];
        }

        int med = c.length / 2;

        Arrays.sort(c);

        System.out.println(c[med]);

    }

    //Optimized Way
    private static double solve(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;//bigger

        int begin1 = 0, end1 = n;
        while (begin1 <= end1) {
            int i1 = (begin1 + end1) / 2;
            int i2 = ((n + m + 1) / 2) -i1 ;

            int min1 = (i1 == n) ? Integer.MAX_VALUE : a[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a[i1 - 1];

            int min2 = (i2 == m) ? Integer.MAX_VALUE : a[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : a[i2 - 1];

            if ((max1 <= min2) && (max2 <= min2)) {
                if ((n + m) % 2 == 0) {
                    return ((double) (Math.max(max1, max2) + Math.min(min1, min2) / 2));
                } else {
                    return ((double) (Math.max(max1, max2) / 2));
                }
            } else if (max1 > max2) {
                end1 = i1 - 1;
            } else {
                begin1 = i1;
            }

        }

        return begin1;
    }

}
