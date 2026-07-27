import java.util.*;

public class Main {
    static class Student implements Comparable<Student>{
        int number;
        int height;
        int weight;

        Student(int number,int height, int weight){
            this.number = number;
            this.height = height;
            this.weight = weight;
        }

        public void show(){
            System.out.println(height + " " + weight + " " + number);
        }

        @Override
        public int compareTo(Student student){
            if (this.height == student.height){
                if (this.weight == student.weight){
                    return Integer.compare(this.number, student.number);
                }
                else {
                    return Integer.compare(student.weight, this.weight);
                }
            }

            return Integer.compare(student.height, this.height);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] student = new Student[n];

        for (int x=0; x<n; x++){
            int height = sc.nextInt();
            int weight = sc.nextInt();

            student[x] = new Student(x + 1,height, weight);
        }

        Arrays.sort(student);

        for (int x=0; x<n; x++){
            student[x].show();
        }
    }
}