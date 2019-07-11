package tencent.list.mergeOrder;

public class Solution {
    public ListNode mergeTwoLists (ListNode l1 , ListNode l2){
        ListNode pre = new ListNode();
        pre.next = l1.val<l2.val? l1:l2;
        ListNode prehead = pre ;

        while(l1 != null && l2 != null){
            if (l1.val <= l2.val){
                pre.next = l1;
                l1 = l1.next ;
            }
            else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
            pre.next = null;
        }
        pre.next = l1==null? l2:l1;
        return prehead.next;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l111 = new ListNode(4);
        l1.next = l11;
        l11.next = l111;

        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l222 = new ListNode(4);
        l2.next = l22;
        l22.next = l222;

        Solution solution = new Solution();
        ListNode l3 = solution.mergeTwoLists(l1 , l2 );
        while (l3!=null){
            System.out.println(l3.val);
            l3=l3.next;
        }
    }
}
