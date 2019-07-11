package tencent.list.reverse;

//递归
public class SolutionVer2 {
    public ListNode reverseList(ListNode head){
        //head.next == null, 最后一个未反序的判断条件
        if (head == null || head.next == null )
            return head;
        //递归,反转当前链表,先反转当前节点后边的链表
        ListNode p = reverseList(head.next);
        // 当前节点后都反转 curr -> next <- ... , 该变第一个箭头的方向
        // 让当前节点 curr.next==null,满足最后一个未反序的判断条件
        head.next.next = head ;
        head.next = null;
        return p;
    }
}
