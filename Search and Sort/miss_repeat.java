import java.util.*;
class miss_repeat {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int a[]=new int[2];
            for(int i=0;i<n;i++)
            {
                if(arr[Math.abs(arr[i])-1]<0)
                {
                    a[0]=Math.abs(arr[i]);
                }
                else{
                    
                arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
                }
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i]>0)
                {
                    a[1]=i+1;
                }
            }
            for(int j:a)
            {
                System.out.print(j+" ");
            }
        in.close();
    }
}
