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
class height_of_tree{
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
    static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String args[])
    {
        Node root=null;
        root=createtree();
        inorder(root);
        System.out.println(height(root));
    }
}