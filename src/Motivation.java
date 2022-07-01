import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int in=sc.nextInt();
        int i;
        for(i=0;i<in;i++)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int imd =0;
            for(int j=0;j<n;j++){
                int space=sc.nextInt();

                int a =sc.nextInt();
                if(a>imd && space<=x){
                    imd=a;
                }

            }
            System.out.println(imd);


        }
    }
}
