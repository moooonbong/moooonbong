import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int value = a/b;

        System.out.print(value + ".");

        int index = a % b;

        for (int x=0; x<20; x++){
            if (index < b){
                index *= 10;
            }

            System.out.print(index/b);

            index = index % b;
        }

    }
}