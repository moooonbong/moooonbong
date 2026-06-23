import java.util.*;

public class Main {
    static void func (int depth, int enter){
        if (depth == enter){
            return;
        }

        System.out.println("HelloWorld");

        func(depth+1, enter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int enter = sc.nextInt();

        func(0, enter);
        
    }
}