package language.java.datastructure.queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {

    static Queue wq=new ArrayDeque(1);


    public static void main(String[] args) {

        wq.add('a');
//        wq.offer("Avi 2");
//        wq.add("Avi 3");
//        wq.add("Avi 4");

        char aa= (char) wq.poll();
        System.out.println(wq.poll());
        System.out.println(wq.poll());


        Stack stack=new Stack();
        stack.push("abi");

//        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }


    public static char popCharacter(char s){
        return (char)wq.poll();
    }



}
