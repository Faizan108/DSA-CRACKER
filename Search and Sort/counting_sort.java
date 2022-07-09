import java.util.*;
class counting_sort {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            a[arr[i]]+=1;
        }
        for(int i=0;i<100;i++)
        {
            if(a[i]!=0)
            {
                for(int j=0;j<a[i];j++)
                {
                    System.out.print(i+" ");
                }
            }
        }
        in.close();
    }
}
