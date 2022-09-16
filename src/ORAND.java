import java.util.Scanner;

public class ORAND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv en siffra");
        int a = 6;
        int b = 4;
        int c = 5;
        boolean isTired = true;

        System.out.println( a > b && b < c );
        System.out.println(!(a < 5 && c < 10));
        System.out.println(a < 5 || a < 4);
        System.out.println(a > b ||false);
        System.out.println(true);

        if (a == b){
            System.out.println("a är mindre än b");
        }



    }
}