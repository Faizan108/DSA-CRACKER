import java.util.*;
class next_permutation {
    public static int[] sort(int arr[],int lb,int ub)
    {
        int a[]=new int[ub+1-lb];
        int k=0;
        for(int i=lb;i<=ub;i++)
        {
            a[k++]=arr[i];
        }
        Arrays.sort(a);
        k=0;
        for(int i=lb;i<=ub;i++)
        {
            arr[i]=a[k++];
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N];
        for(int s=0;s<N;s++)
        {
            arr[s]=in.nextInt();
        }
        int i=N-1;
        List<Integer> list=new ArrayList<Integer>();
        while(i>0)
        {
            if(arr[i]<=arr[i-1])
            {
                i--;
                if(i==0)
                {
                    Arrays.sort(arr);
                }
            }
            else{
                int l=i;
                for(int k=i;k<N;k++)
                {
                    if(arr[k]<arr[l]&&arr[k]>arr[i-1])
                    {
                        l=k;
                    }
                }
                int v=arr[l];
                arr[l]=arr[i-1];
                arr[i-1]=v;
                arr=sort(arr,i,N-1);
                break;
            }
        }
        for(int j:arr)
        {
            list.add(j);
        }
        
        System.out.println(list);
        in.close();
    }
}
