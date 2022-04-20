import java.util.*;
class isomorphic_strings {
    public static boolean areIsomorphic(String str1,String str2)
    {
        HashMap<Character,Character> h=new HashMap<Character,Character>();
        int n1=str1.length();
        int n2=str2.length();
        if(n1!=n2)
        {
            return false;
        }
        for(int i=0;i<n1;i++)
        {
            if(h.containsKey(str1.charAt(i)))
            {
                if(h.get(str1.charAt(i))!=str2.charAt(i))
                {
                    return false;
                }
            }
            else if(h.containsValue(str2.charAt(i)))
            {
                return false;
            }
            else{
                h.put(str1.charAt(i),str2.charAt(i));
            }
        }
        return true;
        
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        if(areIsomorphic(s1,s2))
        {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        in.close();
    }
}
