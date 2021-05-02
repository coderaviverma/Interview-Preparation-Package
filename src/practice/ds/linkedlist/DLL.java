package practice.ds.linkedlist;

public class DLL {
    Node head;



    class Node{
        Node next;
        Node prev;
        int data;

        Node(int data){
            this.data=data;
        }

    }

    public void push(int data){

        Node node=new Node(data);
        node.next=head;
        node.prev=null;

        if (head!=null){
            head.prev=node;
        }

        head=node;
    }

    public void insertAfter(Node prev,int data){



    }

}
