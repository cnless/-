package linked_list;

/**
 * @Author dsk
 * @Date 2021/9/8 15:22
 */
//leetcode 142
public class 环形链表2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                ListNode index1=fast;
                ListNode index2=head;
                while (index1!=index2){
                    index1=index1.next;
                    index2=index2.next;
                }
                return index2;
            }
        }
        return null;

    }
}
