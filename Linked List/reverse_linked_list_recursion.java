import java.util.*;
class node{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class reverse_linked_list_recursion {
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
    public static node reverse(node head,node prev)
    {
        if(head==null)
        {
            return head;
        }
        if(head.next==null)
        {
            head.next=prev;
            return head;
        }
        node curr=head.next;
        head.next=prev;
        prev=head;
        head=reverse(curr,prev);
        return head;
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
        head=reverse(head,null);
        head=print(head);
        in.close();

    }
}
