package language.java.corebasic.collection;

import java.util.Stack;

public class ListDemo {

    public static void main(String[] args) {

//
//        List<Integer> integerList=new ArrayList<>(2);
//        integerList.add(1);
//        integerList.add(2);
//        integerList.add(3);
//        integerList.add(4);
//
//        System.out.println(integerList.size());

        Stack stack=new Stack();

        stack.push(1);
        stack.push(2);


        System.out.println(stack.contains(1));
    }
}
