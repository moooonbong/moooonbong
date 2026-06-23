import java.util.*;

public class Main {
    static int func(String a, String b){
        if (a.contains(b)){
            return a.indexOf(b);
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(func(a, b));
    }
}