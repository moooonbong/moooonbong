import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int x=1; x<=N; x++){
            for (int y=0; y<x+2; y++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}