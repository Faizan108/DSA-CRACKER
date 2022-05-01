import java.util.*;
class first_node_of_loop {
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
    public static node detect_first_node(node head)
    {
        node slow=head;
        node fast=head;
        int c=0;
        while(slow!=null&&fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                c=1;
                break;
            }
        }
        if(c==1)
        {
            slow=head;
            while(slow!=fast)
            {
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }else{
        return head;
        }
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
        head.next.next.next=head.next.next;
        node temp=detect_first_node(head);
        System.out.println(temp.data);
        in.close();
    }
}
