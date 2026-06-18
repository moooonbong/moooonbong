import java.util.*;

public class Main {
    static boolean check(int m, int d){
        List<Integer> month = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,6, 7, 8, 9, 10, 11, 12));
        List<Integer> date = new ArrayList<>(Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));
        
        if (month.contains(m)){
            int value = date.get(m-1);
            if (d > value || d < 0)
                return false;
        }
        else {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        if (check(m, d))
            System.out.println("Yes");
        else    
            System.out.println("No");
    }
}