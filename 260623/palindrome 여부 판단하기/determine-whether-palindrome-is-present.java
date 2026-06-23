import java.util.*;

public class Main {
    static String func(String enter){
        StringBuilder sb = new StringBuilder(enter);

        sb.reverse();

        if (enter.equals(sb.toString())){
            return "Yes";
        } else
            return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String enter = sc.next();

        System.out.println(func(enter));
    }
}