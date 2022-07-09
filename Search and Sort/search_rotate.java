import java.util.*;
class search_rotate {
    public static int search(int[] arr, int x) {
        int n=arr.length;
           int lb=0;
           int ub=n-1;
           int mid=0;
           while(lb<=ub)
           {
               mid=(ub+lb)/2;
               if(arr[mid]==x)
               {
                   return mid;
               }
               else if(arr[mid]>=arr[lb])
               {
                   if(arr[lb]<=x&&arr[mid]>=x)
                   {
                       ub=mid-1;
                   }
                   else{
                       lb=mid+1;
                   }
               }
               else if(arr[mid]<=arr[ub])
               {
                   if(arr[mid]<=x&&arr[ub]>=x)
                   {
                       lb=mid+1;
                   }
                   else{
                       ub=mid-1;
                   }
               }
              
           }
           return -1;
       }
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
        System.out.println(search(arr,x));
        in.close();
    }
}
