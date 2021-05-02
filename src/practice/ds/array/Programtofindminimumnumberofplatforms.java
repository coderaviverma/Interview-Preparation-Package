package practice.ds.array;
// Program to find minimum number of platforms
//https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/


import java.util.Arrays;

public class Programtofindminimumnumberofplatforms {


    public static void main(String[] args) {

        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;

        System.out.println(solve(arr,dep));
    }

    private static int solve(int[] arr, int[] dept) {

        Arrays.sort(arr);
        Arrays.sort(dept);

        int plan_needed = 1;
        int result = 1;
        int i = 1;
        int j = 0;
        int n = arr.length;

        while (i < n && j < n) {

            if (arr[i] <= dept[j]) {
                plan_needed++;
                i++;
            } else if (arr[i] > dept[j]) {
                plan_needed--;
                j++;
            }

            if (plan_needed > result) {
                result = plan_needed;
            }

        }

        return result;
    }

}
