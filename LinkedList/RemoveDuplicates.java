class RemoveDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null) {
            return head;
        }
        
        while(head.next != null && head.next.val == head.val) {
            head = head.next;
        }
        
        
        ListNode node = head;
        
        while(node != null && node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
                continue;
            }
            node = node.next;
        }
        return head;
    }
    
}