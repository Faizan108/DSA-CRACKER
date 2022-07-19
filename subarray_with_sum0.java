import java.util.*;
class subarray_with_sum0{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        HashSet<Integer> h=new HashSet<>();
        int sum=0;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==0||h.contains(sum))
            {
                flag=1;
            }
            h.add(sum);
        }
        if(flag==1)
        {
            System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                    in.close();
    }
}