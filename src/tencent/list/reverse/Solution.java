package tencent.list.reverse;
/*
反序链表,head 用来得到下一个结点, p 移动到当前 head 结点, q 作为上一个结点

不能使用这种方法,p, q, 的改变也会改变 head, 一定要保证当前 curr 在 head.next 之前
            head = head.next;
            p = head ;
            p.next = q;
            q = p;
 (2)还要注意结束判断的标志,通常用 curr!=null 来判断,curr=curr.next 移动
 */
public class Solution {
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void  main(String[] args){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        Solution solution = new Solution();
//        ListNode head = listNode1;

        ListNode reverse = solution.reverseList(listNode1);

//        while (listNode1.next != null ){
//            System.out.println(listNode1.val);
//            listNode1 = listNode1.next;
//        }

        while (reverse != null ){
            System.out.println(reverse.val);
            reverse = reverse.next;
        }
    }

}
