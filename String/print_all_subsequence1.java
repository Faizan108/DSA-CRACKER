import java.util.*;
class print_all_subsequence1 {
    public static void subsequence(String s,int i,int n,String st,List<String> list)
    {
        if(i==n)
        {
            if(!list.contains(st))
            {
                list.add(st);
            }
            return;
        }
        else{
            subsequence(s,i+1,n,st+s.charAt(i),list);
            subsequence(s,i+1,n,st,list);
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String st=in.next();
        int n=st.length();
        String s="";
        List<String> list=new ArrayList<String>();
        subsequence(st,0,n,s,list);
        for(String i:list)
        {
            System.out.print(i+" ");
        }
        in.close();
    }
}
