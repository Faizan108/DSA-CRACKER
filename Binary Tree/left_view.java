import java.util.*;
class Node{
    int data;
    Node left,right;
     Node(int data)
     {
        this.data=data;
        right=null;
        left=null;
     }
}
class left_view {
    static Scanner in=new Scanner(System.in);
    public static Node createtree()
    {
        Node root=null;
        int d=in.nextInt();
        if(d==-1)
        {
            return null;
        }
        root=new Node(d);
        System.out.println("Enter left child of "+d);
        root.left=createtree();
       System.out.println("Enter the right child of "+d);
       root.right=createtree();
       return root;
    }
   static void leftv(Node root,ArrayList<Integer> l,int level)
    {
        if(root==null)
        {
            return;
        }
        if(l.size()==level)
        {
            l.add(root.data);
        }
        leftv(root.left,l,level+1);
        leftv(root.right,l,level+1);
    }
    //Function to return list containing elements of left view of binary tree.
   
    public static void main(String args[])
    {
        Node root=null;
        root=createtree();
        ArrayList<Integer> list=new ArrayList<>();
        leftv(root,list,0);
        System.out.println(list);
    }
}
