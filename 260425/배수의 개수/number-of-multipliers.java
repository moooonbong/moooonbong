import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;

        for (int x=0; x<10; x++){
            int number = sc.nextInt();

            if (number % 3 == 0){
                count1++;
            }
            if (number % 5 == 0){
                count2++;
            }
        }
        System.out.println(count1 + " " + count2);
    }
}