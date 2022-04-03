package practice.ds;

import java.util.Collections;
import java.util.LinkedList;

public class Test {
    class Node {

        int data;
        Node next;

        Node(int item) {
            data = item;
            next = null;
        }
    }


    public static void main(String[] args) {
//List1: 5->6->3 // represents number 563
//List2: 8->4->2 // represents number 842

//        Node ll=new Node();
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(7);
        ll1.add(5);
        ll1.add(9);
        ll1.add(4);
        ll1.add(6);

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(8);
        ll2.add(4);
//        ll2.add(2);

        System.out.println(solve(ll1,ll2).toString());

    }


    private static LinkedList<Integer> solve(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
        LinkedList<Integer> res = new LinkedList<>();

        Collections.reverse(ll1);
        Collections.reverse(ll2);

        LinkedList<Integer> temp1 = null;
        LinkedList<Integer> temp2 = null;
        if (ll1.size() > ll2.size()) {
            temp1 = ll1;
            temp2 = ll2;
        } else {
            temp1 = ll2;
            temp2 = ll1;
        }

        int carryForward = 0;

        for (int i = 0; i < temp1.size(); i++) {

            int v1 = temp1.get(i) + carryForward;
            carryForward = 0;

            if (i < temp2.size()) {
                int v2 = temp2.get(i);
                v1 = v1 + v2;
            }

            if (v1 >= 10) {
                carryForward = v1 / 10;
                v1 = v1 % 10;
            }

            res.addFirst(v1);
        }

        if (carryForward>0){
            res.addFirst(carryForward);
        }

        return res;
    }
}
