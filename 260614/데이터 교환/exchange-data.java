public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5;
        int b = 6;
        int c = 7;

        int temp = c;

        c = b;
        b = a;
        a = temp;

        System.out.println(a + "\n" + b + "\n" + c);
    }
}