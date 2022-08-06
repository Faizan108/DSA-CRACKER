import java.util.*;
class rat_in_maze{
    public static void paths(int arr[][],int i,int j,int n,String str,int a[][],ArrayList<String> l)
    {
        
        if(i<0||j<0||j>=n||i>=n)
        {
            return;
        }
        if(arr[i][j]==0)
        {
            return;
        }
        if(a[i][j]==1)
        {
            return;
        }
        if(i==n-1&&j==n-1)
        {
           l.add(str);
            return;
        }
        if(arr[i][j]==1)
        {
            a[i][j]=1;
            paths(arr,i,j+1,n,str+"R",a,l);
            paths(arr,i+1,j,n,str+"D",a,l);
            paths(arr,i-1,j,n,str+"U",a,l);
            paths(arr,i,j-1,n,str+"L",a,l);
            a[i][j]=0;
        }
       
    }
   public static void main(String[] args)
   {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=in.nextInt();
        }
    }
    ArrayList<String> l=new ArrayList<>();
        int a[][]=new int[n][n];
        paths(arr,0,0,n,"",a,l);
        if(l.size()==0)
        {
            l.add("-1");
        
        }
        System.out.println(l);
        in.close();
   }
}