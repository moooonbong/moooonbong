import java.util.*;

public class Main {
    static class Student implements Comparable<Student>{
        String name;
        int height;
        int weight;

        Student(String name, int height, int weight){
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public void show(){
            System.out.println(name + " " + height + " " + weight);
        }

        @Override 
        public int compareTo(Student student){
            if (this.height < student.height){
                return -1;
            } else if (this.height > student.height){
                return 1;
            } else 
                return 0;
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] student = new Student[n];

        for (int x=0; x<n; x++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            student[x] = new Student(name, height, weight);
        }

        Arrays.sort(student);

        for (int x=0; x<n; x++){
            student[x].show();
        }
    }
}