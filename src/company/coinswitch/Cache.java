package company.coinswitch;

public abstract class Cache {

    //get O(1)
    //add  O(1)
    //delete  O(1)
    //update  O(1)

    abstract String get(String key);

    abstract boolean add(String key, String value);

//    public int size(){
//
//    }

    Node head;

//    public Node add(String value){
//        Node node=new Node();
////        while (head){
////
////        }
//    }

    class Node{
        String data;
        Node next;
    }
}
