import java.util.*;

public class Main {
    static class Person implements Comparable<Person>{
        int index;
        String name;
        int height;
        double weight;

        Person(int index, String name, int height, double weight){
            this.index = index;
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public void show(){
            System.out.printf(name + " " + height + " " + "%.1f", weight);
            System.out.println();
        }

        @Override
        public int compareTo(Person person){
            if (this.index % 2 == 1){
                return this.name.compareTo(person.name);
            }
            else {
                return Integer.compare(person.height, this.height);
            }
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        Person[] person = new Person[5];
        Person[] other = new Person[5];

        int index = 1;
        for (int x=0; x<5; x++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            person[x] = new Person(index++, name, height, weight);
            other[x] = new Person(index++, name, height, weight);
        }

        Arrays.sort(person);
        Arrays.sort(other);

        System.out.println("name");
        for (int x=0; x<5; x++){
            person[x].show();
        }
        System.out.println();

        System.out.println("height");
        for (int x=0; x<5; x++){
            other[x].show();
        }
    }
}