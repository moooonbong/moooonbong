import java.util.*;

public class Main {
    static class User {
        String id;
        int level;

        User(String id, int level){
            this.id = id;
            this.level = level;

            System.out.println("user " + id + " lv " + level);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        User user1 = new User("codetree", 10);
        User user2 = new User(id, level);
    }
}