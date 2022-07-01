import java.util.Scanner;

public class DoseTakenDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            int d=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(d>=l && d<=r)
            {
                System.out.println("Take second dose now");
            }
            else if(d>r)
            {
                System.out.println("Too Late");
            }
            else{
                System.out.println("Too Early");
            }
        }
    }
}


