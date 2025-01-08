/*Single Linked List

Methods written:
->Create node-create()

->Display node data-display()

->Insert new node-insert_begining(int e)
                 -insert_end(int e)

->Delete a node-delete_begining()
               -delete_end()

->No of nodes linked-count(){For total number of elements}
                    -evencount(){For total number of even elements}
                    -oddcount(){For total number of odd elements}

->Sum of the datas-SumOfElements(){For sum of all elements}
                  -EvenSum(){For sum of even elements}
                  -OddSum(){For sum of odd elements}

->Finding elements-BiggestElement()
                  -SmallestElement()
                  -SecondBiggestElement()
                  -SecondSmallestElement()

*/

import java.util.Scanner;
class Node
{
	int data;
	Node next;
	Node()
	{

	}
	Node(int data,Node next)
	{
		this.data=data;
		this.next=next;
	}
}
class sl
{
	static Node head=null;
	static Scanner sc=new Scanner(System.in);
	static void create()
	{ 
		Node newnode=null;
		Node ptr=null;
		char ch='y';
		int c=0;
	    while(ch=='y')
	    {
	    	newnode=new Node();
	    	c++;
	    	System.out.println("Enter node number "+c+" data");
	    	newnode.data=sc.nextInt();
	    	if(head==null)
	    	{
	    		head=newnode;
	    	}
            else
            {
            	ptr.next=newnode;
            }
            ptr=newnode;
            System.out.println("Enter 'y' if you want to create new node:");
            ch=sc.next().charAt(0); 
	    }
	}
	static void display()
	{
		System.out.println("Elements are:");
		Node ptr=head;
		while(ptr!=null)
	    {
	    	System.out.println(ptr.data);
	    	ptr=ptr.next;
	    }
	}
	static void insert_begining(int e)
	{
		Node newnode=new Node();
		newnode.data=e;
		System.out.println(e+" inserted at the begining");
		newnode.next=head;
		head=newnode;
	}
	static void insert_end(int e)
	{
		Node newnode=new Node();
		newnode.data=e;
		newnode.next=null;
		System.out.println(e+" inserted at the end ");
		if(head==null)
		{
			head=newnode;
			return;
		}
		Node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=newnode;
	}
	static void delete_begining()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("No element");
			return;
		}
		System.out.println("Element deleted:"+temp.data);
		head=temp.next;
	}
	static void delete_end()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("No element");
			return;
		}
		if(head.next==null)
		{
			System.out.println("Element deleted:"+head.data);
			return;
		}
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		System.out.println("Element deleted:"+temp.next.data);
		temp.next=null;
	}
	static int count()
	{
		Node temp=head;
		int c=0;
		if(head==null)
		{
			System.out.println("No element");
			return 0;
		}
		while(temp!=null)
		{
           c++;
           temp=temp.next;
		}
		return c;
	}
	static int SumOfElements()
	{
		Node temp=head;
		int s=0;
		if(head==null)
		{
			System.out.println("No element");
			return 0;
		}
		while(temp!=null)
		{
			s=s+temp.data;
			temp=temp.next;
		}
		return s;
	}
	static int evencount()
	{
		Node temp=head;
		int c=0;
		if(head==null)
		{
			System.out.println("No element");
			return 0;
		}
		while(temp!=null)
		{
			if(temp.data%2==0)
			{
				c++;
			}
			temp=temp.next;
		}
		return c;
	}
	static int oddcount()
	{
		Node temp=head;
		int c=0;
		if(head==null)
		{
			System.out.println("No element");
			return 0;
		}
		while(temp!=null)
		{
			if(temp.data%2!=0)
			{
				c++;
			}
			temp=temp.next;
		}
		return c;
	}
	static int EvenSum()
	{
		Node temp=head;
		int es=0;
		if(head==null)
		{
			System.out.println("No element");
			return 0;
		}
		while(temp!=null)
		{
			if(temp.data%2==0)
			{
				es=es+temp.data;
			}
			temp=temp.next;
		}
		return es;
	}
	static int OddSum()
	{
		Node temp=head;
		int os=0;
		if(head==null)
		{
			System.out.println("No element");
			return 0;
		}
		while(temp!=null)
		{
			if(temp.data%2!=0)
			{
				os=os+temp.data;
			}
			temp=temp.next;
		}
		return os;
	}
	static void BiggestElement()
	{
		Node temp=head; 
		if(head==null)
		{
			System.out.println("No element"); 
		}
		int big=Integer.MIN_VALUE;
		while(temp!=null)
		{
			if(big<temp.data)
			{
				big=temp.data;
			}
			temp=temp.next;
		}
        System.out.println("Biggest Element:"+big);
	}
	static void SmallestElement()
	{
		Node temp=head; 
		if(head==null)
		{
			System.out.println("No element"); 
		}
		int small=Integer.MAX_VALUE;
		while(temp!=null)
		{
			if(small>temp.data)
			{
				small=temp.data;
			}
			temp=temp.next;
		}
        System.out.println("Smallest Element:"+small);
	}
	static void SecondBiggestElement()
	{
		Node temp=head; 
		if(head==null)
		{
			System.out.println("No element"); 
		}
		int big=Integer.MIN_VALUE;
		int sbig=Integer.MIN_VALUE;
		while(temp!=null)
		{
			if(big<temp.data)
			{
				big=temp.data;
			}
			temp=temp.next;
		}
		temp=head;
		while(temp!=null)
		{
            if(temp.data!=big && sbig<temp.data)
            {
            	sbig=temp.data;
            }
            temp=temp.next;
		}
		System.out.println("Second Biggest Element:"+sbig);
	}
	static void SecondSmallestElement()
	{
		Node temp=head; 
		if(head==null)
		{
			System.out.println("No element"); 
		}
		int small=Integer.MAX_VALUE;
		int ssmall=Integer.MAX_VALUE;
		while(temp!=null)
		{
			if(small>temp.data)
			{
				small=temp.data;
			}
			temp=temp.next;
		}
		temp=head;
		while(temp!=null)
		{
            if(temp.data!=small && ssmall>temp.data)
            {
            	ssmall=temp.data;
            }
            temp=temp.next;
		}
		System.out.println("Second Smallest Element:"+ssmall);
	}
	static void insert_any(int ele)
	{
		int pos ;
		System.out.println("enter a position to insert a element ");
		pos = sc.nextInt();
		int c = count();
		if(pos<=0 || pos>c+1)
		{
			System.out.println("invalid positon");
			return;
		}
		if(pos==1)
		{
			insert_begining(ele);
			return;
		}
		if(pos == c+1)
		{
			insert_end(ele);
			return;
		}
		Node newnode=new Node();
		newnode.data = ele;
		newnode.next=null;
		int i = 1;
		Node temp = head;
		while(i<pos-1)
		{
          i++;
		  temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
	static void delete_any()
	{
		int pos ;
		System.out.println("enter a position to delete a element ");
		pos = sc.nextInt();
		int c = count();
		if(pos<=0 || pos>c)
		{
			System.out.println("invalid positon");
			return;
		}
		if(pos==1)
		{
			delete_begining();
			return;
		}
		if(pos == c)
		{
			delete_end();
			return;
		}
		int i = 1;
        Node temp = head;
		while(i<pos-1)
		{
         temp = temp.next;
		 i++;
		}
		temp.next=temp.next.next;
		System.out.println("deleted element is "+temp.data);
	}
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

}
class Test
{ 
	public static void main(String args[])
	{
        sl.create();
        sl.display(); 
		sl.reverse();
		sl.display(); 
		//sl.delete_any();
		//sl.display();
        // sl.insert_begining(5);
        // sl.display();
        // sl.insert_end(100);
        // sl.display();
        // System.out.println("Total number of elements:"+sl.count());
        // System.out.println("Total number of even elements:"+sl.evencount());
        // System.out.println("Total number of odd elements:"+sl.oddcount());
        // sl.BiggestElement();
        // sl.SmallestElement();
        // sl.SecondBiggestElement();
        // sl.SecondSmallestElement();
        // System.out.println("Sum of all the elements:"+sl.SumOfElements());
        // System.out.println("Sum of all the even elements:"+sl.EvenSum());
        // System.out.println("Sum of all the odd elements:"+sl.OddSum());
        // sl.delete_begining();
        // sl.display();
        // sl.delete_end();
        // sl.display();
        // sl.BiggestElement();
        // sl.SmallestElement();
        // sl.SecondBiggestElement();
        // sl.SecondSmallestElement();

	}
}