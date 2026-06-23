import java.util.*;

public class Main {
    static class Node{
        int value;

        Node(int value){
            this.value = value;
        }
    }
    static void func(Node at, Node bt){
        if (at.value > bt.value){
            at.value *= 2;
            bt.value += 10;
        }
        else {
            at.value += 10;
            bt.value *= 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Node at = new Node(a);
        Node bt = new Node(b);

        func(at, bt);

        System.out.println(at.value + " " + bt.value);
    }
}