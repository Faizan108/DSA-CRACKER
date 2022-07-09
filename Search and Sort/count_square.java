import java.util.*;
class count_square {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=1;
        int count=0;
        while(i*i<n)
        {
            count++;
            i++;
        }
        System.out.println(count);
        in.close();
    }
}
