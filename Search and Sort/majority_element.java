import java.util.*;
class majority_element {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int count=0;
        int maj=-1;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                maj=a[i];
                count++;
            }
            else if(a[i]!=maj)
            {
                count--;
            }
            else{
                count++;
            }
        }
        count=0;
        for(int i=0;i<n;i++)
        {
            if(maj==a[i])
            {
                count++;
            }
        }
        if(count>n/2)
        {
            System.out.println(maj);
        }
        else{
            System.out.println(-1);
        }
        in.close();
    }
}
