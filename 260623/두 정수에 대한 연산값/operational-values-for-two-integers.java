import java.util.Scanner;

public class Main {
    static class Value {
        int value;

        Value(int value){
            this.value = value;
        }
    }

    static void func(Value at, Value bt){
        if (at.value > bt.value){
            at.value += 25;
            bt.value *= 2;
        } else{
            at.value *= 2;
            bt.value += 25;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Value at = new Value(a);
        Value bt = new Value(b);
        func(at, bt);

        System.out.println(at.value + " " + bt.value);
    }
}