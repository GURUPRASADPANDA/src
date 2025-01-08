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