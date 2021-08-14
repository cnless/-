package linked_list;

import java.util.ArrayList;

public class LinkedListMid {
    /*
    * 方法一：快慢指针
    * 取奇数链表的中间节点，偶数取上中点
    * */
    public static Node midOrDownMid(Node head){
        if(head==null||head.next==null||head.next.next==null){
            return head;
        }
        Node slow = head.next;//慢指针
        Node fast = head.next.next;//快指针
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    /*
    * 方法二：放容器里
    *
    * */
    public static Node midOrDownMid2(Node head){
        if(head==null||head.next==null||head.next.next==null){
            return head;
        }
        ArrayList<Node> temp = new ArrayList<>();
        Node cur = head;
        while (cur!=null){
            temp.add(cur);
            cur=cur.next;
        }
        return temp.get((temp.size()-1)/2);
    }
    /*
     * 取奇数链表的中间节点，偶数取上中点的前一个
     * */

    public static Node midOrUpMid(Node head){
        if(head==null||head.next==null||head.next.next==null){
            return head;
        }
        Node slow = head;//慢指针
        Node fast = head.next.next;//快指针
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}
class Node{
    String value;
    Node next;
}
