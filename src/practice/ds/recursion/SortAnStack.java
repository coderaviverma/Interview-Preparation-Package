package practice.ds.recursion;

import java.util.Stack;

public class SortAnStack {

    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(6);
        stack.push(2);
        stack.push(11);
        stack.push(3);
        System.out.println(stack);

        SortAnStack sortAnStack=new SortAnStack();
        sortAnStack.sort(stack);

        System.out.println(stack);
    }

    void  sort(Stack<Integer> stack){

      if (!stack.isEmpty()){
          int x=stack.pop();
          sort(stack);

          insertSort(stack,x);

      }
    }

    void insertSort(Stack<Integer> stack,int n){

        if (stack.isEmpty() || n> stack.peek()){
            stack.push(n);
            return;
        }

        int temp=stack.pop();

        insertSort(stack,n);

        stack.push(temp);
    }


}
