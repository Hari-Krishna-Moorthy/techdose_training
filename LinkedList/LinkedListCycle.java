class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) {
            return false;
        }
        ListNode t1=head, t2=head;
        while(t2!=null && t2.next!=null && t2.next.next!=null) {
            t1 = t1.next;
            t2 = t2.next.next;
            if(t1==t2) {
                return true;
            }
        }
    return false;
    }
}