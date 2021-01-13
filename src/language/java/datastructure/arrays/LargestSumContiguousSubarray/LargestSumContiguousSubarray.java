package language.java.datastructure.arrays.LargestSumContiguousSubarray;

public class LargestSumContiguousSubarray {

    public static void main(String[] args) {

        int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};

        LargestSumContiguousSubarray(arr);
    }

    private static int LargestSumContiguousSubarray(int[] arr){

        int max_so_far=Integer.MIN_VALUE,max_ending=0;

        for (int i = 0; i < arr.length; i++) {

            max_ending=max_ending+arr[i];

            if (max_so_far<max_ending)
                max_so_far=max_ending;

            if (max_ending<0)
                max_ending=0;
        }

        return max_so_far;
    }

}
