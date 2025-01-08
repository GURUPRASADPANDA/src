import java.util.*;
class mqueue{
    int front,rear,max;
    int arr[];
    mqueue(int max)
    {
        this.max = max;
        front = -1;
        rear = -1;
        arr = new int[max]; 
    }
    void enqueue(int ele)
    {
        if(rear == max-1)
        {
            System.out.println("stack over flowed");
            return;
        }
        if(front == -1)
        {
            front = 0;
        }
            rear++;
            arr[rear] = ele;
            System.out.println("element "+ ele +" is insserted");
    }
    void dequeue()
    {
        if(front == -1)
        {
            System.out.println("stack is underflowed or no element"); 
            return;
        }
        System.out.println("element "+ arr[front] +" is deleted");
        int i = front;
        while(i!=rear)
        {
            arr[i] = arr[i+1];
            i++;
        }
        rear --;
        
        if(front==0 && rear==-1)
        {
            front = -1;
            rear = -1;
            return;
        }
    }
    void peek()
    {
        if(isunderflow())
        {
           System.out.println("Queue have no element or underflow");
           return;
        }
        System.out.println("top element is "+arr[front]);
    }
    void display()
    {
       if(front==-1)
        {
            System.out.println("Queue is underflow or no element");
            return;
        }
        System.out.println("elements are : ");
        int i = front;
        while(i <= rear)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
    }
    boolean isunderflow()
    {
        if(front==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isoverflow()
    {
        if(rear==max-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    

}
class Test
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements you want in Queue");
    mqueue s = new mqueue(sc.nextInt());
    while(true)
    {
        System.out.println("enter your choice\n1.enqueue\n2.dequeue\n3.peek\n4.display\n5.exist");
        switch(sc.nextInt())
        {
          case 1:System.out.println("enter element you want to enqueue");
                s.enqueue(sc.nextInt());
                break;
          case 2:s.dequeue();
                 break;
          case 3:s.peek();
                 break;
          case 4:s.display();
                 break;
          case 5:System.exit(0);
          default: System.out.println("invalid input");
        }
    }
    }
}