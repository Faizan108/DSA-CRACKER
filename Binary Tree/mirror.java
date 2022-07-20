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
class mirror {
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
    static void levelOrder(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
    }
    static Node invertTree(Node root)
    {
        Node newnode=null;
        if(root==null)
        {
            return null;
        }
        newnode=new Node(root.data);
        newnode.left=invertTree(root.right);
        newnode.right=invertTree(root.left);
        return newnode;
    }
    public static void main(String args[])
    {
        Node root=null;
        root=createtree();
        Node node=null;
        node=invertTree(root);
        levelOrder(node);
    }
}
