import java.util.*;

public class Main {
    static int check(int a, int b){
        int count = 0;
        for (int x=a; x<=b; x++){
            if (x % 2 == 0 || x % 10 == 5 || (x % 3 == 0 && x % 9 != 0))
            {
                continue;
            }
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(check(a, b));
    }
}