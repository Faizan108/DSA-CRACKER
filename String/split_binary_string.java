import java.util.*;
class split_binary_string {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int n=s.length();
        int c0=0;
        int c1=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='0')
            {
                c0++;
            }
            else{
                c1++;
            }
            if(c0==c1)
            {
                c0=0;
                c1=0;
                res++;
            }
        }
        if(res==0)
        {
            System.out.println(-1);
        }
        else{
            System.out.println(res);
        }
        in.close();
       
    }
}
