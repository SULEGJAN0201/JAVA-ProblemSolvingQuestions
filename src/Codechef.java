import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter no of cases:");
        Scanner s = new Scanner(System.in);
        x=s.nextInt();
        System.out.println("Enter the values:");
        for (int i=0;i<x;i++){

            int a =s.nextInt();
            int b =s.nextInt();
            if (a==b){
                System.out.println("ANY");
            }
            else if(a>b){
                System.out.println("FIRST");
            }
            else{
                System.out.println("SECOND");
            }
        }
    }

}
