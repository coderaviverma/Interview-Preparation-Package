package company.mmt;

public class Question2 {
//    Name : Avinash Verma
//    Current organization : Optum, UnitedHealth Group
//    Total years of experience: 5.5

    public static void main(String[] args) {
        int[] a={3,2,1,5,4};
//        int[] a={1,2,3,4,5,6,7};
//        int[] a={1,2,3,4,5};
//        int[] a={1,2,-3,4,5};

        int k=5;
        int outPut=findMinMax(a,k);

        System.out.println(outPut);
    }


    private static int findMinMax(int[] a,int k){

        if (k>a.length) return -1;

        int[] max=new int[a.length-(k-1)];
        int counter=0;
        for (int i = 0; i < a.length-(k-1); i++) {
            max[counter]=min(a,i,i+k);
            counter++;
        }

        return max(max);
    }

    private static int min(int[] min,int i,int k){
        int minNum=Integer.MAX_VALUE;
        for (int j=i;j <k;j++) {

            if (minNum>min[j]) {
                minNum = min[j];
            }
        }
        return minNum;
    }

    private static int max(int[] max){
        int maxNum=Integer.MIN_VALUE;
        for (int m:max) {
            if (maxNum<m) {
                maxNum = m;
            }
        }
        return maxNum;
    }



}
