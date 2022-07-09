import java.util.*;
class first_last{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int x=in.nextInt();
        ArrayList<Integer> l=new ArrayList<Integer>();
        int lb=0;
        int ub=n-1;
        int mid=0;
        int first=-1;
        int last=-1;
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(arr[mid]>x)
            {
                ub=mid-1;
            }
            if(arr[mid]<x)
            {
                lb=mid+1;
            }
            if(arr[mid]==x)
            {
                first=mid;
                ub=mid-1;
            }
        }
        lb=0;
        ub=n-1;
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(arr[mid]>x)
            {
                ub=mid-1;
            }
            if(arr[mid]<x)
            {
                lb=mid+1;
            }
            if(arr[mid]==x)
            {
                last=mid;
                lb=mid+1;
            }
        }
        l.add(first);
        l.add(last);
        System.out.println(l);
        in.close();
    }
}