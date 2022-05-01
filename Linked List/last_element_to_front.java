import java.util.*;
class last_element_to_front {
    public static node add(node head,int n)
    {
        node newnode=new node(n);
        node temp=head;
        if(head==null)
        {
            head=newnode;
            return head;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    public static node front(node head)
    {
        node temp=head;
        node prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next; 
        }
        prev.next=null;
        temp.next=head;
        return temp;
    }
    public static node print(node head)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        return head;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        node head=null;
        head=add(head,10);
        head=add(head,20);
        head=add(head,30);
        head=add(head,40);
        head=add(head,50);
        head=print(head);
        head=front(head);
        head=print(head);
        in.close();

    }
}
