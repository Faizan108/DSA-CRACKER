import java.util.*;
class job_sequencing {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int ar[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            ar[i][0]=in.nextInt();
            ar[i][1]=in.nextInt();
            ar[i][2]=in.nextInt();
        }
        Arrays.sort(ar,(a,b)->b[2]-a[2]);
        int count=0;
        int pr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(ar[i][1]>max)
            {
                max=ar[i][1];
            }
        }
        int time[]=new int[max+1];
        for(int i=0;i<max+1;i++)
        {
            time[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=ar[i][1];j>0;j--)
            {
                if(time[j]==0)
                {
                    time[j]=1;
                    count++;
                    pr+=ar[i][2];
                    break;
                }
            }
            
        }
        int num[]=new int[2];
        num[0]=count;
        num[1]=pr;
        for(int i:num)
        {
            System.out.print(i+" ");
        }
        in.close();
    }
}
