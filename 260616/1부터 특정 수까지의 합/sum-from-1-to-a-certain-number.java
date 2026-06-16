import java.util.*;

public class Main {
    static int func(int a){
        int sum = 0;
        
        for (int x=1; x<=a; x++){
            sum+=x;
        }

        return sum;
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        System.out.println(func(sc.nextInt()) / 10);
    }
}