class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result_node = new ListNode();
		ListNode curr_node = result_node;
		
		while(l1 != null && l2 != null) {
			if(l1.val <= l2.val ) {
				curr_node.next = l1;
				l1 = l1.next;
			} else {
				curr_node.next = l2;
				l2 = l2.next;
            }
			curr_node = curr_node.next;
		}
		
		if(l1 == null) {
			curr_node.next = l2;
		}
		if(l2 == null) {
			curr_node.next = l1;
		}
		
		return result_node.next;
    }
}
