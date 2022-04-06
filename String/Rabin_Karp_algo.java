import java.util.*;
class Rabin_Karp_algo {
    public static long hash_function(String st)
    {
        long hash=0;
        int l=st.length();
        for(int i=l-1;i>=0;i--)
        {
            hash=hash+(long)(st.charAt(i)*Math.pow(10,l-i-1));
        }
        return hash;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String str=in.next();
        int n=s.length();
        int m=str.length();
        long str_h=hash_function(str);
        long s_h=hash_function(s.substring(0,m));
        
        if(str_h==s_h)
        {
            System.out.println("Pattern found at index 0");
        }
      
        for(int i=1;i<n-m;i++)
        {
            s_h=((s_h-(long)(s.charAt(i-1)*Math.pow(10,m+i-(i+1))))*10)+s.charAt(i-1+m);
            
            if(s_h==str_h)
            {
                System.out.println("Pattern found at index "+i);
            }
        }
        
    
    in.close();
    }

}
