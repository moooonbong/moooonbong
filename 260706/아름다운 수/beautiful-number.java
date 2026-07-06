import java.util.*;
public class Main {
    static int[] value = {1, 22, 333, 4444};
    static List<Integer> list;
    static int count;

    static void dfs(int n, int depth){
        if (n == depth){
            count++;
            return;
        }

        for (int x=0; x<value.length; x++){
            if (depth + (x+1) > n) continue;

            list.add(value[x]);
            dfs(n, depth + (x+1));
            list.remove(list.size()-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        list = new ArrayList<>();
        count = 0;

        dfs(n, 0);

        System.out.println(count);
    }
}