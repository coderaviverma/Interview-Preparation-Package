package practice.ds.linkedlist;

public class PalindromeLL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode ll= new ListNode(1);
        ll.next=new ListNode(2);
        ll.next.next=new ListNode(3);
        ll.next.next.next=new ListNode(3);
        ll.next.next.next.next=new ListNode(2);
        ll.next.next.next.next.next=new ListNode(2);

        System.out.println(isPalindrome(ll));
    }

    public static boolean isPalindrome(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while(slow!=null){
            if(slow.val!=fast.val) return false;

            slow = slow.next;
            fast= fast.next;

        }

        return true;
    }

    private static ListNode reverse(ListNode head){
        ListNode prev=null;

        while(head!=null ){
            ListNode next= head.next;
            head.next=prev;
            prev=head;
            head=next;

        }
        return prev;
    }
}
