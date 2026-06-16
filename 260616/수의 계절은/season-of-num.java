import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if (y >= 3 && y <= 5)
            System.out.println("Spring");
        else if (y >= 6 && y <= 8)
            System.out.println("Summer");
        else if (y >= 9 && y <= 11)
            System.out.println("Fall");
        else 
            System.out.println("Winter");
    }
}