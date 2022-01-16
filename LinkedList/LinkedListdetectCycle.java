class LinkedListdetectCycle {
	public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) {
            return null;
        }
        ListNode t1=head, t2=head;
        while(t2!=null && t2.next!=null && t2.next.next!=null) {
            t1 = t1.next;
            t2 = t2.next.next;
            if(t1==t2) {
                break;
            }
        }
        t1 = head;
        while(t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
    
}