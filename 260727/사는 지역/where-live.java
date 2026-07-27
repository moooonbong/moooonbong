import java.util.*;

public class Main {
    static class Person{
        String name;
        String add;
        String city;

        Person(String name, String add, String city){
            this.name = name;
            this.add = add;
            this.city = city;
        }

        void show(){
            System.out.println("name " + this.name + "\n" + "addr " + add + "\n" + "city " + city);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Person> queue = new PriorityQueue<>((a, b) -> b.name.compareTo(a.name));

        for (int x=0; x<n; x++){
            String name = sc.next();
            String add = sc.next();
            String city = sc.next();

            Person person = new Person(name, add, city);
            queue.add(person);
        }

        Person last = queue.poll();
        last.show();

    }
}