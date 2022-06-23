import java.util.*;
class activity_selection{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
        }
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int fr=arr[0][1];
        int count=1;
        for(int i=0;i<n;i++)
        {
            if(fr<arr[i][0])
            {
                count++;
                fr=arr[i][1];
            }
        }
        System.out.println(count);
        in.close();
    }
}