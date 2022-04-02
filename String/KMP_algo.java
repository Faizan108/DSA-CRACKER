import java.util.*;
class KMP_algo {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int len=s.length();
       int arr[]=new int[len];
       int i=0;
       int j=1;
       arr[0]=0;
       while(j<len)
       {
           if(s.charAt(j)==s.charAt(i))
           {
               arr[j]=i+1;
               i++;
               j++;
           }
           else{
               if(i!=0)
               {
                   i=arr[i-1];
               }
               else{
               arr[j]=0;
               
               j++;
               }
           }
       }
       System.out.println(arr[len-1]);
       in.close();
    }
}
