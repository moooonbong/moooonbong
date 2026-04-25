import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int count = 0;

        for (int x=1; x<=input; x++){
            if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0)
                continue;
            count++;
        }
        System.out.println(count);
    }
}