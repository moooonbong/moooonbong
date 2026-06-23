import java.util.Scanner;
public class Main {
    static void check(boolean[] arr, String a){
        int count = 0;
        for (int x=0; x<a.length(); x++){
            if (!arr[a.charAt(x)-'a'])
            {
                arr[a.charAt(x)-'a'] = true;
                count++;
            }
        }

        if (count >= 2)
            System.out.println("Yes");
        else 
            System.out.println("No");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        boolean[] arr = new boolean[26];

        check(arr, A);   
    }
}