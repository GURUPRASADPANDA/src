static void reverse()
	{
		if(head==null)
		{
			System.out.println("No element"); 
		}
		Node ptr,cur,x;
		ptr = head;
		head.next = null;
		cur = ptr.next;
		x = cur.next;

		while(x.next!=null)
		{
			cur.next = ptr;
			ptr = cur;
			cur = x ;
			x = cur.next;
		}
		   cur.next = ptr;
		   ptr = cur;
		   x.next = cur;
		   head = x;
	}