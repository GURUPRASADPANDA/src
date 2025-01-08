import java.util.*;
public class Stack
{
    int top,max;
    int arr[];
    Stack(int max)
    {
        this.max = max;
        top = -1;
        arr = new int[max]; 
    }
    void push(int ele)
    {
        if(top == max-1)
        {
            System.out.println("stack over flowed");
        }
        else
        {
            top = top + 1;
            arr[top] = ele;
            System.out.println("element "+ ele +" is insserted");
        }
    }
    void pop()
    {
        if(top == -1)
        {
            System.out.println("stack is underflowed or no element"); 
        }
        else
        {
            top = top - 1;
        }
    }
    void peek()
    {
        System.out.println("top element is "+arr[top]);
    }
    void display()
    {
        for(int i = top ; i >=0 ; i--)
        {
            System.out.println(arr[i]);
        }
    }

}
class Test
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements you want in stack");
    Stack s = new Stack(sc.nextInt());
    while(true)
    {
        System.out.println("enter your choice\n1.push\n2.pop\n3.peek\n4.display\n5.exist");
        switch(sc.nextInt())
        {
          case 1:System.out.println("enter element you want to push");
                s.push(sc.nextInt());
                break;
          case 2:s.pop();
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