/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;int c=0;
        if(head==null||head.next==null||k==0)
         return head;
        
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        k=k%c;
        temp=head;
        while(temp.next!=null)
        {
               temp=temp.next;
        }
        temp.next=head;
        temp=head;
        c=c-k;
        int t=1;
        while(t!=c)
        {
            temp=temp.next;
            t++;
        }
        head=temp.next;
        temp.next=null;
        return head;
        
    }
}