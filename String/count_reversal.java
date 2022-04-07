import java.util.*;
class count_reversal {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int n=s.length();
        int left=0;
        int right=0;
        int count=0;
       
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c=='{'&&right<=0)
            {
                right++;
            }
            else if(c=='}'&&right<=0){
                left++;
            }
            else if(c=='{')
            {
                right++;
            }
            else{
                right--;
            }
        }
        if((left+right)%2!=0)
        {
            System.out.println(-1);
        }
        else{
            count=left/2;
            count+=right/2;
           if(left<right)
           {
               if(right%2!=0)
               {
                   count+=2;
               }
           }
           else{
               if(left%2!=0)
               {
                   count+=2;
               }
           }
           System.out.println(count);
        }
        in.close();
    }
}
