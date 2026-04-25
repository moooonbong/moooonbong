import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int x=1; x<=input; x++){
            for (int y=1; y<=x; y++){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}