import java.util.*;
class permutation_of_string {
    public static String swap(String s,int l,int i)
    {
        String st="";
        for(int k=0;k<s.length();k++)
        {
            if(k==l)
            {
                st+=s.charAt(i);
            }
            else if(k==i)
            {
                st+=s.charAt(l);
            }
            else{
                st+=s.charAt(k);
            }
        }
        return st;
    }
    public static List<String> permutation(String s,int l,int r,List<String> list)
    {
        if(l==r)
        {
            list.add(s);
            return list;
        }
        else{
            for(int i=l;i<r;i++)
            {
                s=swap(s,l,i);
                list=permutation(s,l+1,r,list);
                s=swap(s,l,i);
            }
        }
        return list;
    }
    public static void find_permutation(String S) {
       List<String> list=new ArrayList<String>();
       list=permutation(S,0,S.length(),list);
       Collections.sort(list);
       for(String s:list)
       {
           System.out.print(s+" ");
       }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        find_permutation(s);
        in.close();
    }
}
