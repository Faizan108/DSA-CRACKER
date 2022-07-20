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
class Pair{
    int hd;
    Node node;
    public Pair(int hd,Node node)
    {
        this.hd=hd;
        this.node=node;
    }
}
class top_view {
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
    static ArrayList<Integer> topView(Node root)
    {
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty())
        {
            Pair curr=q.poll();
            if(!map.containsKey(curr.hd))
            {
                map.put(curr.hd,curr.node.data);
            }
            if(curr.node.left!=null)
            {
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null)
            {
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:map.values())
        {
            l.add(i);
        }
        return l;
    }
    public static void main(String args[])
    {
        Node root=null;
        root=createtree();
        System.out.println(topView(root));
    }
}
