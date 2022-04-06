import java.util.*;
class Min_Flips {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String S=in.nextLine();
        int count1=0;
        int count2=0;
       for(int i=0;i<S.length();i++)
       {
           if(i%2==0)
           {
               if(S.charAt(i)!='0')
               {
                   count1++;
               }
           }
           else{
               if(S.charAt(i)!='1')
               {
                   count1++;
               }
           }
       }
       for(int i=0;i<S.length();i++)
       {
           if(i%2==0)
           {
               if(S.charAt(i)!='1')
               {
                   count2++;
               }
           }
           else{
               if(S.charAt(i)!='0')
               {
                   count2++;
               }
           }
       }
       System.out.println(Math.min(count1,count2));
       in.close();
    }
}
