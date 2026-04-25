import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] word = {"apple", "banana", "grape", "blueberry", "orange"};

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int count = 0;

        for (String w : word){
            if (w.charAt(2)== a.charAt(0) || w.charAt(3)== a.charAt(0)){
                System.out.println(w);
                count++;
            }
        }
        System.out.println(count);
    }
}