package practice.ds.recursion;

import java.util.Stack;

public class DeleteMiddleElementStack {

    public static void main(String[] args) {



        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(6);
        stack.push(2);
        stack.push(11);
        stack.push(3);
        System.out.println(stack);

        solve(stack,2);
        System.out.println(stack);


    }

    static void  solve(Stack<Integer> stack,int k){

        if (k==1){
            stack.pop();
            return;
        }


        int temp=stack.pop();
        solve(stack, k-1);

        stack.push(temp);

    }
}
