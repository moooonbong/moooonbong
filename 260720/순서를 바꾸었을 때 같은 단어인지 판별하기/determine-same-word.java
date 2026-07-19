import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();

        if (first.length() != second.length()){
            System.out.println("No");
            return;
        }
            
        int length = first.length();

        char[] arr = new char[length];
        char[] brr = new char[length];

        for (int x=0; x<length; x++){
            arr[x] = first.charAt(x);
            brr[x] = second.charAt(x);
        }

        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int x=0; x<length; x++){
            if (arr[x] != brr[x]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}