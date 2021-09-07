package linked_list;

/**
 * @Author dsk
 * @Date 2021/9/2 22:39
 */
//剑指offer 22
public class 链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&k>0){
            fast=fast.next;
            k--;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}