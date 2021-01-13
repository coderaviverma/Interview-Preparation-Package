package language.java.datastructure.linkedlist.RemoveDuplicateFromSortedLinkedList;

public class RemoveAllNumberHavingDuplicate {

    /*
    //Remove all occurrences of duplicates from a sorted Linked List
    // Input : 23->28->28->35->49->49->53->53
    //Output : 23->35
    //
    // Input : 11->11->11->11->75->75
    //Output : empty List*/


    Node head=null; /* head of linked list */
    class Node
    {
        int val; /* value in the node */
        Node next;
        Node(int v)
        {
            /* default value of the next
               pointer field */
            val = v;
            next = null;
        }
    }


    /* Function to insert data nodes into
     the Linked List at the front */
    public void insert(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }


    public void removeAllDuplicate(){
        Node dummy=new Node(0);

        dummy.next=head;
        Node prev=dummy;
        Node curr=head;



        while (curr!=null){


            while (curr.next!=null && prev.next.val ==curr.next.val){
                curr=curr.next;
            }

            if (prev.next==curr){

                prev=prev.next;
            }else {
                prev.next=curr.next;

            }

            curr=curr.next;

        }

        head=dummy.next;

    }


    public void printList()
    {
        Node trav=head;
        if (head==null)
            System.out.print(" List is empty" );
        while (trav != null)
        {
            System.out.print(trav.val + " ");
            trav = trav.next;
        }
    }

    public static void main(String[] args) {
        RemoveAllNumberHavingDuplicate ll = new RemoveAllNumberHavingDuplicate();
        ll.insert(53);
        ll.insert(53);
        ll.insert(49);
        ll.insert(49);
        ll.insert(35);
        ll.insert(28);
        ll.insert(28);
        ll.insert(23);
        System.out.println("Before removal of duplicates");
        ll.printList();

        ll.removeAllDuplicate();

        System.out.println("\nAfter removal of duplicates");
        ll.printList();


    }
}
