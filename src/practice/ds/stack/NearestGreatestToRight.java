package practice.ds.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestGreatestToRight {

    public static void main(String[] args) {

        int[] a={1,3,4,2,5,1};

        solve2(a);

    }

    private static void solve(int[] a){
        //Traverse right to left

        List<Integer> ls=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();

        for (int i = a.length-1; i >=0; i--) {

            if (stack.empty()){
                ls.add(-1);
            }else if (stack.size()>0 && stack.peek()>a[i]){
                ls.add(stack.pop());
            }else if (stack.size()>0 && stack.peek()<=a[i]){
                while (stack.size()>0 && stack.peek()<=a[i]){
                    stack.pop();
                }
                if (stack.size()==0){
                    ls.add(-1);
                }else {
                    ls.add(stack.pop());
                }

            }

            stack.push(a[i]);

        }
        Collections.reverse(ls);
        System.out.println(ls.toString());
    }

    //On
    private static void solve2(int[] a){

        int[] res=new int[a.length];
        Stack<Integer> stack=new Stack<>();


        for (int i=a.length-1;i>=0;i--){

            if (!stack.empty()){
                while (!stack.isEmpty() && stack.peek()>=a[i]){
                    stack.pop();
                }
            }
            res[i]=stack.empty()?-1:stack.peek();
            stack.push(a[i]);


        }


        for (int i = 0; i < a.length; i++)
            System.out.println(a[i] +
                    " --> " + res[i]);

    }

}
