import java.util.*;
// class node{
//     int data;
//     node next;
//     node(int data)
//     {
//         this.data=data;
//         this.next=null;
//     }
// }
class reverse_list_in_groups {
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
    public static node reverse(node head, int k)
    {
        if(head==null)
        {
            return null;
        }
        node prev=null;
        node curr=head;
        node nex=head.next;
       
        int count=1;
        
        while(nex!=null)
        {
            if(count==k)
            {
                break;
            }
            curr.next=prev; 
            prev=curr;  
            curr=nex;
            nex=nex.next;
            count++;
        }
        curr.next=prev;
        if(nex!=null)
        {
        head.next=reverse(nex,k);
        }
        return curr;
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
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        node head=null;
        head=add(head,10);
        head=add(head,20);
        head=add(head,30);
        head=add(head,40);
        head=add(head,50);
        head=print(head);
        head=reverse(head,2);
        head=print(head);
        in.close();
    }
}
