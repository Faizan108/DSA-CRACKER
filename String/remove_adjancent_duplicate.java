import java.util.*;
class remove_adjacent_duplicate{
    public static String removeConsecutiveCharacter(String S){
        String res="";
        if(S.length()==0||S.length()==1)
        {
            return S;
        }
        res=removeConsecutiveCharacter(S.substring(0,S.length()-1));
        if(res.charAt(res.length()-1)!=S.charAt(S.length()-1))
        {
            res=res+S.charAt(S.length()-1);
            return res;
        }
        else{
            return res;
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String st="";
        st=removeConsecutiveCharacter(s);
        System.out.println(st);
        in.close();
    }
}