import java.util.*;
class Node
{
    int data;
    Node next;
    Node()
    {
    }
    Node(int data)
    {
      this.data=data;
    }
}
class QSL
{
    Node front,rear;
    QSL()
    {
        front = null;
        rear = null;
    }
    void enqueue(int ele)
    {
        Node cur = new Node(ele);
        if(cur==null)
        {
            System.out.println("Q overflow");
            return;
        }
        if(front == null)
        {
            front = cur;
        }
        else
        {
           rear.next=cur;
           cur.next=null;
        }
        rear = cur;
        System.out.println(ele+" data inserted");
    }
    void dequeue()
    {
        if(front == null)
        {
            System.out.println("no element");
            return;
        }
        System.out.println("delete element ="+front.data);
        if(front==rear)
        {
            front = null;
            rear = null;
            return;
        }
        front = front.next;
    }
    void peek()
    {
        if(front == null)
        {
            System.out.println("no element");
            return ;
        }
        System.out.println("top element="+front.data);
    }
    void disp()
    {
        if(front == null)
        {
            System.out.println("no element");
        }        
        Node temp = front;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


class Test
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int ch;
   QSL s = new QSL();
    while(true)
    {
        System.out.println("enter your choice\n1.insert\n2.delete\n3.peek\n4.display\n5.exist");
        ch = sc.nextInt();
        switch(ch)
        {
          case 1:System.out.println("enter element you want to push");
                s.enqueue(sc.nextInt());
                break;
          case 2:s.dequeue();
                 break;
          case 3:s.peek();
                 break;
          case 4:s.disp();
                 break;
          case 5:System.exit(0);
          default: System.out.println("invalid input");
        }
    }
  }
}