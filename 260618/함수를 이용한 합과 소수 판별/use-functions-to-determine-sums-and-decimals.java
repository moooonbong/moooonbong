import java.util.*;

public class Main {
    static int func(int a, int b){
        int count = 0;

        for (int x=a; x<=b; x++){
            int target = x;
            boolean flag = true;

            for (int y=2; y<=Math.sqrt(target); y++){
                if (target % y == 0){
                    flag = false;
                    break;
                }
            }

            if (flag){
                if (((target / 10) + (target % 10)) % 2 == 0)
                    count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(func(a, b));
        
    }
}