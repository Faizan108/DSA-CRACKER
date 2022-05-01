import java.util.*;
class adding_one_to_number {
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
    public static node addOne(node head) 
    { 
        node prev=null;
        node curr=head;
        node nex=head.next;
        while(nex!=null)
        {
            
            curr.next=prev; 
            prev=curr;  
            curr=nex;
            nex=nex.next;
            
        }
        curr.next=prev;
        head=curr;
        while(curr!=null)
        {
            if(curr.data!=9)
            {
                curr.data=curr.data+1;
                break;
            }
            else{
                curr.data=0;
                prev=curr;
                curr=curr.next;
                
            }
        }
        node n=new node(1);
        if(curr==null)
        {
            
            prev.next=n;
        }
        
        curr=head;
        prev=null;
        nex=head.next;
         while(nex!=null)
        {
            
            curr.next=prev; 
            prev=curr;  
            curr=nex;
            nex=nex.next;
            
        }
        curr.next=prev;
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
        head=add(head,1);
        head=add(head,2);
        head=add(head,3);
        head=add(head,4);
        head=add(head,5);
        head=print(head);
        head=addOne(head);
        head=print(head);
        in.close();
    }
}
