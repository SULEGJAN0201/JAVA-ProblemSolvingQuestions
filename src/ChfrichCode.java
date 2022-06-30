import java.util.Scanner;

public class ChfrichCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x =s.nextInt();
        while (x!=0){
         int a =s.nextInt();
         int b =s.nextInt();
         int c =s.nextInt();
         int ans;
         if(a>b) {
             ans = (a - b) / c;
         } else if (b>a) {
             ans = (b - a) / c;
         }
         else
         {
             ans=0;
         }
            System.out.println(ans);

            x--;
        }

    }
}
