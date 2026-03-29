/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        int sizea  =0;
        ListNode tempa = head1;
        while(tempa!=null){
            tempa = tempa.next;
            sizea++;
        }
           int sizeb  =0;
        ListNode tempb = head2;
        while(tempb!=null){
            tempb = tempb.next;
            sizeb++;
        }
        tempa = head1;
        tempb = head2;
        if(sizea>sizeb){
            for(int i = 1; i<=sizea-sizeb;i++){
                tempa = tempa.next;
            }
        }
            else{
                for(int j =1 ; j<=sizeb-sizea;j++){
                tempb = tempb.next;
            }
        }
        while(tempa!=tempb){
            tempa= tempa.next;
            tempb= tempb.next;
        }
        return tempa;

        
    }
}
