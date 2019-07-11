package tencent.sort.merge_sort;

import tencent.list.mergeOrder.ListNode;

public class MergeSort {
    public ListNode sortList (ListNode head){
        return mergeSort(head);
    }
    public ListNode mergeSort(ListNode node){
        //划分到头的条件
        if (node == null || node.next ==null)
            return node;
        ListNode fast = node;
        ListNode slow = node;
        ListNode mid = node;
        while (fast != null && fast.next !=null){
            fast = fast.next.next;
            mid = slow;
            slow = slow.next;
        }
        mid.next = null;
        ListNode l1 = mergeSort(node);
        ListNode l2 = mergeSort(slow);
        return mergeTwoLists(l1,l2);
    }
    public ListNode mergeTwoLists (ListNode l1 , ListNode l2){
        ListNode pre = new ListNode(-1);
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
}
