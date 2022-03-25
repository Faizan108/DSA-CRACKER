import java.util.*;
class Roman_to_Integer {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int sum=0;
        int curr=0;
        int last=Integer.MAX_VALUE;
    
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='I')
            {
                curr=1;
               
            }
            else if(c=='V')
            {
                curr=5;
            }
            else if(c=='X')
            {
                curr=10;
            }
            else if(c=='L')
            {
                curr=50;
            }
            else if(c=='C')
            {
                curr=100;
            }
            else if(c=='D')
            {
                curr=500;
            }
            else
            {
                curr=1000;
            }
            if(last>=curr)
            {
                sum=sum+curr;
                last=curr;
            }
            else
            {
                sum=sum-last;
                sum=sum+curr-last;
                last=curr;
                
            }
        }
        System.out.println(sum);
        in.close();
        
    }
}
