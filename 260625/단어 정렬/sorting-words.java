import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        String[] word = new String[length];
        
        for (int x=0; x<length; x++){
            word[x] = sc.next();
        }

        Arrays.sort(word);

        for (int x=0; x<length; x++){
            System.out.println(word[x]);
        }
    }
}