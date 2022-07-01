import java.util.Scanner;

public class MaxdiffTaste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i,b;
        for(i=0;i<n;i++)
        {
            int a=sc.nextInt();    // highest integer
            int sum=sc.nextInt();     //sum value
            if(a>sum)
            {
                System.out.println(sum);
            }
            else if(sum>a)
            {
                System.out.println((a*2)-sum);
            }
            else{
                System.out.println(a);
            }
        }
    }
}
