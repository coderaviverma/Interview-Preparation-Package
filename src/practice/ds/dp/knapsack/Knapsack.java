package practice.ds.dp.knapsack;

import java.util.Arrays;

public class Knapsack {

    public static void main(String[] args) {


        knapsack01();


    }

    private static void knapsack01(){
        //Find the maximum profit
        int[] wt={1,3,4,5};
        int[] val={1,4,5,7};
        int bagcap=7;
        int n=wt.length;
        t=new int[bagcap+1][n+1];

//        Arrays.stream(t).forEach(a -> Arrays.fill(a, -1));
        t[0][0]=1;
test();
//        System.out.println("knapsack01Sol - "+knapsack01Sol(wt,val,bagcap,n));
//        System.out.println("knapsack01SolMemo - "+knapsack01SolMemo(wt,val,bagcap,n));

    }

    private static int test(){
        System.out.println("testing");
        return t[0][0]=test1();
    }
  private static int test1(){
        System.out.println("testing 1");
        return 5;
    }

    private static int knapsack01Sol(int[] wt,int[] val,int W,int n){
        if(n==0 || W==0)return 0;

        if (wt[n-1]<=W){
            return Math.max(val[n-1]+knapsack01Sol(wt, val, W-wt[n-1], n-1),knapsack01Sol(wt, val, W, n-1));
        }else {
            return knapsack01Sol(wt, val, W, n-1);
        }
    }
    private static int t[][];
    private static int knapsack01SolMemo(int[] wt,int[] val,int W,int n){
        if(n==0 || W==0)return 0;

        if (wt[n-1]<=W){
            return t[W][n]=Math.max(val[n-1]+knapsack01Sol(wt, val, W-wt[n-1], n-1),knapsack01Sol(wt, val, W, n-1));
        }else {
            return t[W][n]=knapsack01Sol(wt, val, W, n-1);
        }
    }


}
