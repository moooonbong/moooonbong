import java.util.*;

public class Main {
    static int primeSum(int a, int b){
        int sum = 0;

        for (int x=a; x<=b; x++){
            int target = x;
            boolean flag = false;
            int count = 0;
            for (int y=2; y<=Math.sqrt(target); y++){
                if (target % y == 0){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                sum+= target;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(primeSum(a, b));
    }
}