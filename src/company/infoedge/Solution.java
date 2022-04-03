package company.infoedge;

public class Solution {

    //
    public static void main(String[] args) {
        //2,3,5,4
        //sum = 12
        //10, 2, -2, -6, 8
        //sum = 2
//        int[] a={2,3,5,4,6,1,1};
//        int[] a={10, 2, -2, -6, 8, 2, -2};
        int[] a={-10,10, 2, -2,-6, 8, 2, -2,-5};
//        int[] a={-10,10, 2, -2, -6, 8, 2, -2,-5};

//        int resStart =
//        int resEnd =


    }


    private static void solve(int[] a){
        int start=0;
        int end=0;
        int tempSum=0;
        int resStart=0;
        int resEnd=0;
        int maxSum=Integer.MIN_VALUE;
        int n=a.length-1;

        while (start<=end){




            if ((tempSum-a[start])>tempSum) {
                tempSum = tempSum - a[start];
                start++;
            }

            if (tempSum>=maxSum){
                if (tempSum==maxSum){
                    int min=end-start;
                    int resmin=resEnd-resStart;
                    if (min>resmin){
                        resStart = start;
                        resEnd = end;
                    }
                }else {
                    maxSum = tempSum;
                    resStart = start;
                    resEnd = end;
                }
            }

            if (end<n){
                end++;
            }

        }
    }
}
