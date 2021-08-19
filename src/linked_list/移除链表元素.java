package linked_list;

/**
 * @Author dsk
 * @Date 2021/8/18 15:18
 */

public class 移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead=new ListNode(0);//虚拟头结点
        dummyHead.next=head;
        ListNode cur=dummyHead;
        while(cur.next!=null){
            while(cur.next.val==val){
                cur.next=cur.next.next;
                if(cur.next==null) break;
            }
            if(cur.next==null) break;
            cur=cur.next;
        }
        return dummyHead.next;

    }
}
