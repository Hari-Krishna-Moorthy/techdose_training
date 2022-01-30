class ReverseBetween {
	 public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode baseHead = new ListNode(-1, head);
        ListNode res = baseHead;  
        int i = 1;
        while(res != null && i<left){ 
            res = res.next;
            i++;
        }
        
        ListNode headReversed = null;
        ListNode reversed = null;
        head = res.next;
        
        while(head != null && i <= right){

            reversed = new ListNode(head.val, reversed);
            if(headReversed == null)
                 headReversed=reversed;   
            head = head.next;
            i++;
        }
        
        if(headReversed == null)
            return baseHead.next;
     
        headReversed.next = head; // add tail
        
        res.next = reversed; // add middle( reversed + tail) to beginning of the head
        
        return baseHead.next;       
    }
}