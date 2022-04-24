import java.util.*;
class print_anagram {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String string_list[]=new String[n];
        for(int i=0;i<n;i++)
        {
            string_list[i]=in.next();
        }
        List<List<String>> res=new ArrayList<List<String>>();
       List<String> s=new ArrayList<String>();
       for(int i=0;i<string_list.length;i++)
       {
           char c[]=string_list[i].toCharArray();
           Arrays.sort(c);
           
           String v=new String(c);
           s.add(v);
       }
       for(int i=0;i<s.size();i++)
       {
           List<String> st=new ArrayList<String>();
           if(s.get(i).equals(""))
           {
               continue;
           }
           st.add(string_list[i]);
           for(int j=i+1;j<s.size();j++)
           {
               if(s.get(i).equals(s.get(j)))
               {
                   st.add(string_list[j]);
                   s.set(j,"");
               }
           }
           res.add(st);
       }
       for(List<String> i:res)
       {
           System.out.println(i);
       }
       in.close();
    }
}
