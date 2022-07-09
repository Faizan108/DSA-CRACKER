import java.util.*;
class fixed_point {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==i+1)
            {
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
        in.close();
    }
}
