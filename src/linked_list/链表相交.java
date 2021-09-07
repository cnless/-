package linked_list;

/**
 * @Author dsk
 * @Date 2021/9/5 16:49
 */
//leetcode 面试题 02.07
public class 链表相交 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA=headA;
        ListNode curB=headB;
        int lenA=0,lenB=0;
        while (curA!=null){
            lenA++;
            curA=curA.next;
        }
        while (curB!=null){
            lenB++;
            curB=curB.next;
        }
        curA=headA;
        curB=headB;
        int gap=Math.abs(lenA-lenB);
        if(lenA>lenB){
            while ((gap--)>0){
                curA=curA.next;
            }
        }else {
            while ((gap--)>0){
                curB=curB.next;
            }
        }
        while (curA!=null){
            if (curA==curB){
                return curA;
            }
            curA=curA.next;
            curB=curB.next;
        }
        return null;
    }
}
