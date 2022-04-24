import java.util.*;
class balanced_paranthesis {
    static boolean ispar(String x)
    {
        Stack<Character> s=new Stack();
        if(x.length()==1)
        {
            return false;
        }
        s.push('1');
        // s.push(x.charAt(0));
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch=='{'||ch=='['||ch=='(')
            {
                s.push(ch);
            }
            if(ch=='}')
            {
                if(s.peek()=='{')
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
            if(ch==']')
            {
                if(s.peek()=='[')
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
            if(ch==')')
            {
                if(s.peek()=='(')
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.peek()=='1')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String x=in.next();
        if(ispar(x))
        {
            System.out.println("Balanced");
        }
        else{
            System.out.println("not balanced");
        }
        in.close();
    }
}
