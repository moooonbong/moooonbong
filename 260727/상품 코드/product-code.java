import java.util.Scanner;
public class Main {
    static class Product {
        String name; 
        int code;

        Product(String name, int code){
            this.name = name;
            this.code = code;
            System.out.println("product " + code + " is " + name);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();

        Product product1 = new Product("codetree", 50);

        Product product2 = new Product(id2, code2);
    }
}