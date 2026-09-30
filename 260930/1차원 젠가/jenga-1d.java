import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();

        // Please write your code here.
        List<Integer> list = new ArrayList<>();

        for (int x=0; x<n; x++){
            list.add(blocks[x]);
        }

        for (int x=0; x<e1-s1+1; x++){
            list.remove(s1-1);
        }
        for (int x=0; x<e2-s2+1; x++){
            list.remove(s2-1);
        }

        System.out.println(list.size());

        for (int x=0; x<list.size(); x++){
            System.out.println(list.get(x));
        }

    }
}