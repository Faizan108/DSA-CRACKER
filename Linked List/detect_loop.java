import java.util.*;
class detect_loop {
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
    public static boolean detectLoop(node head){
        while(head!=null)
        {
            if(head.data==0)
            {
                return true;
            }
            head.data=0;
            head=head.next;
        }
        return false;
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
        System.out.println(detectLoop(head));
        in.close();
    }
}
