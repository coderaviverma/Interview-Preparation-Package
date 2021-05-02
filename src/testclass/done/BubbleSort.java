package testclass.done;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {5, 2, 6, 7, 8, 3, 4, 1,1,1};

        Arrays.stream(a).forEach(System.out::print);

        System.out.println();
        int n = a.length;

        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }

        Arrays.stream(a).forEach(System.out::print);



    }
}
